import Xml.Parser;
import Xml.Marshalling;
import json.Json;

public class Main   {

    private static final String XML = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier3\\games.xml";
    private static final String Json = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier3\\games.json";
    private static final String NewXML = "game.xml";
    public static void main(String[] args) throws Exception {

        Parser parse = new Parser();
        Json json = new Json();
        Marshalling marshalling = new Marshalling();

        System.out.println("XML to java:");
        System.out.println(parse.parse(XML).toString());

        System.out.println("\n Java to json:");
        json.javaToJson(parse.parse(XML), Json );

        System.out.println("\n Json to java:");
        System.out.println(json.jsonToJava(Json).toString());

        System.out.println("\n java to xml:");
        marshalling.marshalling(json.jsonToJava(Json), NewXML);
    }
}
