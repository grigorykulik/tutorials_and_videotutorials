package jr.jaxb_examples.example2;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "cat")
@XmlRootElement
public class Cat
{
    public String name;
    public int age;
    public int weight;

    public Cat() {
    }
}
