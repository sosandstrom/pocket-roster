/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.bassac.roster.tree;

import com.wadpam.gaelic.json.JCursorPage;
import com.wadpam.gaelic.net.NetworkTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import se.bassac.roster.json.JRace;

/**
 *
 * @author os
 */
public class RosterITest {
    
    static final String BASE_URL = "http://localhost:8080/api/prod";
    
    NetworkTemplate template;
    
    public RosterITest() {
    }
    
    @Before
    public void setUp() {
        template = new NetworkTemplate();
        template.setAuthorization("Basic cHJvZDpJUnJ2UUpVRUhLNHBWcnRjUm5XMzAzWUp1");
    }
    
    @After
    public void tearDown() {
    }

    protected RacePage getRaces() {
        return template.get(String.format("%s/races/v10", BASE_URL), RacePage.class);
    }
    
    @Test
    public void testGetRaces() {
        RacePage page = getRaces();
        assertNotNull(page);
    }
    
    public static class RacePage extends JCursorPage<JRace> {}
}