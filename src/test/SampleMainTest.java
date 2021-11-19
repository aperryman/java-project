package test;

import main.SampleMain;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleMainTest {
    @Test
    public void testSquare() {
        SampleMain sampleMain = new SampleMain();
        assertEquals(sampleMain.square(4), 16);
    }
}