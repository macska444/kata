package hu.sm.feladatok;

import org.junit.jupiter.api.Test;
import org.testng.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.*;

class F13Test {

    //https://www.nkp.hu/tankonyv/matematika_10_1_nat2020/lecke_05_032

    @Test
    void getMasodfukuEgyenlet() {
        F13.getMasodfukuEgyenlet(6, -7,0);
        assertEquals(F13.megoldasEslo, 0);
        assertEquals(F13.megoldasMasodik, 1.1666666666666667);
    }

    @Test
    void getMasodfukuEgyenlet1() {
        F13.getMasodfukuEgyenlet(1, -22,85);
        assertEquals(F13.megoldasEslo, 5);
        assertEquals(F13.megoldasMasodik, 17);
    }

    @Ignore
    @Test
    void getMasodfukuEgyenlet2() {
        F13.getMasodfukuEgyenlet(5, -14,34);
        assertEquals(F13.megoldasEslo, 1);
        assertEquals(F13.megoldasMasodik, 1.8);
    }

    @Test
    void getMasodfukuEgyenlet3() {
        F13.getMasodfukuEgyenlet(11, -5,-34);
        assertEquals(F13.megoldasEslo, 1.5454545454545454);
        assertEquals(F13.megoldasMasodik, 2);
    }
}