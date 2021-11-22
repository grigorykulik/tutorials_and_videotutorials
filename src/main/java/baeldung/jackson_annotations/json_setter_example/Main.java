package baeldung.jackson_annotations.json_setter_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"id\":1,\"name\":\"My bean\"}";
        MyBean mb = new ObjectMapper()
                .readerFor(MyBean.class)
                .readValue(json);
    }
}
