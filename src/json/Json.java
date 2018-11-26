package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Categories;

import java.io.FileReader;
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

    public Categories  jsonToJava (String path){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson =gsonBuilder.create();


        try(FileReader reader = new FileReader(path)){
            return gson.fromJson(reader , Categories.class);
        } catch ( IOException e){
            e.printStackTrace();
        }
        return null;
    }
    }

