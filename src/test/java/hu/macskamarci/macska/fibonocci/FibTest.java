package hu.macskamarci.macska.fibonocci;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;


public class FibTest

{
    private Fib fib;

    @Before
    public void setUp() {
        fib = new Fib();

    }

    @Test
    public void FibFirstTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate(1);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib2ndTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate(2);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib3rdTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate(3);
        expected = BigInteger.TWO;
        assertEquals(expected, result);
    }

    @Test
    public void Fib5thTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate(5);
        expected = BigInteger.valueOf(5);
        assertEquals(expected, result);
    }

    @Test
    public void Fib99thTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate(99);
        expected = new BigInteger("218922995834555169026");
        assertEquals(expected, result);
    }

}
