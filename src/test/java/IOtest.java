import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOtest {

    @Test
    public void goodCalculation() throws Exception {
        InputStream is = new ByteArrayInputStream("scalc '5,4'\r\n".getBytes(StandardCharsets.UTF_8));
        System.setIn(is);
        ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
        System.setOut(new PrintStream(bos));
        Main.main(null);

        assertEquals("9\r\n", bos.toString());
    }
    @Test
    public void testString(){
        InputStream is = new ByteArrayInputStream("scalc '1,2,3'\n".getBytes(StandardCharsets.UTF_8));
        System.setIn(is);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String substring = input.substring(7, input.length() - 1);
        System.out.println(substring);
    }
}
