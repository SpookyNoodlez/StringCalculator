import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    @Test
    void testAddOnEmptyReturnsZero() throws Exception {
        assertEquals(0, new StringCalculator().Add(""));
    }
    @Test
    void testAddOneNumber() throws Exception {
        assertEquals(7, new StringCalculator().Add("7"));
    }
    @Test
    void testAddTwoNumber() throws Exception {assertEquals(16, new StringCalculator().Add("9,7"));}
    @Test
    void testAddSixNumber() throws Exception {assertEquals(22, new StringCalculator().Add("9,7,3,1,0,2"));}
    @Test
    void testNewLineDelimiter() throws Exception {
        assertEquals(20, new StringCalculator().Add("9\n7\n3\n1"));
    }
    @Test
    void testMixedDelimiters() throws Exception {assertEquals(28, new StringCalculator().Add("9\n7,3\n1,8"));}
    @Test
    void testAlphabeticOwnDelimiters() throws Exception {assertEquals(28, new StringCalculator().Add("k\n9k7k3k1k8"));}
    @Test
    void testThrowsExceptionWhenNegative() {
        Exception exception = assertThrows(Exception.class, () ->
                new StringCalculator().Add("3-1"));

        //assertEquals("Negatives not allowed -1", exception.getMessage());
    }

}
