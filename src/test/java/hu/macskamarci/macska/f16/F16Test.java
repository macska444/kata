package hu.macskamarci.macska.f16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class F16Test {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void firstTest() {
        long secunds = 24 * 60 * 60 * 60 - 1;
        String result = F16.calculateTime(secunds);
        assertEquals("23:59:59", result);
    }

}