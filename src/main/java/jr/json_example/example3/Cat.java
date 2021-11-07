package jr.json_example.example3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Cat extends Pet {
    public int age;
}
