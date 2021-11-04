package jr.string_reader_writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StringReaderExample {
    public static void main(String[] args) throws IOException {
        String text = "Hi!\n My name is Richard\n I'm a photographer\n";

        // это строчка – ключевая: мы «превратили» строку в Reader
        StringReader reader = new StringReader(text);

        executor(reader);
    }

    public static void executor(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine())!= null) {
            System.out.println(line);
        }
    }
}
