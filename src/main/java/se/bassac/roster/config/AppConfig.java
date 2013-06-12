/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.config;

import com.google.appengine.api.utils.SystemProperty;
import se.bassac.roster.service.AthleteService;
import se.bassac.roster.web.AthleteLeaf;
import com.wadpam.gaelic.GaelicConfig;
import com.wadpam.gaelic.GaelicServlet;
import com.wadpam.gaelic.Node;
import com.wadpam.gaelic.appengine.DomainNamespaceFilter;
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
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import se.bassac.roster.service.TrackService;
import se.bassac.roster.web.TrackLeaf;

/**
 *
 * @author sosandstrom
 */
public class AppConfig implements GaelicConfig, SecurityConfig {

    @Override
    public Node init(GaelicServlet gaelicServlet, ServletConfig servletConfig) {

        // conventional services
        ConnectionServiceImpl connectionService = new ConnectionServiceImpl();
        DConnectionDao connectionDao = connectionService.getDao();
        
        AthleteService athleteService = new AthleteService();
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
        TrackLeaf trackLeaf = new TrackLeaf();
        
                BUILDER.from(Node.PATH_DOMAIN)
                        .path("athlete")
                            .add("v10", athleteLeaf)
                    .from(Node.PATH_DOMAIN)
                        .path("track")
                            .crud("v10", trackLeaf, trackService);
                
        // Application initialization
        if (SystemProperty.Environment.Value.Development == SystemProperty.environment.value()) {
            
            appDomainService.getDao().persist("prod", "UA", null, null, "Prod Domain", "os@bassac.se", "IRrvQJUEHK4pVrtcRnW303YJu", "prod");
            try {
                DomainNamespaceFilter.doInNamespace("prod", new Runnable() {
                    @Override
                    public void run() {
                        trackService.getDao().persist(42L, "http://connect.garmin.com/proxy/activity-service-1.0/kml/activity/326609466?full=true");
                    }
                });
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ServletException ex) {
                ex.printStackTrace();
            }
        }
                
                
        return BUILDER.build();
    }

    private void initSecurity(Interceptor basicInterceptor, OAuth2Interceptor oauth2Interceptor) {
        Collection<Map.Entry<String, Collection<String>>> oauth2Whitelist = 
                WHITELIST_BUILDER.with("\\A/api/[^/]+/federated/v1.\\z", GET, POST)
                    .build();
        
        oauth2Interceptor.setWhitelistedMethods(oauth2Whitelist);
    }

}
