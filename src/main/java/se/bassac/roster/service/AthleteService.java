/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import se.bassac.roster.domain.DAthlete;
import com.wadpam.gaelic.oauth.service.OAuth2UserServiceImpl;
import se.bassac.roster.dao.DAthleteDao;
import se.bassac.roster.dao.DAthleteDaoBean;

/**
 *
 * @author sosandstrom
 */
public class AthleteService extends OAuth2UserServiceImpl<DAthlete, DAthleteDao> {

    public AthleteService() {
        super(DAthlete.class, DAthleteDaoBean.class);
    }

}
