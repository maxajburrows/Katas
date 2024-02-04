import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {
    @Test
    void test1() {
        String s = "a";
        String t = "a";
        String expectedResult = "a";
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String actualResult = minimumWindowSubstring.minWindow(s, t);
        assertEquals(expectedResult, actualResult);
    }
}