package baeldung.jackson_annotations.json_serialize_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        EventWithSerializer ews = new EventWithSerializer();
        ews.name = "name";
        ews.eventDate = new Date();

        System.out.println(new ObjectMapper().writeValueAsString(ews));
    }
}
