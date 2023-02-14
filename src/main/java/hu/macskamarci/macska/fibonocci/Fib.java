package hu.macskamarci.macska.fibonocci;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Fib {

    public BigInteger calculate(int number) {
        BigInteger result = BigInteger.ONE;
        BigInteger prevMinus1 = BigInteger.ONE;
        BigInteger prevMinus2 = BigInteger.ZERO;
        for (int index = 1; index < number; index++) {
            result = prevMinus1.add(prevMinus2);
            prevMinus2 = prevMinus1;
            prevMinus1 = result;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        Fib fib = new Fib();

        System.out.println("Which element of Fibonacci do you want to calculate?");
        try (Scanner s = new Scanner(System.in)) {
            int i = s.nextInt();
            System.out.println(i);

            BigInteger result = fib.calculate(i);
            System.out.println("The " + i + "nd element is " + result );
        }

    }

}
