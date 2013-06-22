/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.wadpam.gaelic.crud.MardaoCrudService;
import se.bassac.roster.dao.DTrackDao;
import se.bassac.roster.dao.DTrackDaoBean;
import se.bassac.roster.domain.DTrack;

/**
 *
 * @author sosandstrom
 */
public class TrackService extends MardaoCrudService<DTrack, Long, DTrackDao> {
    
    public TrackService() {
        super(DTrack.class, Long.class, DTrackDaoBean.class);
    }

}
