/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.web;

import se.bassac.roster.domain.DAthlete;
import se.bassac.roster.json.JAthlete;
import com.wadpam.gaelic.crud.CrudService;
import com.wadpam.gaelic.oauth.web.UserConverter;
import com.wadpam.gaelic.tree.CrudLeaf;

/**
 *
 * @author sosandstrom
 */
public class AthleteLeaf extends CrudLeaf<JAthlete, DAthlete, Long, CrudService<DAthlete, Long>> {
    
    public static final AthleteConverter CONVERTER = new AthleteConverter();

    public AthleteLeaf() {
        super(DAthlete.class, Long.class, JAthlete.class);
        setConverter(CONVERTER);
    }
    
    public static class AthleteConverter extends UserConverter<JAthlete, DAthlete> {

        public AthleteConverter() {
            super(JAthlete.class, DAthlete.class);
        }

        @Override
        public void convertDomain(DAthlete from, JAthlete to) {
            super.convertDomain(from, to);
            to.setPhoneNumber(from.getPhoneNumber());
            to.setDateOfBirth(toLong(from.getDateOfBirth()));
        }

        @Override
        public void convertJson(JAthlete from, DAthlete to) {
            super.convertJson(from, to);
            to.setPhoneNumber(from.getPhoneNumber());
            to.setDateOfBirth(toDate(from.getDateOfBirth()));
        }
        
    }
}
