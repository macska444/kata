package hu.macskamarci.sm.feladatok;

public class F19 {

    static boolean isRealHunEmailAddres(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+hu$");
    }
}
