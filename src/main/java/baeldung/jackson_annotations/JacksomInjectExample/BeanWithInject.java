package baeldung.jackson_annotations.JacksomInjectExample;

import com.fasterxml.jackson.annotation.JacksonInject;

/**
 * @JacksonInject indicates that a property will get its value from the injection and not from the JSON data.
 */
public class BeanWithInject {
    @JacksonInject
    public int id;
    public String name;
}
