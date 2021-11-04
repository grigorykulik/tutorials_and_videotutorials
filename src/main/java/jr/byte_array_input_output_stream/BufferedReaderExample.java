package jr.byte_array_input_output_stream;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
        StringReader reader = new StringReader(test);

        StringWriter writer = new StringWriter();
        executor(reader, writer);

        String result = writer.toString();
        System.out.println(result);
    }

    private static void executor(StringReader reader, StringWriter writer) throws Exception{
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            writer.write(line + "\n");
        }
    }
}
