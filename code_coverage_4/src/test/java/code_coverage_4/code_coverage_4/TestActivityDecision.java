 package code_coverage_4.code_coverage_4;

 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class TestActivityDecision {

    ActivityDecision a = new ActivityDecision();

    @Test
    void testAllTrue() {
        String result = a.decideActivity(true, true, true, true, true);
        assertEquals("Take umbrella and searchlight", result);
    }

    @Test
    void testUmbrellaOnly() {
        String result = a.decideActivity(true, false, true, false, true);
        assertEquals("Take umbrella", result);
    }

    @Test
    void testSearchlightOnly() {
        String result = a.decideActivity(false, true, false, true, false);
        assertEquals("Take searchlight", result);
    }

    @Test
    void testDoNothing() {
        String result = a.decideActivity(false, false, false, false, false);
        assertEquals("Do nothing", result);
    }
}
