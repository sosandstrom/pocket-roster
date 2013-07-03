/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.wadpam.gaelic.crud.MardaoCrudService;
import se.bassac.roster.dao.DRaceDao;
import se.bassac.roster.dao.DRaceDaoBean;
import se.bassac.roster.domain.DRace;

/**
 *
 * @author sosandstrom
 */
public class RaceService extends MardaoCrudService<DRace, Long, DRaceDao> {
    
    public RaceService() {
        super(DRace.class, Long.class, DRaceDaoBean.class);
    }

}
