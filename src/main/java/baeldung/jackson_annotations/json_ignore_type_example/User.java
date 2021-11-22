package baeldung.jackson_annotations.json_ignore_type_example;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

/**
 * @JsonIgnoreType marks all properties of an annotated type to be ignored
 */

public class User {
    public int id;
    public Name name;

    @JsonIgnoreType
    public static class Name {
        public String firstName;
        public String lastName;
    }

    public User(int id, Name name) {
        this.id = id;
        this.name = name;
    }
}
