package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;

public class JsonRootNameExample {

    @JsonRootName(value = "some value")
    public static class UserWithRoot {
        public int id;
        public String name;


        public static void main(String[] args) throws IOException {
            UserWithRoot uwr = new UserWithRoot();
            uwr.id = 1;
            uwr.name = "name";

            StringWriter writer = new StringWriter();
            ObjectMapper mapper = new ObjectMapper();
            // attention! does not work without the line below
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            mapper.writeValue(writer, uwr);
            System.out.println(writer);
        }
    }
}
