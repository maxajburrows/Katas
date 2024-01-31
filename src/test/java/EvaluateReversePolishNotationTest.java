import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void test1() {
        String[] tokens = new String[]{"2","1","+","3","*"};
        EvaluateReversePolishNotation evaluate = new EvaluateReversePolishNotation();
        int actualResult = evaluate.evalRPN(tokens);
        int expectedResult = 9;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        String[] tokens = new String[]{"4","13","5","/","+"};
        EvaluateReversePolishNotation evaluate = new EvaluateReversePolishNotation();
        int actualResult = evaluate.evalRPN(tokens);
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test4() {
        String[] tokens = new String[]{"4","-2","/","2","-3","-","-"};
        EvaluateReversePolishNotation evaluate = new EvaluateReversePolishNotation();
        int actualResult = evaluate.evalRPN(tokens);
        int expectedResult = -7;
        assertEquals(expectedResult, actualResult);
    }
}