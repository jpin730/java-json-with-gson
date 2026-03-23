package dev.jpineda.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dev.jpineda.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonWriterReaderList {
    static void main() {
        Gson gson = new Gson();

        ArrayList<Person> peopleFromJson = new ArrayList<>();

        try (FileReader fileReader = new FileReader("person.json")) {
            Type peopleType = new TypeToken<ArrayList<Person>>() {
            }.getType();
            peopleFromJson = gson.fromJson(fileReader, peopleType);
            System.out.println("People read from file: " + peopleFromJson);
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        peopleFromJson.add(new Person("John Doe", 30, true));

        try (FileWriter fileWriter = new FileWriter("person.json")) {
            gson.toJson(peopleFromJson, fileWriter);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
