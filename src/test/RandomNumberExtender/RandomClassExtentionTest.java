package RandomNumberExtender;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomClassExtentionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void nextInt() {
        int testInt= -1;
        testInt = new RandomClassExtention().nextInt(0,99);
        assertTrue(testInt >= 0 && testInt <= 99);
    }

    @Test
    public void nextEven() {
    }

    @Test
    public void nextOdd() {
    }

    @Test
    public void nextCharCap() {
    }

    @Test
    public void nextCharLow() {
    }

    @Test
    public void testNextCharCap() {
    }

    @Test
    public void testNextCharLow() {
    }

    @Test
    public void nextWord() {
    }
}