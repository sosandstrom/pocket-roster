package se.bassac.roster.dao;

import java.util.HashMap;
import java.util.Map;
import net.sf.mardao.core.dao.DaoImpl;
import se.bassac.roster.domain.DTrack;
import se.bassac.roster.domain.DSeries;
import se.bassac.roster.domain.DTimings;
import se.bassac.roster.domain.DCheckpoint;
import se.bassac.roster.domain.DPassage;
import se.bassac.roster.domain.DMilestone;
import se.bassac.roster.domain.DAthlete;
import se.bassac.roster.domain.DRace;
import se.bassac.roster.domain.DClass;
import se.bassac.roster.domain.DOrganizer;
import se.bassac.roster.domain.DParticipant;

/**
 * Context to define the Dao beans.
 * This file is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DaoConfig {

    public static Map<Class, DaoImpl> createDaos() {
        final HashMap<Class, DaoImpl> map = new HashMap<Class, DaoImpl>();

        // first, create and map Dao instances:
        final DTrackDaoBean dTrackDao =
            new DTrackDaoBean();
        map.put(DTrack.class, dTrackDao);
        final DSeriesDaoBean dSeriesDao =
            new DSeriesDaoBean();
        map.put(DSeries.class, dSeriesDao);
        final DTimingsDaoBean dTimingsDao =
            new DTimingsDaoBean();
        map.put(DTimings.class, dTimingsDao);
        final DCheckpointDaoBean dCheckpointDao =
            new DCheckpointDaoBean();
        map.put(DCheckpoint.class, dCheckpointDao);
        final DPassageDaoBean dPassageDao =
            new DPassageDaoBean();
        map.put(DPassage.class, dPassageDao);
        final DMilestoneDaoBean dMilestoneDao =
            new DMilestoneDaoBean();
        map.put(DMilestone.class, dMilestoneDao);
        final DAthleteDaoBean dAthleteDao =
            new DAthleteDaoBean();
        map.put(DAthlete.class, dAthleteDao);
        final DRaceDaoBean dRaceDao =
            new DRaceDaoBean();
        map.put(DRace.class, dRaceDao);
        final DClassDaoBean dClassDao =
            new DClassDaoBean();
        map.put(DClass.class, dClassDao);
        final DOrganizerDaoBean dOrganizerDao =
            new DOrganizerDaoBean();
        map.put(DOrganizer.class, dOrganizerDao);
        final DParticipantDaoBean dParticipantDao =
            new DParticipantDaoBean();
        map.put(DParticipant.class, dParticipantDao);

        // next, wire parents;
        dTrackDao.setMardaoParentDao(dRaceDao);
        dSeriesDao.setMardaoParentDao(dOrganizerDao);
        dTimingsDao.setMardaoParentDao(dRaceDao);
        dCheckpointDao.setMardaoParentDao(dRaceDao);
        dPassageDao.setMardaoParentDao(dTimingsDao);
        dMilestoneDao.setMardaoParentDao(dTrackDao);
        dClassDao.setMardaoParentDao(dRaceDao);
        dParticipantDao.setMardaoParentDao(dAthleteDao);

        // finally, wire many-to-ones;
        dPassageDao.setCheckpointDao(dCheckpointDao);
        dMilestoneDao.setCheckpointDao(dCheckpointDao);
        dRaceDao.setSeriesDao(dSeriesDao);
        dClassDao.setTrackDao(dTrackDao);
        dParticipantDao.setRaceClassDao(dClassDao);
	
        return map;
    }
}