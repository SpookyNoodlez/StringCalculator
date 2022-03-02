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
    void testAddTwoNumber(){
        assertEquals(16, new StringCalculator().Add("9,7"));
    }
    @Test
    void testAddSixNumber(){
        assertEquals(22, new StringCalculator().Add("9,7,3,1,0,2"));
    }
}
