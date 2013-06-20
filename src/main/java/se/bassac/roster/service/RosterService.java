/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.google.appengine.api.utils.SystemProperty;
import com.wadpam.gaelic.appengine.DomainNamespaceFilter;
import com.wadpam.gaelic.dao.DAppDomainDao;
import com.wadpam.gaelic.exception.ConflictException;
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
import se.bassac.roster.domain.DCheckpoint;
import se.bassac.roster.domain.DClass;
import se.bassac.roster.domain.DMilestone;
import se.bassac.roster.domain.DOrganizer;
import se.bassac.roster.domain.DParticipant;
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

    public RosterService() {
    }

    public RosterService(DAppDomainDao appDomainDao, DAthleteDao athleteDao, DCheckpointDao checkpointDao, DClassDao classDao, DMilestoneDao milestoneDao, DOrganizerDao organizerDao, DParticipantDao participantDao, DPassageDao passageDao, DRaceDao raceDao, DSeriesDao seriesDao, DTimingsDao timingsDao, DTrackDao trackDao) {
        this.appDomainDao = appDomainDao;
        this.athleteDao = athleteDao;
        this.checkpointDao = checkpointDao;
        this.classDao = classDao;
        this.milestoneDao = milestoneDao;
        this.organizerDao = organizerDao;
        this.participantDao = participantDao;
        this.passageDao = passageDao;
        this.raceDao = raceDao;
        this.seriesDao = seriesDao;
        this.timingsDao = timingsDao;
        this.trackDao = trackDao;
    }
    
    public DParticipant enterRace(Long athleteId, Long raceId, Long classId, 
            String bibNumber) {
        final Object classKey = getClassKey(raceId, classId);
        final Object athleteKey = athleteDao.getPrimaryKey(null, athleteId);
        
        // already registered for this class?
        DParticipant participant = participantDao.findByAthleteKeyClassKey(athleteKey, classKey);
        if (null != participant) {
            throw new ConflictException();
        }
        
        final DClass raceClass = classDao.createDomain(classKey);
        participant = participantDao.persist(athleteKey, null, bibNumber, raceClass);
        
        return participant;
    }

    public Object getClassKey(Long raceId, Long classId) {
        final Object raceKey = raceDao.getPrimaryKey(null, raceId);
        final Object classKey = classDao.getPrimaryKey(raceKey, classId);
        return classKey;
    }
    
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
                                Arrays.asList(pierre.getId(), twin1.getId()), 
                                Arrays.asList(pierre.getId()),
                                "Floating Bikes");
                        final Object floatingKey = organizerDao.getPrimaryKey(floatingBikes);
                        
                        final DSeries smurfMtb = seriesDao.persist(floatingKey, 
                                201L, "Smurf MTB Cambodia 2013");
                        
                        // Race Setup
                        final DRace preakLeap = raceDao.persist(3097L, 
                                "Preak Leap June 9th", smurfMtb);
                        final Object preakRaceKey = raceDao.getPrimaryKey(preakLeap);
                        
                        final DTrack preakLeapTrack = trackDao.persist(preakRaceKey, 
                                40869L, "http://", "Preak Leap 3.0km");
                        final Object preakTrackKey = trackDao.getPrimaryKey(preakLeapTrack);

                        final DClass a1 = classDao.persist(preakRaceKey, 111L, 
                                new Date(1370748677000L), "A1", new Date(1370747700000L), 
                                preakLeapTrack);
                        final DClass b = classDao.persist(preakRaceKey, 121L, 
                                new Date(1370748677000L), "B", new Date(1370744700000L), 
                                preakLeapTrack);
                        final DClass c2 = classDao.persist(preakRaceKey, 132L, 
                                new Date(1370742443000L), "C2", new Date(1370742300000L), 
                                preakLeapTrack);
                        
                        final DCheckpoint finishLine = checkpointDao.persist(preakRaceKey, 30971L, "Finish Line");
                        final DMilestone lap1 = milestoneDao.persist(preakTrackKey, 
                                41001L, 3000, 1, "Lap 1", finishLine);
                        final DMilestone lap2 = milestoneDao.persist(preakTrackKey, 
                                41002L, 6000, 2, "Lap 2", finishLine);
                        final DMilestone lap3 = milestoneDao.persist(preakTrackKey, 
                                41003L, 9000, 3, "Lap 3", finishLine);
                        final DMilestone lap4 = milestoneDao.persist(preakTrackKey, 
                                41004L, 12000, 4, "Lap 4", finishLine);
                        final DMilestone lap5 = milestoneDao.persist(preakTrackKey, 
                                41005L, 15000, 5, "Lap 5", finishLine);
                        final DMilestone lap6 = milestoneDao.persist(preakTrackKey, 
                                41006L, 18000, 6, "Lap 6", finishLine);
                        final DMilestone lap7 = milestoneDao.persist(preakTrackKey, 
                                41007L, 21000, 7, "Finish A1", finishLine);
                        
                        // Participants
                        final DAthlete ola = athleteDao.persist(5L,
                                new Date(57805943000L), "Ola Sandstroem", 
                                "os@bassac.se",
                                "+85517222165", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "os");
                        final DAthlete mattias = athleteDao.persist(6L,
                                new Date(39805943000L), "Mattias Levin", 
                                "mlv@bassac.se",
                                "+85517222166", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "mlv");
                        final DAthlete erikI = athleteDao.persist(7L,
                                new Date(99805943000L), "Erik Ingman", 
                                "ei@bassac.se",
                                "+85517222192", null, Arrays.asList(SecurityDetailsService.ROLE_USER), 
                                null, "ei");
                        
                        // register as participants
                        try {
                            enterRace(ola.getId(), preakLeap.getId(), b.getId(), "85");
                        } catch (ConflictException ignore) {}
                        try {
                            enterRace(mattias.getId(), preakLeap.getId(), c2.getId(), "61");
                        } catch (ConflictException ignore) {}
                        try {
                            enterRace(erikI.getId(), preakLeap.getId(), c2.getId(), "31");
                        } catch (ConflictException ignore) {}
                    }
                });
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ServletException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    // ------------------------ Setters ----------------------------------------
    
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
