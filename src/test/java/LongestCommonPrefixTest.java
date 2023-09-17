import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class LongestCommonPrefixTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void testTwoStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("flow", result);
    }

    @Test
    public void testThreeStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");
        strings.add("flight");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("fl", result);
    }

    @Test
    public void testNoCommonPrefix() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("racecar");
        strings.add("car");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("", result);
    }

    @Test
    public void testEmptyArray() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("", result);
    }

    @Test
    public void testOneString() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("", result);
    }

    @Test
    public void testCapitals() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("DOG");
        strings.add("door");
        strings.add("Dough");

        String result = app.findLongestCommonPrefix(strings);
        assertEquals("do", result);
    }

}