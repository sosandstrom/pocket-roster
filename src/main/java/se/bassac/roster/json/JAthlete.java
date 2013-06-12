/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.json;

import com.wadpam.gaelic.oauth.json.JOAuth2User;

/**
 *
 * @author sosandstrom
 */
public class JAthlete extends JOAuth2User {

    private String phoneNumber;
    
    private Long dateOfBirth;

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
