package hu.macskamarci.sm.fibonacci;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void teszt(){
        assertEquals(BigInteger.ZERO, Fibonacci.getElement(0));
        assertEquals(BigInteger.ONE, Fibonacci.getElement(1));
        assertEquals(BigInteger.ONE, Fibonacci.getElement(2));
        assertEquals(BigInteger.valueOf(5), Fibonacci.getElement(5));
    }

}