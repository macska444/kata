package hu.macskamarci.sm.feladatok;

import hu.macskamarci.sm.feladatok.f13.F13;
import hu.macskamarci.sm.feladatok.f13.Result;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class F13Test {

    //https://www.nkp.hu/tankonyv/matematika_10_1_nat2020/lecke_05_032

    @Test
    public void getMasodfukuEgyenlet() {
        Result result = F13.getMasodfukuEgyenlet(6, -7, 0);
        assertEquals(0, result.x1(), 0);
        assertEquals(1.1666666666666667, result.x2(), 0.0001);
    }

    @Test
    public void getMasodfukuEgyenlet1() {
        Result result = F13.getMasodfukuEgyenlet(1, -22, 85);
        assertEquals(5, result.x1(), 0);
        assertEquals(17, result.x2(), 0);
    }

    @Test(expected = NincsValosMegoldasException.class)
    public void getMasodfukuEgyenlet2() {
        F13.getMasodfukuEgyenlet(5, -14, 34);
    }

    @Test
    public void getMasodfukuEgyenlet3() {
        Result result = F13.getMasodfukuEgyenlet(11, -5, -34);
        assertEquals(-1.5454545454545454, result.x1(), 0.0001);
        assertEquals(2, result.x2(), 0);
    }
}