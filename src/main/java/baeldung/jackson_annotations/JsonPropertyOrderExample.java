package baeldung.jackson_annotations;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@JsonPropertyOrder({"id", "name"})
public class JsonPropertyOrderExample {
    public static class MyBean {
        public String name;
        public int id;


        public static void main(String[] args) throws IOException {
            MyBean mb = new MyBean();
            mb.name = "name";
            mb.id = 30;

            System.out.println(new ObjectMapper().writeValueAsString(mb));
        }
    }
}
