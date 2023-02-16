package hu.macskamarci.sm.feladatok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class F15 {
    public static Map<String, Integer> abc = new TreeMap<>();

    public static void main(String[] args) {
        Path path = Path.of("C:\\temp\\asz\\temp2023021411140062\\KSH2_20230214111401.txt");
        getWordNumberInFile(path);
        abc.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public static Map<String, Integer> getWordNumberInFile(String path) {
        return getWordNumberInFile(Path.of(path));
    }

    public static Map<String, Integer> getWordNumberInFile(Path path) {
        try {
            Files.lines(path).forEach(e -> addMap(e));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return abc;
    }

    private static void addMap(String e) {
        for (String s : e.split("")) {
            if (abc.containsKey(s)) {
                abc.computeIfPresent(s, (k, v) -> v + 1);
            } else {
                abc.put(s, 1);
            }
        }
    }
}
