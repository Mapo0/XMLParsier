import Parsier.DOMParser;
import Parsier.Sax;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Main   {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XMLStreamException {
//        DOMParser tags= new DOMParser();
//        System.out.print(tags.dom());

        Sax stax1= new Sax();
        System.out.println(stax1.stax());
    }
}
