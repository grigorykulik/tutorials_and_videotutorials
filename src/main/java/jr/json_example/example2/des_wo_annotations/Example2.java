package jr.json_example.example2.des_wo_annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example2 {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"name\":\"Murka\",\"cats\":[{\"name\":\"Timka\"},{\"name\":\"Killer\"}]}";
        ObjectMapper mapper = new ObjectMapper();
        Cat cat = mapper.readValue(json, Cat.class);
        System.out.println(cat);
        System.out.println(cat.cats.getClass());
    }
}
