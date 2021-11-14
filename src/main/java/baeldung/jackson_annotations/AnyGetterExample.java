package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

@JsonAutoDetect
public class AnyGetterExample {
    public static class ExtandableBean {
        public String name;

        @JsonIgnore
        public Map<String, String> properties = new HashMap<>();

        @JsonAnyGetter
        public Map<String, String> getProperties() {
            return properties;
        }

        public static void main(String[] args) throws IOException {
            ExtandableBean eb = new ExtandableBean();
            eb.name = "name";
            eb.properties.put("something", "something_else");
            System.out.println(new ObjectMapper().writeValueAsString(eb));
        }
    }

}


