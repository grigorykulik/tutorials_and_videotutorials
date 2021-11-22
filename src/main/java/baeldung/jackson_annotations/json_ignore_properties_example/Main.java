package baeldung.jackson_annotations.json_ignore_properties_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        BeanWithIgnore bean = new BeanWithIgnore(1, "My bean");
        String value = new ObjectMapper().writeValueAsString(bean);
        System.out.println(value);
    }
}
