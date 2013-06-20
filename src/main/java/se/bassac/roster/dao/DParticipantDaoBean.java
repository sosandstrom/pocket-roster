package se.bassac.roster.dao;

import java.util.Iterator;
import net.sf.mardao.core.Filter;
import static se.bassac.roster.dao.GeneratedDParticipantDao.COLUMN_NAME_RACECLASS;
import se.bassac.roster.domain.DParticipant;

/**
 * Implementation of Business Methods related to entity DParticipant.
 * This (empty) class is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DParticipantDaoBean 
	extends GeneratedDParticipantDaoImpl
		implements DParticipantDao 
{

    @Override
    public DParticipant findByAthleteKeyClassKey(Object athleteKey, Object classKey) {
        final Filter classFilter = createEqualsFilter(COLUMN_NAME_RACECLASS, classKey);
        Iterable<DParticipant> i = queryIterable(true, 0, 1, athleteKey, null, null, false, null, false, classFilter);
        Iterator<DParticipant> it = i.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    

}
