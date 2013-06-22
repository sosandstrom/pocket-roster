/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.web;

import com.wadpam.gaelic.Node;
import com.wadpam.gaelic.json.JCursorPage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.mardao.core.CursorPage;
import se.bassac.roster.domain.DParticipant;
import se.bassac.roster.service.RosterService;

/**
 *
 * @author sosandstrom
 */
public class EnterLeaf extends Node {
    
    public static final String PATH = "enter";
    public static final String PATH_RACE_ID = "{raceId}";
    public static final String PATH_CLASS_ID = "{classId}";
    
    private RosterService rosterService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final long raceId = getPathVariableLong(PATH_RACE_ID);
        final long classId = getPathVariableLong(PATH_CLASS_ID);
        
        if (request.getRequestURI().endsWith(PATH)) {
            final int pageSize = getPageSize(request);
            final String cursorKey = getCursorKey(request);
            
            // /api/prod/race/{raceId}/class/{classId}/enter
            final CursorPage<DParticipant, Long> page = rosterService.getParticipants(request, raceId, classId, pageSize, cursorKey);
            final JCursorPage body = ParticipantLeaf.CONVERTER.convertMardaoDomainPage(page);
            setResponseBody(request, HttpServletResponse.SC_OK, body);
        }
    }

    
    public void setRosterService(RosterService rosterService) {
        this.rosterService = rosterService;
    }
    
}
