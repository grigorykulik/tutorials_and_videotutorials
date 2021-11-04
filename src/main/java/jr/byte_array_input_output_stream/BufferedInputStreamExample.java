package jr.byte_array_input_output_stream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
        InputStream is = new ByteArrayInputStream(test.getBytes(StandardCharsets.UTF_8));

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        executor(is, bos);

        String result = bos.toString();
        System.out.println(result);
    }

    private static void executor(InputStream is, OutputStream os) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);

        while (bis.available() > 0) {
            int data = bis.read();
            os.write(data);
        }
    }
}
