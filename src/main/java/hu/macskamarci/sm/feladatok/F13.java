package hu.macskamarci.sm.feladatok;

public class F13 {

    public static double megoldasEslo;
    public static double megoldasMasodik;

    public static void main(String[] args) {
        getMasodfukuEgyenlet(1,2,3);
    }

    public static void getMasodfukuEgyenlet(Integer a, Integer b, Integer c) {
        if (a == 0) {
            System.out.println("Az 'a' értéke nem lehet 0!");
        } else {
            Double diszkirminans = Double.valueOf((b * b) - (4 * a * c));
            if (diszkirminans < 0 ) {
                throw new NincsValosMegoldasException();
            }
            megoldasEslo = (-b - Math.sqrt(diszkirminans)) / (2 * a);
            megoldasMasodik = (-b + Math.sqrt(diszkirminans)) / (2 * a);
            System.out.println(megoldasEslo +" : "+ megoldasMasodik);
        }
    }
}
