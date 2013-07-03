/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.tree;

import com.wadpam.gaelic.converter.MardaoConverter;
import com.wadpam.gaelic.tree.CrudLeaf;
import se.bassac.roster.domain.DRace;
import se.bassac.roster.json.JRace;
import se.bassac.roster.service.RaceService;

/**
 *
 * @author sosandstrom
 */
public class RaceLeaf extends CrudLeaf<JRace, DRace, Long, RaceService> {
    
    public static final RaceConverter CONVERTER = new RaceConverter();

    public RaceLeaf() {
        super(DRace.class, Long.class, JRace.class);
        setConverter(CONVERTER);
    }

    public static class RaceConverter extends MardaoConverter<JRace, DRace> {

        public RaceConverter() {
            super(JRace.class, DRace.class);
        }

        @Override
        public void convertDomain(DRace from, JRace to) {
            convertLongEntity(from, to);
            to.setName(from.getName());
        }

        @Override
        public void convertJson(JRace from, DRace to) {
            convertJLong(from, to);
            to.setName(from.getName());
        }
        
    }
}
