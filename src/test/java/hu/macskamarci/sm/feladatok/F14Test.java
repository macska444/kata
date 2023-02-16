package hu.macskamarci.sm.feladatok;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class F14Test {

    @Test
    public void test() {
        Double egy = Double.valueOf(1);
        Double ketto = Double.valueOf(2);
        Double harom = Double.valueOf(3);
        Double szaz = Double.valueOf(100);
        assertFalse(F14.getAtlagtol10NagyobbElteres(List.of(egy, ketto, harom)));
        assertTrue(F14.getAtlagtol10NagyobbElteres(List.of(egy, ketto, harom, szaz)));
    }
}