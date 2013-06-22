/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.config;

import se.bassac.roster.service.AthleteService;
import se.bassac.roster.web.AthleteLeaf;
import com.wadpam.gaelic.GaelicConfig;
import com.wadpam.gaelic.GaelicServlet;
import com.wadpam.gaelic.Node;
import com.wadpam.gaelic.dao.DAppDomainDao;
import com.wadpam.gaelic.domain.DAppDomain;
import com.wadpam.gaelic.oauth.dao.DConnectionDao;
import com.wadpam.gaelic.oauth.service.ConnectionServiceImpl;
import com.wadpam.gaelic.oauth.service.OAuth2ServiceImpl;
import com.wadpam.gaelic.oauth.web.ConnectionConverter;
import com.wadpam.gaelic.oauth.web.OAuth2Interceptor;
import com.wadpam.gaelic.oauth.web.OAuth2Leaf;
import com.wadpam.gaelic.security.DomainSecurityInterceptor;
import com.wadpam.gaelic.security.SecurityConfig;
import com.wadpam.gaelic.service.AppDomainService;
import com.wadpam.gaelic.tree.AppDomainLeaf;
import com.wadpam.gaelic.tree.DomainNamespaceInterceptor;
import com.wadpam.gaelic.tree.Interceptor;
import com.wadpam.gaelic.web.MardaoPrincipalInterceptor;
import java.util.Collection;
import java.util.Map;
import javax.servlet.ServletConfig;
import net.sf.mardao.core.dao.DaoImpl;
import se.bassac.roster.dao.DAthleteDao;
import se.bassac.roster.dao.DCheckpointDao;
import se.bassac.roster.dao.DCheckpointDaoBean;
import se.bassac.roster.dao.DClassDao;
import se.bassac.roster.dao.DClassDaoBean;
import se.bassac.roster.dao.DMilestoneDao;
import se.bassac.roster.dao.DMilestoneDaoBean;
import se.bassac.roster.dao.DOrganizerDao;
import se.bassac.roster.dao.DOrganizerDaoBean;
import se.bassac.roster.dao.DParticipantDao;
import se.bassac.roster.dao.DParticipantDaoBean;
import se.bassac.roster.dao.DPassageDao;
import se.bassac.roster.dao.DPassageDaoBean;
import se.bassac.roster.dao.DRaceDao;
import se.bassac.roster.dao.DRaceDaoBean;
import se.bassac.roster.dao.DSeriesDao;
import se.bassac.roster.dao.DSeriesDaoBean;
import se.bassac.roster.dao.DTimingsDao;
import se.bassac.roster.dao.DTimingsDaoBean;
import se.bassac.roster.dao.DTrackDao;
import se.bassac.roster.domain.DAthlete;
import se.bassac.roster.domain.DCheckpoint;
import se.bassac.roster.domain.DClass;
import se.bassac.roster.domain.DMilestone;
import se.bassac.roster.domain.DOrganizer;
import se.bassac.roster.domain.DParticipant;
import se.bassac.roster.domain.DPassage;
import se.bassac.roster.domain.DRace;
import se.bassac.roster.domain.DSeries;
import se.bassac.roster.domain.DTimings;
import se.bassac.roster.domain.DTrack;
import se.bassac.roster.service.RosterService;
import se.bassac.roster.service.TrackService;
import se.bassac.roster.web.EnterLeaf;
import se.bassac.roster.web.TrackLeaf;

/**
 *
 * @author sosandstrom
 */
public class AppConfig implements GaelicConfig, SecurityConfig {

