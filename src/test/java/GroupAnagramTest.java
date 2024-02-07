import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void test1() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagram.groupAnagrams(strs);
    }

}