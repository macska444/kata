package hu.macskamarci.sm.feladatok;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class F19Test {

    @Test
    public void realEmail() {
        assertTrue(F19.isRealHunEmailAddres("sm1986@mail.hu"));
    }

    @Test
    public void fakeEmail() {
        assertFalse(F19.isRealHunEmailAddres("notHun@mail.com"));
    }
}