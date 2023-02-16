package hu.macskamarci.sm.feladatok.f13;

import hu.macskamarci.sm.feladatok.NincsValosMegoldasException;

public class F13 {

    public static void main(String[] args) {
        getMasodfukuEgyenlet(1, 2, 3);
    }

    public static Result getMasodfukuEgyenlet(Integer a, Integer b, Integer c) {
        Result result = null;
        if (a == 0) {
            System.out.println("Az 'a' értéke nem lehet 0!");
        } else {
            Double diszkirminans = Double.valueOf((b * b) - (4 * a * c));
            if (diszkirminans < 0) {
                throw new NincsValosMegoldasException();
            }
            result = new Result(
                    Double.valueOf(-b - Math.sqrt(diszkirminans) / (2 * a)),
                    Double.valueOf(-b + Math.sqrt(diszkirminans) / (2 * a))
            );
            System.out.println(result.x1() + " : " + result.x2());
        }
        return result;
    }
}
