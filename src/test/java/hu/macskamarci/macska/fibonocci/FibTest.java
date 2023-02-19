package hu.macskamarci.macska.fibonocci;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

public class FibTest {

    private Fib fib;

    @Before
    public void setUp() {
        fib = new Fib();

    }

    @Test
    public void Fib0Test() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 0);
        expected = BigInteger.ZERO;
        assertEquals(expected, result);
    }

    @Test
    public void FibFirstTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 1);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib2ndTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 2);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib3rdTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 3);
        expected = BigInteger.TWO;
        assertEquals(expected, result);
    }

    @Test
    public void Fib5thTest() {
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 5);
        expected = BigInteger.valueOf(5);
        assertEquals(expected, result);
    }

    @Test
    public void Fib99thTest() {
        Instant start = Instant.now();
        BigInteger result;
        BigInteger expected;
        result = fib.calculate( 99);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Duration: " + timeElapsed.toNanos());
        expected = new BigInteger("218922995834555169026");
        assertEquals(expected, result);
    }

}