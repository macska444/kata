package hu.macskamarci.macska.f14;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class F14 {
    private static final double TEN = 10.0f;

    public static void main(String[] args) {

    }

    public int execute(double[] myArray) {
        double average = getAverage(myArray);
        System.out.println("az átlag: " + average);
        return IntStream.range(0, myArray.length)
                .filter(i -> abs(average - myArray[i]) < TEN)
                .findFirst()
                .orElse(-1);
    }

    private double getAverage(double[] myArray) {
        return Arrays.stream(myArray).sum()/myArray.length;
    }
}
