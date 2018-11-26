import Xml.Parser;
import Xml.Unmarshalling;
import com.google.gson.Gson;
import json.Json;
import model.Categories;

public class Main   {

    private static final String XMLpath = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier1\\games.xml";
    private static final String JsonPath = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier1\\games.json";
    public static void main(String[] args) throws Exception {

        Parser parse = new Parser();
        Json json = new Json();
        Categories categories = new Categories();

        System.out.println("XML to java:");
        System.out.println(parse.parse(XMLpath).toString());
        System.out.print("Java to json:");
        json.javaToJson(parse.parse(XMLpath), JsonPath );



    }
}
