package hu.macskamarci.sm.feladatok;

import java.awt.*;

public class F20 {

    static double getDistance(Point first, Point second) {
        return Math.sqrt(Math.pow(second.getX() - first.getX(), 2) + Math.pow(second.getY() - first.getY(), 2));
    }
}
