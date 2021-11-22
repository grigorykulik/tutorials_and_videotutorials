package baeldung.jackson_annotations.json_ignore_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        BeanWithIgnore bw = new BeanWithIgnore(1, "name");
        String result = new ObjectMapper().writeValueAsString(bw);
        System.out.println(result);
    }
}
