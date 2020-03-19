package cr.una;


import org.junit.Test;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class FuentesTest {

    private static final Logger logger = LogManager.getLogger(FuentesTest.class);

    @Test
    public void testCaptureScore() {
        Fuentes scorer = new Fuentes();
        assertEquals("Arial", scorer.BPR);
    }

}