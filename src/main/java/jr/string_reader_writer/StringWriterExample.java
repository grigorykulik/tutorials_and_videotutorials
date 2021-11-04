package jr.string_reader_writer;

import java.io.*;

public class StringWriterExample {
    public static void main(String[] args) throws IOException {
        //эту строку должен будет прочитать Reader
        String text = "Hi!\n My name is Richard\n I'm a photographer\n";

        //заворачиваем строку в StringReader
        StringReader reader = new StringReader(text);

        //Создаем объект StringWriter
        StringWriter writer = new StringWriter();

        //переписываем строки из Reader во Writer, предварительно развернув их
        executor(reader, writer);

        //выводем полученный из Writer’а текст на экран
        System.out.println(writer.toString());
    }

    public static void executor(Reader reader, Writer writer) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder(line);
            writer.append(sb.reverse().toString());
        }
    }
}
