package jr.json_example.example1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();

        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем во Writer(StringWriter)
        StringWriter sw = new StringWriter();

        //это объект Jackson, который выполняет сериализацию
        ObjectMapper om = new ObjectMapper();

        // сама сериализация: 1-куда, 2-что
        om.writeValue(sw, cat);

        //преобразовываем все записанное во StringWriter в строку
        String result = sw.toString();

        System.out.println(result);
    }
}
