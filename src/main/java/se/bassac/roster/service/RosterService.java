/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.google.appengine.api.utils.SystemProperty;
import com.wadpam.gaelic.appengine.DomainNamespaceFilter;
import com.wadpam.gaelic.dao.DAppDomainDao;
import com.wadpam.gaelic.security.SecurityDetailsService;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import javax.servlet.ServletException;
import se.bassac.roster.dao.DAthleteDao;
import se.bassac.roster.dao.DCheckpointDao;
import se.bassac.roster.dao.DClassDao;
import se.bassac.roster.dao.DMilestoneDao;
import se.bassac.roster.dao.DOrganizerDao;
import se.bassac.roster.dao.DParticipantDao;
import se.bassac.roster.dao.DPassageDao;
import se.bassac.roster.dao.DRaceDao;
import se.bassac.roster.dao.DSeriesDao;
import se.bassac.roster.dao.DTimingsDao;
import se.bassac.roster.dao.DTrackDao;
import se.bassac.roster.domain.DAthlete;
import se.bassac.roster.domain.DClass;
import se.bassac.roster.domain.DOrganizer;
import se.bassac.roster.domain.DRace;
import se.bassac.roster.domain.DSeries;
import se.bassac.roster.domain.DTrack;

/**
 *
 * @author sosandstrom
 */
public class RosterService {
    
    private DAppDomainDao appDomainDao;
    
    private DAthleteDao athleteDao;
    private DCheckpointDao checkpointDao;
    private DClassDao classDao;
    private DMilestoneDao milestoneDao;
    private DOrganizerDao organizerDao;
    private DParticipantDao participantDao;
    private DPassageDao passageDao;
    private DRaceDao raceDao;
    private DSeriesDao seriesDao;
    private DTimingsDao timingsDao;
    private DTrackDao trackDao;
    
    public void init() {
        // Application initialization
        if (SystemProperty.Environment.Value.Development == SystemProperty.environment.value()) {
            
            appDomainDao.persist("prod", "UA", null, null, "Prod Domain", "os@bassac.se", "IRrvQJUEHK4pVrtcRnW303YJu", "prod");
            try {
                DomainNamespaceFilter.doInNamespace("prod", new Runnable() {
                    @Override
                    public void run() {
                        final DAthlete pierre = athleteDao.persist(3L,
                                new Date(37805943000L), "Pierre-Marie Dubois", 
                                "pmdubois@example.com",
                                "+85512345678", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "pmdubois");
                        
                        final DAthlete twin1 = athleteDao.persist(1L, 
                                new Date(19316343000L), "Twin One", "twin.one@example.com",
                                "+85512345677", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "twinone");
                        final DAthlete twin2 = athleteDao.persist(2L,
                                new Date(19316353000L), "Twin Two", "twin.two@example.com",
                                "+85512345679", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "twintwo");
                        
                        final DOrganizer floatingBikes = organizerDao.persist(11L,
                                Arrays.asList(pierre, twin1), 
                                Arrays.asList(pierre),
                                "Floating Bikes");
                        final Object floatingKey = organizerDao.getPrimaryKey(floatingBikes);
                        
                        final DSeries smurfMtb = seriesDao.persist(floatingKey, 
                                201L, "Smurf MTB Cambodia 2013");
                        
                        final DRace preakLeap = raceDao.persist(3097L, 
                                "Preak Leap June 9th", smurfMtb);
                        final Object preakRaceKey = raceDao.getPrimaryKey(preakLeap);
                        
                        final DTrack preakLeapTrack = trackDao.persist(preakRaceKey, 
                                40869L, "http://", "Preak Leap 3.0km");

                        final DClass a1 = classDao.persist(preakRaceKey, 111L, 
                                new Date(1370748677000L), "A1", new Date(1370747700000L), 
                                preakLeapTrack);
                        final DClass b = classDao.persist(preakRaceKey, 121L, 
                                new Date(1370748677000L), "B", new Date(1370744700000L), 
                                preakLeapTrack);
                        final DClass c2 = classDao.persist(preakRaceKey, 132L, 
                                new Date(1370742443000L), "C2", new Date(1370742300000L), 
                                preakLeapTrack);
                    }
                });
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ServletException ex) {
                ex.printStackTrace();
            }
        }
        
    }

    public void setAppDomainDao(DAppDomainDao appDomainDao) {
        this.appDomainDao = appDomainDao;
    }

    public void setAthleteDao(DAthleteDao athleteDao) {
        this.athleteDao = athleteDao;
    }

    public void setCheckpointDao(DCheckpointDao checkpointDao) {
        this.checkpointDao = checkpointDao;
    }

    public void setClassDao(DClassDao classDao) {
        this.classDao = classDao;
    }

    public void setMilestoneDao(DMilestoneDao milestoneDao) {
        this.milestoneDao = milestoneDao;
    }

    public void setOrganizerDao(DOrganizerDao organizerDao) {
        this.organizerDao = organizerDao;
    }

    public void setParticipantDao(DParticipantDao participantDao) {
        this.participantDao = participantDao;
    }

    public void setPassageDao(DPassageDao passageDao) {
        this.passageDao = passageDao;
    }

    public void setRaceDao(DRaceDao raceDao) {
        this.raceDao = raceDao;
    }

    public void setSeriesDao(DSeriesDao seriesDao) {
        this.seriesDao = seriesDao;
    }

    public void setTimingsDao(DTimingsDao timingsDao) {
        this.timingsDao = timingsDao;
    }

    public void setTrackDao(DTrackDao trackDao) {
        this.trackDao = trackDao;
    }
    
    
}
