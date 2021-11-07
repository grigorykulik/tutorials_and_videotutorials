package jr.json_example.example1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;

public class JsonExampleDeserialization {
    public static void main(String[] args) throws IOException {
        String json = "{ \"name\":\"Murka\", \"age\":5, \"weight\":4}";
        StringReader reader = new StringReader(json);

        ObjectMapper mapper = new ObjectMapper();
        Cat cat = mapper.readValue(reader, Cat.class);
    }
}
