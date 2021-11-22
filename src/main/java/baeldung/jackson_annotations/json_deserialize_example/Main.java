package baeldung.jackson_annotations.json_deserialize_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"name\":\"party\",\"eventDate\":\"20-12-2014 02:30:00\"}";
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        EventWithSerializer event = new ObjectMapper()
                .readerFor(EventWithSerializer.class)
                .readValue(json);
    }
}
