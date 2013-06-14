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
public class DCheckpoint extends AbstractLongEntity {
    
    @Parent(kind="DRace")
    private Object raceKey;

    @Basic
    private String name;
    
    public Object getRaceKey() {
        return raceKey;
    }

    public void setRaceKey(Object raceKey) {
        this.raceKey = raceKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
