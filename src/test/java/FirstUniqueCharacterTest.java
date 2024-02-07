import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    void test1() {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        int expectedResult = 0;
        String s = "leetcode";
        int actualResult = firstUniqueCharacter.firstUniqChar(s);
        assertEquals(expectedResult,actualResult);
    }

}