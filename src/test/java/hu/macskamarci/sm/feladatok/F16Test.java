package hu.macskamarci.sm.feladatok;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class F16Test {

    @Test
    public void beforeOneDay() {
        int secunds = 24 * 60 * 60 - 1;
        String result = F16.getIdoToSec(secunds);
        assertEquals("23:59:59", result);
    }

    @Test
    public void oneHoure() {
        int secunds = 60 * 60;
        String result = F16.getIdoToSec(secunds);
        assertEquals("01:00:00", result);
    }

    @Test
    public void oneMin() {
        int secunds = 60;
        String result = F16.getIdoToSec(secunds);
        assertEquals("00:01:00", result);
    }

    @Test
    public void oneSec() {
        int secunds = 1;
        String result = F16.getIdoToSec(secunds);
        assertEquals("00:00:01", result);
    }

}