package hu.idom.jarmu.tomlek.core.scheduler;

import java.util.ArrayList;
import java.util.List;

public class F14 {

    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(Math.random()*30);
        }
        System.out.println(lista.toString());
        System.out.println("Van nagyobb eltérés mint 10: " + getAtlagtol10NagyobbElteres(lista));
    }

    private static boolean getAtlagtol10NagyobbElteres(List<Double> lista) {
        Double max = Double.valueOf(0);
        Double sum = Double.valueOf(0);
        for (Double s:
                lista) {
            sum += s;
            if (max < s) {
                max = s;
            }
        }
        System.out.println(sum + " : " + max);
        return (sum / lista.size() + 10) < max;
    }
}
