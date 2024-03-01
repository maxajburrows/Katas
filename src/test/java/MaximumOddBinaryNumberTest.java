import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {
    @Test
    void test1() {
        MaximumOddBinaryNumber maximumOddBinaryNumber = new MaximumOddBinaryNumber();
        String s = "0101";
        String expectedResult = "1001";
        String actualResult = maximumOddBinaryNumber.maximumOddBinaryNumber(s);
        assertEquals(expectedResult, actualResult);
    }

}