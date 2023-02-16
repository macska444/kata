package hu.macskamarci.macska.f15;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class F15CharacterCounter {
    private static final String DEFAULTFILENAME = "c:\\Temp\\valami.txt";
    private static final Charset DEFAULTCHARSET = StandardCharsets.UTF_8;
    private final String filename;
    private final Charset charset;
    private PrintStream out;

    public F15CharacterCounter(String filename, Charset charset) {
        this.filename = filename;
        this.charset = charset;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        F15CharacterCounter counter = new F15CharacterCounter(DEFAULTFILENAME, DEFAULTCHARSET);

        counter.init();
        Map<Character, Long> result = counter.readFile();
        long i = 0;
        counter.out.println("A következő karakterek találhatóak a fájlban:");
        for (Map.Entry<Character, Long> entry : result.entrySet()) {
            counter.out.println(i++ + ". '" + entry.getKey() + "': " + entry.getValue());
        }
    }

    private void init() throws UnsupportedEncodingException {
        createValami();
        out = new PrintStream(System.out, true, "UTF-8");
    }

    public Map<Character, Long> readFile() throws SomethingWentWrong {
        File file = new File(filename);

        try (FileReader fr = new FileReader(file, charset)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);

            return doCount(chars);
        } catch (Exception e) {
            throw new SomethingWentWrong();
        }
    }

    protected Map<Character, Long> doCount(char[] text) {
        Map<Character, Long> result = new HashMap<>();

        for (char c : text) {
            if (c != '\u0000') increment(c, result);
        }
        return result;
    }

    private void increment(char c, Map<Character, Long> result) {
        result.put(c, result.get(c) == null ? 1 : result.get(c) + 1);
    }

    private void createValami() {
        String text = "Ez itt egy próba szöveg.";
        try (FileWriter output = new FileWriter(DEFAULTFILENAME)) {
            output.write(text);
        } catch (Exception ignored) {
            //ignored
        }

    }

}
