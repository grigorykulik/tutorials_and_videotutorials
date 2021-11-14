package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
public class GetterExample {
    public static class ExtandableBean {
        public String name;

        @JsonGetter("name")
        public String getTheName() {
            return name;
        }

        public static void main(String[] args) throws IOException {
            ExtandableBean eb = new ExtandableBean();
            eb.name = "name";

            System.out.println(new ObjectMapper().writeValueAsString(eb));
        }
    }
}
