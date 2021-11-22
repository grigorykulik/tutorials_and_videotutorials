package baeldung.jackson_annotations.json_include_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        MyBean bean = new MyBean();
        bean.id = 2;

        System.out.println(new ObjectMapper().writeValueAsString(bean));
    }
}
