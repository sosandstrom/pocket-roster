/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import se.bassac.roster.dao.DTrackDao;

/**
 *
 * @author sosandstrom
 */
public class RosterService {
    
    private DTrackDao trackDao;

    public DTrackDao getTrackDao() {
        return trackDao;
    }

    public void setTrackDao(DTrackDao trackDao) {
        this.trackDao = trackDao;
    }
    
    
}
