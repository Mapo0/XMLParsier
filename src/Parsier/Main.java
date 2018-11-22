package Parsier;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main   {


    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DOMParser tags= new DOMParser();
//        DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder= factory.newDocumentBuilder();
//        Document document = builder.parse(new File("games.xml"));
//
//        Element element = document.getDocumentElement();
        System.out.print(tags.dom());
    }
}
