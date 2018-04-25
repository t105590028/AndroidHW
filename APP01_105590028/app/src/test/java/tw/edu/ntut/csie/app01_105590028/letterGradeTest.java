package tw.edu.ntut.csie.app01_105590028;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class letterGradeTest {
    private letterGrade ms;
    @Before public void setUp(){ms=new letterGrade();}
    @After public void tearDown(){ms=null;}
    @Test
    public void testGetSuggestion() {
        assertEquals("等第 : X", ms.getSuggestion(101));
        assertEquals("等第 : A", ms.getSuggestion(95));
        assertEquals("等第 : B", ms.getSuggestion(85));
        assertEquals("等第 : C", ms.getSuggestion(75));
        assertEquals("等第 : D", ms.getSuggestion(65));
        assertEquals("等第 : F", ms.getSuggestion(30));
        assertEquals("等第 : X", ms.getSuggestion(-1));


    }
}
