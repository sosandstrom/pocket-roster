/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.json;

import com.wadpam.gaelic.json.JBaseObject;

/**
 *
 * @author sosandstrom
 */
public class JTrack extends JBaseObject {

    private String kmlUrl;

    public String getKmlUrl() {
        return kmlUrl;
    }

    public void setKmlUrl(String kmlUrl) {
        this.kmlUrl = kmlUrl;
    }
    
}
