/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import com.wadpam.gaelic.oauth.domain.DOAuth2User;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DAthlete extends DOAuth2User {
    
    @Basic
    private String phoneNumber;
    
    @Basic
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
