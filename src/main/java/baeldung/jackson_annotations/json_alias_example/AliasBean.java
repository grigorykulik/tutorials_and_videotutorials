package baeldung.jackson_annotations.json_alias_example;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * The @JsonAlias defines one or more alternative names for a property during deserialization.
 */

public class AliasBean {
    @JsonAlias({"fName", "f_name"})
    public String firstName;
    public String lastName;
}
