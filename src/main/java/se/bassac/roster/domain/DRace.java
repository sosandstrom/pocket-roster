/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DRace extends AbstractLongEntity {

    @ManyToOne
    private DSeries series;
    
    @Basic
    private String name;

    public DSeries getSeries() {
        return series;
    }

    public void setSeries(DSeries series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
