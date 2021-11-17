package baeldung.jackson_annotations.json_creator_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";
        BeanWithCreator bwc = new ObjectMapper()
                .readerFor(BeanWithCreator.class)
                .readValue(json);
    }
}
