/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.json;

import com.wadpam.gaelic.json.JBaseObject;

/**
 *
 * @author sosandstrom
 */
public class JParticipant extends JBaseObject {
    
    private String athleteId;

    private String bibNumber;
    
    private String classKey;
    
    private JAthlete athlete;

    public String getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(String athleteId) {
        this.athleteId = athleteId;
    }

    public String getBibNumber() {
        return bibNumber;
    }

    public void setBibNumber(String bibNumber) {
        this.bibNumber = bibNumber;
    }

    public String getClassKey() {
        return classKey;
    }

    public void setClassKey(String classKey) {
        this.classKey = classKey;
    }

    public JAthlete getAthlete() {
        return athlete;
    }

    public void setAthlete(JAthlete athlete) {
        this.athlete = athlete;
    }
    
    
}
