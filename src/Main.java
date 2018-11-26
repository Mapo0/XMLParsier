import Xml.Parser;
import Xml.Unmarshalling;
import com.google.gson.Gson;
import json.Json;
import model.Categories;

public class Main   {

    private static final String XML = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier1\\games.xml";
    private static final String Json = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier1\\games.json";
    private static final String NewXML = "game.xml";
    public static void main(String[] args) throws Exception {

        Parser parse = new Parser();
        Json json = new Json();
        Unmarshalling unmarshalling = new Unmarshalling();

        System.out.println("XML to java:");
        System.out.println(parse.parse(XML).toString());

        System.out.println("\n Java to json:");
        json.javaToJson(parse.parse(XML), Json );

        System.out.println("\n Json to java:");
        System.out.println(json.jsonToJava(Json).toString());

        System.out.println("\n Json to java:");
        unmarshalling.unmarshalling(json.jsonToJava(Json), NewXML);
    }
}
