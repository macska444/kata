package hu.macskamarci.sm.feladatok;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class F20Test {

    @Test
    public void secondRightTop() {
        assertEquals(2.828d, F20.getDistance(new Point(0, 0), new Point(2, 2)), 0.002);
    }

    @Test
    public void secondNearRight() {
        assertEquals(2, F20.getDistance(new Point(0, 0), new Point(0, 2)), 0.002);
    }

    @Test
    public void secondNearLeft() {
        assertEquals(2, F20.getDistance(new Point(0, 0), new Point(0, -2)), 0.002);
    }

}