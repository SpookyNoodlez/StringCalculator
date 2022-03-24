import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class StringCalculatorTest {
    private Logger mockLogger;
    private Logger stubLogger;

    @BeforeEach
    void initMockLogger(){
        mockLogger = mock(Logger.class);
        stubLogger = new LoggerStub();
    }


    @Test
    void testAddOnEmptyReturnsZero() throws Exception {
        assertEquals(0, new StringCalculator(stubLogger).Add(""));
    }
    @Test
    void testAddOneNumber() throws Exception {
        assertEquals(7, new StringCalculator(stubLogger).Add("7"));
    }
    @Test
    void testAddTwoNumber() throws Exception {assertEquals(16, new StringCalculator(stubLogger).Add("9,7"));}
    @Test
    void testAddSixNumber() throws Exception {assertEquals(22, new StringCalculator(stubLogger).Add("9,7,3,1,0,2"));}
    @Test
    void testNewLineDelimiter() throws Exception {
        assertEquals(20, new StringCalculator(new LoggerStub()).Add("9\n7\n3\n1"));
    }
    @Test
    void testMixedDelimiters() throws Exception {assertEquals(28, new StringCalculator(stubLogger).Add("9\n7,3\n1,8"));}
    @Test
    void testAlphabeticOwnDelimiters() throws Exception {assertEquals(28, new StringCalculator(stubLogger).Add("k\n9k7k3k1k8"));}
    @Test
    void testThrowsExceptionWhenNegative() {
        Exception exception = assertThrows(Exception.class, () ->
                new StringCalculator(stubLogger).Add("3-1"));

        //assertEquals("Negatives not allowed -1", exception.getMessage());
    }
    @Test
    void testLogCalledOnBigNumber() throws Exception {
        StringCalculator calculator = new StringCalculator(mockLogger);
        calculator.Add("2345");
        verify(mockLogger, times(1)).log(2345);
    }
}
