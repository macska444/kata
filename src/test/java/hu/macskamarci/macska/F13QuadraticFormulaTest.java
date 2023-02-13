package hu.macskamarci.macska;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class F13QuadraticFormulaTest {

    private F13QuadraticFormula calculator;

    @Before
    public void setUp() {
        calculator = new F13QuadraticFormula();
    }

    @Test
    public void c0() {
        Pair result = calculator.calculate(5, 14, 0);
        assertEquals(-2.8, result.x1, 0);
        assertEquals(0, result.x2, 0);
    }

    @Test(expected = ThereIsNoRealRoots.class)
    public void noRealRoots() {
        calculator.calculate(5, 14, 34);
    }

    @Test
    public void uglyRoots() {
        Pair result = calculator.calculate(1, -8, 5);
        assertEquals(0.6833, result.x1, 0.0001);
        assertEquals(7.316, result.x2, 0.001);
    }

    @Test(expected = AMustBeNot0.class)
    public void a0() {
        calculator.calculate(0, 14, 34);
    }


}