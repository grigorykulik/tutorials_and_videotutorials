package jr.jaxb_examples.example1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Cat cat = new Cat();
        cat.name ="Murka";
        cat.age = 5;
        cat.weight = 3;

        StringWriter writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(cat, writer);

        System.out.println(writer);
    }
}
