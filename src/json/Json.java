package json;

import Xml.Parser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Categories;

import java.io.FileWriter;
import java.io.IOException;


public class Json {

    public  void javaToJson (Categories categories , String path) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson =gsonBuilder.create();
        String json = gson.toJson(categories);
        System.out.print(json);

        try ( FileWriter writer = new FileWriter(path)){
                gson.toJson(categories, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

