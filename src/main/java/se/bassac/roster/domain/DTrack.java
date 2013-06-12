/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DTrack extends AbstractLongEntity{

    @Basic
    private String kmlUrl;

    public String getKmlUrl() {
        return kmlUrl;
    }

    public void setKmlUrl(String kmlUrl) {
        this.kmlUrl = kmlUrl;
    }
    
    
}
