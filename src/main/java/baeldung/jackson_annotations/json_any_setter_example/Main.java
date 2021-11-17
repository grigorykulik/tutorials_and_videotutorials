package baeldung.jackson_annotations.json_any_setter_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";
        ExtandableBean eb = new ObjectMapper().readerFor(ExtandableBean.class).readValue(json);
    }
}
