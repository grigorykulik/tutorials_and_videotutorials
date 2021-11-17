package baeldung.jackson_annotations.json_creator_example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * We can use the @JsonCreator annotation to tune the constructor/factory used in deserialization.
 */

public class BeanWithCreator {
    public int id;
    public String name;

    @JsonCreator
    public BeanWithCreator(@JsonProperty("id") int id, @JsonProperty("theName") String name) {
        this.id = id;
        this.name = name;
    }
}
