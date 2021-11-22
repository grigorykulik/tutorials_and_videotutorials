package baeldung.jackson_annotations.json_deserialize_example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

/**
 * @JsonDeserialize indicates the use of a custom deserializer.
 */
public class EventWithSerializer {
    public String name;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public Date date = new Date();
}
