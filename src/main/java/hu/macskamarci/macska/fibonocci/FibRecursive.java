package hu.macskamarci.macska.fibonocci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibRecursive {

    BigInteger result = BigInteger.ZERO;

    public BigInteger calculate(BigInteger prevminus2, BigInteger prevminus1, int n, int i) {
             if ( i< n) {
                result = prevminus1.add(prevminus2);
                calculate(prevminus1, result, n, ++i);
            }
        return result;

    }

    public static void main(String[] args)  {
        FibRecursive fibRecursive = new FibRecursive();

        System.out.println("Which element of Fibonacci do you want to calculate?");
        try (Scanner s = new Scanner(System.in)) {
            int i = s.nextInt();
            System.out.println(i);

            BigInteger result = fibRecursive.calculate(BigInteger.ONE, BigInteger.ZERO,99, 0);
            System.out.println("The " + i + "nd element is " + result );
        }

    }

}
