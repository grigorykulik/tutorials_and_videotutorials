package jr.json_example.example1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Cat {
    public String name;
    public int age;
    public int weight;

    Cat(){}
}
