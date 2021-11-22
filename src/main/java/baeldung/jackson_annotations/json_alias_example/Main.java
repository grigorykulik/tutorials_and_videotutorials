package baeldung.jackson_annotations.json_alias_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"fName\": \"John\", \"lastName\": \"Green\"}";
        AliasBean ab = new ObjectMapper()
                .readerFor(AliasBean.class)
                .readValue(json);
    }
}
