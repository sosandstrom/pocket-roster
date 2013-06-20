/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"raceClass", "bibNumber"}),
        @UniqueConstraint(columnNames = {"raceClass", "athleteKey"})
})
public class DParticipant extends AbstractLongEntity {

    @Parent(kind="DAthlete")
    private Object athleteKey;
    
    @ManyToOne
    DClass raceClass;
    
    @Basic
    private String bibNumber;

    public Object getAthleteKey() {
        return athleteKey;
    }

    public void setAthleteKey(Object athleteKey) {
        this.athleteKey = athleteKey;
    }

    public DClass getRaceClass() {
        return raceClass;
    }

    public void setRaceClass(DClass raceClass) {
        this.raceClass = raceClass;
    }

    public String getBibNumber() {
        return bibNumber;
    }

    public void setBibNumber(String bibNumber) {
        this.bibNumber = bibNumber;
    }
}
