package hu.macskamarci.sm.feladatok;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class F13Test {

    //https://www.nkp.hu/tankonyv/matematika_10_1_nat2020/lecke_05_032

    @Test
    public void getMasodfukuEgyenlet() {
        F13.getMasodfukuEgyenlet(6, -7, 0);
        assertEquals(0, F13.megoldasEslo, 0);
        assertEquals(1.1666666666666667, F13.megoldasMasodik, 0.0001);
    }

    @Test
    public void getMasodfukuEgyenlet1() {
        F13.getMasodfukuEgyenlet(1, -22, 85);
        assertEquals(5, F13.megoldasEslo, 0);
        assertEquals(17, F13.megoldasMasodik, 0);
    }

    @Test(expected = NincsValosMegoldasException.class)
    public void getMasodfukuEgyenlet2() {
        F13.getMasodfukuEgyenlet(5, -14, 34);
    }

    @Test
    public void getMasodfukuEgyenlet3() {
        F13.getMasodfukuEgyenlet(11, -5, -34);
        assertEquals(-1.5454545454545454, F13.megoldasEslo, 0.0001);
        assertEquals(2, F13.megoldasMasodik, 0);
    }
}