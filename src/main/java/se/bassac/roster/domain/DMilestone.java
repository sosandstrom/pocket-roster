/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

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
public class DMilestone extends AbstractLongEntity {

    @Parent(kind="DTrack")
    private Object trackKey;
    
    @Basic
    private String name;
    
    @ManyToOne
    private DCheckpoint checkpoint;
    
    /** distance from start, in meters */
    @Basic
    private Integer distance;
    
    @Basic
    private Integer lapNumber;

    public Object getTrackKey() {
        return trackKey;
    }

    public void setTrackKey(Object trackKey) {
        this.trackKey = trackKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DCheckpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(DCheckpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(Integer lapNumber) {
        this.lapNumber = lapNumber;
    }
    
}
