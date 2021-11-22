package baeldung.jackson_annotations.json_ignore_example;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @JsonIgnore annotation is used to mark a property to be ignored at the field level
 */
public class BeanWithIgnore {
    @JsonIgnore
    public int id;
    public String name;

    public BeanWithIgnore(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
