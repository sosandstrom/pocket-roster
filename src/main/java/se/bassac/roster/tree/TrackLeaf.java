/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.tree;

import com.wadpam.gaelic.converter.MardaoConverter;
import com.wadpam.gaelic.tree.CrudLeaf;
import se.bassac.roster.domain.DTrack;
import se.bassac.roster.json.JTrack;
import se.bassac.roster.service.TrackService;

/**
 *
 * @author sosandstrom
 */
public class TrackLeaf extends CrudLeaf<JTrack, DTrack, Long, TrackService> {
    
    public static final TrackConverter CONVERTER = new TrackConverter();

    public TrackLeaf() {
        super(DTrack.class, Long.class, JTrack.class);
        setConverter(CONVERTER);
    }

    public static class TrackConverter extends MardaoConverter<JTrack, DTrack> {

        public TrackConverter() {
            super(JTrack.class, DTrack.class);
        }

        @Override
        public void convertDomain(DTrack from, JTrack to) {
            convertLongEntity(from, to);
            to.setKmlUrl(from.getKmlUrl());
        }

        @Override
        public void convertJson(JTrack from, DTrack to) {
            convertJLong(from, to);
            to.setKmlUrl(from.getKmlUrl());
        }
        
    }
}
