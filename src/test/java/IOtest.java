import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IOtest {

    @Test
    public void goodCalculation() throws Exception {
        InputStream is = new ByteArrayInputStream("scalc '5,4'".getBytes(StandardCharsets.UTF_8));
        System.setIn(is);
        ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
        System.setOut(new PrintStream(bos));
        Main.main(null);

        assertEquals("9\r\n", bos.toString());
    }
}
