package jr.json_example.example3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murks";
        cat.age = 8;

        Dog dog = new Dog();
        dog.name = "KillerDog";
        dog.age = 4;
        dog.owner = "sb";

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, pets);
        System.out.println(writer.toString());
    }
}
