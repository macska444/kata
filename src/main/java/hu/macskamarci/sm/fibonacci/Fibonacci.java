package hu.macskamarci.sm.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {

    private static List<BigInteger> elementList = new ArrayList<>(
            List.of(BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE));

    public static void main(String[] args) {
        IntStream.range(0, 101).forEach(i -> System.out.println(i + " : " + getElement(i)));
        System.out.println(elementList.size());
    }

    public static BigInteger getElement(int i) {
        if (elementList.size() > i) {
            return elementList.get(i);
        }
        IntStream.range(elementList.size(), i + 1).forEachOrdered(j ->
                elementList.add(j, elementList.get(j - 1).add(elementList.get(j - 2)))
        );

        return elementList.get(i);
    }
}
