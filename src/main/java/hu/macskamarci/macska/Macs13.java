package hu.macskamarci.macska;

public class Macs13 {
    public static void main(String[] args) {
        //running code in the future
    }

    public Pair calculate(int a, int b, int c) {
        checkA(a);
        double discriminant = b * b - 4f * a * c;
        checkDiscriminant(discriminant);
        Pair result = new Pair();
        result.x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        result.x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return result;
    }

    private void checkDiscriminant(double discriminant) {
        if (discriminant < 0) throw new ThereIsNoRealRoots();
    }

    private void checkA(int a) {
        if (a == 0) throw new AMustBeNot0();
    }
}