package baeldung.jackson_annotations.polymorphic_annotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataInput;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Zoo.Dog dog = new Zoo.Dog("lacy");
        Zoo zoo = new Zoo(dog);

        String result = new ObjectMapper()
                .writeValueAsString(zoo);

        System.out.println(result);

        String json = "{\"animal\":{\"type\":\"cat\",\"name\":\"cat\"}}";
        Zoo.Cat cat = new ObjectMapper()
                .readerFor(Zoo.Cat.class)
                .readValue(json);
    }
}
