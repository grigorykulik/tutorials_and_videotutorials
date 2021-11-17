package baeldung.jackson_annotations.JacksomInjectExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"name\":\"My bean\"}";
        InjectableValues inject = new InjectableValues.Std().addValue(int.class, 1);
        BeanWithInject bwi = new ObjectMapper().reader(inject)
                .forType(BeanWithInject.class)
                .readValue(json);
    }
}
