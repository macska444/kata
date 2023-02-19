package hu.macskamarci.sm.feladatok;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.Year;

public class F18 {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println(getYearPercent(LocalDateTime.now()));
    }

    static String getYearPercent(LocalDateTime ldt) {
        if (Year.of(ldt.getYear()).isLeap()) {
            return decfor.format(ldt.getDayOfYear() / 366.0 * 100);
        }
        return decfor.format(ldt.getDayOfYear() / 365.0 * 100);
    }
}
