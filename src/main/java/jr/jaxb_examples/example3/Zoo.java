package jr.jaxb_examples.example3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "zoo")
@XmlRootElement
public class Zoo
{
    @XmlElementWrapper(name="wild-animals", nillable = true)
    @XmlElement(name = "tiger")
    public List animals = new ArrayList<>();
}
