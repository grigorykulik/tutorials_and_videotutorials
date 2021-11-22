package baeldung.jackson_annotations.json_include_example;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * We can use @JsonInclude to exclude properties with empty/null/default values.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyBean {
    public int id;
    public String name;
}
