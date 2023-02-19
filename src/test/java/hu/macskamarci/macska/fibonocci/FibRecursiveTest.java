package hu.macskamarci.macska.fibonocci;

import org.apache.commons.lang.time.StopWatch;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;


public class FibRecursiveTest

{
    private FibRecursive fibRecursive;

    @Before
    public void setUp() {
        fibRecursive = new FibRecursive();

    }

    @Test
    public void Fib0Test() {
        BigInteger result;
        BigInteger expected;
        result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,0, 0);
        expected = BigInteger.ZERO;
        assertEquals(expected, result);
    }

    @Test
    public void FibFirstTest() {
        BigInteger result;
        BigInteger expected;
        result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,1, 0);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib2ndTest() {
        BigInteger result;
        BigInteger expected;
        result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,2, 0);
        expected = BigInteger.ONE;
        assertEquals(expected, result);
    }

    @Test
    public void Fib3rdTest() {
        BigInteger result;
        BigInteger expected;
        result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,3, 0);
        expected = BigInteger.TWO;
        assertEquals(expected, result);
    }

    @Test
    public void Fib5thTest() {
        BigInteger result;
        BigInteger expected;
        result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,5, 0);
        expected = BigInteger.valueOf(5);
        assertEquals(expected, result);
    }

    @Test
    public void Fib99thTest() {
        StopWatch watch = new StopWatch();
        watch.start();
        // call to the methods you want to benchmark
        BigInteger expected;
        BigInteger result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,9999, 0);
        watch.stop();
        System.out.println("Duration: " + watch.getTime());
        expected = new BigInteger("218922995834555169026");
        assertEquals(expected, result);
    }

}
