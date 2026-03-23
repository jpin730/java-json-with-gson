package dev.jpineda.files;

import com.google.gson.Gson;
import dev.jpineda.Person;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    static void main() {
        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader("person.json")) {
            Person personFromJson = gson.fromJson(fileReader, Person.class);
            System.out.println("Person read from file: " + personFromJson);
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
