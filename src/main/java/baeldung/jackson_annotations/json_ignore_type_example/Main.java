package baeldung.jackson_annotations.json_ignore_type_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        User.Name name = new User.Name();
        name.firstName = "firstName";
        name.lastName = "lastName";

        User u = new User(1, name);
        System.out.println(new ObjectMapper().writeValueAsString(u));
    }
}
