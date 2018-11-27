package Xml;

import model.Categories;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Marshalling {

    public void marshalling (Categories categories, String path) {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(Categories.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.marshal(categories, file);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(categories, System.out);
        } catch (JAXBException e) {
            System.err.print(e.getMessage());
        }
    }
}
