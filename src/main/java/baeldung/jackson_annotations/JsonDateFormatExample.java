package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;
import java.util.Date;

public class JsonDateFormatExample {
    public static class EventWithFormat {
        public String name;

        @JsonFormat (
                shape = JsonFormat.Shape.STRING,
                pattern = "dd-MM-yyyy hh:mm:ss"
        )
        public Date eventDate;
    }

    public static void main(String[] args) throws JsonProcessingException {
        EventWithFormat ewf = new EventWithFormat();
        ewf.name = "some name";
        ewf.eventDate = new Date();

        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString( ewf));
    }
}
