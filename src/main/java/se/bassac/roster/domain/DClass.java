/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DClass extends AbstractLongEntity {
    
    @Parent(kind="DRace")
    private Object raceKey;

    @Basic
    private String name;
    
    @ManyToOne
    private DTrack track;

    @Basic
    private Date scheduledStart;
    
    @Basic
    private Date actualStart;

    public Date getScheduledStart() {
        return scheduledStart;
    }

    public void setScheduledStart(Date scheduledStart) {
        this.scheduledStart = scheduledStart;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }
    
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

    public DTrack getTrack() {
        return track;
    }

    public void setTrack(DTrack track) {
        this.track = track;
    }

}
