package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonRawValueExample {

        public static class MyBean {
            public String name;

            @JsonRawValue
            public String json;


            public static void main(String[] args) throws IOException {
                MyBean mb = new MyBean();
                mb.name = "name";
                mb.json = "{\"attr\":false}";

                System.out.println(new ObjectMapper().writeValueAsString(mb));
            }
        }
}
