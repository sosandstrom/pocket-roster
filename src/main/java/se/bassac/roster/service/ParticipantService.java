/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.wadpam.gaelic.crud.MardaoCrudService;
import se.bassac.roster.dao.DParticipantDao;
import se.bassac.roster.dao.DParticipantDaoBean;
import se.bassac.roster.domain.DParticipant;

/**
 *
 * @author sosandstrom
 */
public class ParticipantService extends MardaoCrudService<DParticipant, Long, DParticipantDao> {
    
    public ParticipantService() {
        super(DParticipant.class, Long.class, DParticipantDaoBean.class);
    }

}
