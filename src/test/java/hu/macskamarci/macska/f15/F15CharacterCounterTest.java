package hu.macskamarci.macska.f15;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class F15CharacterCounterTest {
    private static final String FILENAME = "c:\\Temp\\valami.txt";
    private static final Charset CHARSET = StandardCharsets.UTF_8;
    private String content;
    private F15CharacterCounter characterCounter;

    @Before
    public void setUp() throws Exception {
        characterCounter = new F15CharacterCounter(FILENAME, CHARSET);
        createValami();
    }

    @Test
    public void firstTestWithOneChar() {
        char[] text = "a".toCharArray();
        Map<Character, Long> result = characterCounter.doCount(text);
        assertEquals(1, result.size());
        assertEquals(1L, result.get('a').longValue());
    }

    @Test
    public void firstTestWithHungarianChar() {
        char[] text = "á".toCharArray();
        Map<Character, Long> result = characterCounter.doCount(text);
        assertEquals(1, result.size());
        assertEquals(1L, result.get('á').longValue());
    }

    @Test
    public void firstTestLongText() {
        char[] text = "Ez itt egy próba szöveg.".toCharArray();
        Map<Character, Long> result = characterCounter.doCount(text);
        assertEquals(17, result.size());
        assertEquals(2L, result.get('t').longValue());
        assertEquals(2L, result.get('z').longValue());
        assertEquals(1L, result.get('E').longValue());
        assertEquals(1L, result.get('.').longValue());
    }

    @Test
    public void fileReadTest() throws IOException {
        Map<Character, Long> result = characterCounter.readFile();
        assertEquals(17, result.size());
        assertEquals(2L, result.get('t').longValue());
        assertEquals(2L, result.get('z').longValue());
        assertEquals(1L, result.get('E').longValue());
        assertEquals(1L, result.get('.').longValue());
        assertEquals(1L, result.get('ó').longValue());
    }

    @Test(expected = SomethingWentWrong.class)
    public void fileReadFailsTest() throws IOException {
        deleteValami();
        Map<Character, Long> result = characterCounter.readFile();
    }

    private void createValami() {
        String text = "Ez itt egy próba szöveg.";
        File file = new File(FILENAME);
        try {
            FileWriter output = new FileWriter(FILENAME);
            output.write(text);
            output.close();
        } catch (Exception e) {
        }
    }

    private void deleteValami() {
        File file = new File(FILENAME);
        try {
            file.delete();
        } catch (Exception e) {
        }
    }
}