/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.tree;

import com.wadpam.gaelic.converter.MardaoConverter;
import com.wadpam.gaelic.tree.CrudLeaf;
import se.bassac.roster.dao.DAthleteDao;
import se.bassac.roster.domain.DParticipant;
import se.bassac.roster.json.JParticipant;
import se.bassac.roster.service.ParticipantService;

/**
 *
 * @author sosandstrom
 */
public class ParticipantLeaf extends CrudLeaf<JParticipant, DParticipant, Long, ParticipantService> {
    
    public static final ParticipantConverter CONVERTER = new ParticipantConverter();

    public ParticipantLeaf() {
        super(DParticipant.class, Long.class, JParticipant.class);
        setConverter(CONVERTER);
    }

    public static class ParticipantConverter extends MardaoConverter<JParticipant, DParticipant> {
        
        private DAthleteDao athleteDao;

        public ParticipantConverter() {
            super(JParticipant.class, DParticipant.class);
        }

        @Override
        public void convertDomain(DParticipant from, JParticipant to) {
            convertLongEntity(from, to);
            to.setAthleteId(toString(athleteDao.getSimpleKeyByPrimaryKey(from.getAthleteKey())));
            to.setBibNumber(from.getBibNumber());
        }

        @Override
        public void convertJson(JParticipant from, DParticipant to) {
            convertJLong(from, to);
            to.setBibNumber(from.getBibNumber());
        }
        
        public void setAthleteDao(DAthleteDao dao) {
            athleteDao = dao;
        }
    }
}
