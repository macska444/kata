package hu.macskamarci.macska.f14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class F14Test {

    private F14 f14;

    @Before
    public void setUp() throws Exception {
        f14 = new F14();
    }

    @Test
    public void nEquals1() {
        double[] myArray = {15.33f};
        int result = f14.execute(myArray);
        assertEquals(0, result);
    }
    @Test
    public void noElementAroundAverage() {
        double[] myArray = {15.33f, 125.55f, 333.44f, 444.55f, 555.55f};
        int result = f14.execute(myArray);
        assertEquals(-1, result);
    }

    @Test
    public void thereIsAnElementAroundAverageBigger() {
        double[] myArray = {15.33f, 125.55f, 299.99, 333.44f, 444.55f, 555.55f};
        int result = f14.execute(myArray);
        assertEquals(2, result);
    }
    @Test
    public void thereIsAnElementAroundAverageLower() {
        double[] myArray = {15.33f, 125.55f, 289.99, 333.44f, 444.55f, 555.55f};
        int result = f14.execute(myArray);
        assertEquals(2, result);
    }

}