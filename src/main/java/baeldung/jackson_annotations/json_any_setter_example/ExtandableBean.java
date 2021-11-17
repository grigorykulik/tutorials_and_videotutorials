package baeldung.jackson_annotations.json_any_setter_example;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * @JsonAnySetter allows us the flexibility of using a Map as standard properties.
 * On deserialization, the properties from JSON will simply be added to the map.
 */
public class ExtandableBean {
    public String name;
    private Map<String, String> properties = new HashMap<>();

    @JsonAnySetter
    public void add(String key, String value) {
        properties.put(key, value);
    }
}
