import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void testAddOnEmptyReturnsZero(){
        assertEquals(0, new StringCalculator().Add(""));
    }
    @Test
    void testAddOneNumber(){
        assertEquals(7, new StringCalculator().Add("7"));
    }
    @Test
    void testAddTwoNumber(){assertEquals(16, new StringCalculator().Add("9,7"));}
    @Test
    void testAddSixNumber(){assertEquals(22, new StringCalculator().Add("9,7,3,1,0,2"));}
    @Test
    void testNewLineDelimiter(){
        assertEquals(20, new StringCalculator().Add("9\n7\n3\n1"));
    }
    @Test
    void testMixedDelimiters(){assertEquals(28, new StringCalculator().Add("9\n7,3\n1,8"));}
    @Test
    void testAlphabeticOwnDelimiters(){assertEquals(28, new StringCalculator().Add("k\n9k7k3k1k8"));}
}
