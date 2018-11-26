import Xml.Parser;
import Xml.Unmarshalling;

public class Main   {

    private static final String XMLpath = "C:\\Users\\Marat_Gabdrakhmanov\\IdeaProjects\\XMLParsier1\\games.xml";
    public static void main(String[] args) throws Exception {

        Parser parse = new Parser();

        System.out.println("XML to java:");
        System.out.println(parse.parse(XMLpath).toString());


    }
}
