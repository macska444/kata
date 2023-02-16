package hu.macskamarci.macska.f16;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class F16 {
    private F16() {
    }

    public static String calculateTime(long secunds) {
        LocalDateTime midnight = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        LocalDateTime present = midnight.plusSeconds(secunds);
        String result = String.format("%02d:%02d:%02d", present.getHour(), present.getMinute(), present.getSecond());
        System.out.println(result);
        return result;
    }
}