    @Override
    public Node init(GaelicServlet gaelicServlet, ServletConfig servletConfig) {
        
        // DAO beans
        final Map<Class, DaoImpl> DAO_MAP = se.bassac.roster.dao.DaoConfig.createDaos();

        // conventional services
        ConnectionServiceImpl connectionService = new ConnectionServiceImpl();
        DConnectionDao connectionDao = connectionService.getDao();
        
        AthleteService athleteService = new AthleteService();
        athleteService.setDao((DAthleteDao) DAO_MAP.get(DAthlete.class));
        AthleteLeaf athleteLeaf = new AthleteLeaf();
        
        OAuth2ServiceImpl oauth2Service = new OAuth2ServiceImpl();
        oauth2Service.setConnectionDao(connectionDao);
        oauth2Service.setOauth2UserService(athleteService);
        
        AppDomainService appDomainService = new AppDomainService();
        AppDomainLeaf appDomainLeaf = new AppDomainLeaf();
        
        ConnectionConverter connectionConverter = new ConnectionConverter(athleteService.getDao());
        
        OAuth2Leaf oauth2Leaf = new OAuth2Leaf();
        oauth2Leaf.setService(oauth2Service);
        
        // Interceptors
        DomainSecurityInterceptor basicInterceptor = new DomainSecurityInterceptor();
        basicInterceptor.setSecurityDetailsService(appDomainService);
        
        DomainNamespaceInterceptor domainNamespaceInterceptor = new DomainNamespaceInterceptor();
        
        OAuth2Interceptor oauth2Interceptor = new OAuth2Interceptor();
        oauth2Interceptor.setConnectionService(connectionService);
        oauth2Interceptor.setOauth2Service(oauth2Service);
        
        initSecurity(basicInterceptor, oauth2Interceptor);
        BUILDER.root()
                .interceptor("api", basicInterceptor)
                .interceptor("api", domainNamespaceInterceptor)
                .interceptor("api", oauth2Interceptor)
                .interceptedPath("api", new MardaoPrincipalInterceptor())
                    .path(Node.PATH_DOMAIN)
                        .path("_admin")
                            .path("domain")
                                .crud("v10", appDomainLeaf, appDomainService)
                        .from("_admin")
                            .path("profile")
                                .crud("v10", athleteLeaf, athleteService)
                    .from(Node.PATH_DOMAIN)
                        .path("federated")
                            .add("v11", oauth2Leaf);
        
        // Application Resources
        
        final TrackService trackService = new TrackService();
        trackService.setDao((DTrackDao) DAO_MAP.get(DTrack.class));
        TrackLeaf trackLeaf = new TrackLeaf();
        
        final RosterService rosterService = new RosterService(
                appDomainService.getDao(),
                (DAthleteDao) DAO_MAP.get(DAthlete.class),
                (DCheckpointDao) DAO_MAP.get(DCheckpoint.class),
                (DClassDao) DAO_MAP.get(DClass.class),
                (DMilestoneDao) DAO_MAP.get(DMilestone.class),
                (DOrganizerDao) DAO_MAP.get(DOrganizer.class),
                (DParticipantDao) DAO_MAP.get(DParticipant.class),
                (DPassageDao) DAO_MAP.get(DPassage.class),
                (DRaceDao) DAO_MAP.get(DRace.class),
                (DSeriesDao) DAO_MAP.get(DSeries.class),
                (DTimingsDao) DAO_MAP.get(DTimings.class),
                (DTrackDao) DAO_MAP.get(DTrack.class));
        rosterService.init();
        
        EnterLeaf enterLeaf = new EnterLeaf();
        enterLeaf.setRosterService(rosterService);
        
                BUILDER.from(Node.PATH_DOMAIN)
                        .path("athlete")
                            .add("v10", athleteLeaf)
                    .from(Node.PATH_DOMAIN)
                        .path("track")
                            .crud("v10", trackLeaf, trackService)
                    .from(Node.PATH_DOMAIN)
                        .path("race")
                            .path(EnterLeaf.PATH_RACE_ID)
                                .path("class")
                                    .path(EnterLeaf.PATH_CLASS_ID)
                                        .add(EnterLeaf.PATH, enterLeaf);
                
        return BUILDER.build();
    }

    private void initSecurity(Interceptor basicInterceptor, OAuth2Interceptor oauth2Interceptor) {
        Collection<Map.Entry<String, Collection<String>>> oauth2Whitelist = 
                WHITELIST_BUILDER.with("\\A/api/[^/]+/federated/v1.\\z", GET, POST)
                    .add("\\A/api/[^/]+/race/[^/]+/class/[^/]+/enter", GET)
                    .build();
        
        oauth2Interceptor.setWhitelistedMethods(oauth2Whitelist);
    }

}
