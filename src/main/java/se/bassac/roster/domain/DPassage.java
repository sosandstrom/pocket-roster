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
public class DPassage extends AbstractLongEntity {

    @Parent(kind="DTimings")
    private Object timingsKey;
    
    @ManyToOne
    private DCheckpoint checkpoint;
    
    @Basic
    private Date passageTime;

    public Object getTimingsKey() {
        return timingsKey;
    }

    public void setTimingsKey(Object timingsKey) {
        this.timingsKey = timingsKey;
    }

    public DCheckpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(DCheckpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

    public Date getPassageTime() {
        return passageTime;
    }

    public void setPassageTime(Date passageTime) {
        this.passageTime = passageTime;
    }
    
}
