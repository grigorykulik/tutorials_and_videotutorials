package baeldung.jackson_annotations.json_serialize_example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class EventWithSerializer {
    public String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date eventDate;
}
