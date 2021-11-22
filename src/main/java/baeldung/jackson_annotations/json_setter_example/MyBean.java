package baeldung.jackson_annotations.json_setter_example;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @JsonSetter is an alternative to @JsonProperty that marks the method as a setter method.
 */
public class MyBean {
    public int id;
    private String name;

    @JsonSetter("name")
    public void setTheName(String name) {
        this.name = name;
    }
}
