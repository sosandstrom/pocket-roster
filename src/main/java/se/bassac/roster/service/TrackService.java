/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.service;

import com.google.appengine.api.utils.SystemProperty;
import com.wadpam.gaelic.appengine.DomainNamespaceFilter;
import com.wadpam.gaelic.crud.MardaoCrudService;
import com.wadpam.gaelic.dao.DAppDomainDao;
import java.io.IOException;
import javax.servlet.ServletException;
import se.bassac.roster.dao.DTrackDao;
import se.bassac.roster.dao.DTrackDaoBean;
import se.bassac.roster.domain.DTrack;

/**
 *
 * @author sosandstrom
 */
public class TrackService extends MardaoCrudService<DTrack, Long, DTrackDao> {
    
    private DAppDomainDao appDomainDao;

    public TrackService() {
        super(DTrack.class, Long.class, DTrackDaoBean.class);
    }

    public void setAppDomainDao(DAppDomainDao appDomainDao) {
        this.appDomainDao = appDomainDao;
    }
    
}
