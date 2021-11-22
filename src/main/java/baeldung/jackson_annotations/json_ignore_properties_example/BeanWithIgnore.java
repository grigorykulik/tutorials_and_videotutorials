package baeldung.jackson_annotations.json_ignore_properties_example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @JsonIgnoreProperties is a class-level annotation that marks a property or a list of properties that Jackson will ignore.
 */

@JsonIgnoreProperties({"id"})
public class BeanWithIgnore {
    public int id;
    public String name;

    public BeanWithIgnore(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
