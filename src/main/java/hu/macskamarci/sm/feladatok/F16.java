package hu.macskamarci.sm.feladatok;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class F16 {
    public static void main(String[] args) {
        System.out.println(getIdoToSec(5744));
    }

    public static String getIdoToSec(int afterSec) {

        //int houre = afterSec / (60 * 60);
        //int min = (afterSec % (60 * 60)) / 60;
        //int sec = afterSec % 60;

        Duration present = Duration.of(afterSec, ChronoUnit.SECONDS);
        return String.format("%02d:%02d:%02d", present.toHoursPart(), present.toMinutesPart(), present.toSecondsPart());
        //return String.format("%02d", houre) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec);
    }
}
