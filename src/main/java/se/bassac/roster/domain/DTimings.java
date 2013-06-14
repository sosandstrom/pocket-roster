/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DTimings extends AbstractLongEntity {
    
    @Parent(kind="DRace")
    private Object raceKey;

    @Basic
    private String bibNumber;
    
    public Object getRaceKey() {
        return raceKey;
    }

    public void setRaceKey(Object raceKey) {
        this.raceKey = raceKey;
    }

    public String getBibNumber() {
        return bibNumber;
    }

    public void setBibNumber(String bibNumber) {
        this.bibNumber = bibNumber;
    }

}
