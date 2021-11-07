package jr.json_example.example3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Dog extends Pet {
    public int age;
    public String owner;
}
