package dev.jpineda.files;

import com.google.gson.Gson;
import dev.jpineda.Person;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    static void main() {
        Person person = new Person("John Doe", 30, true);

        Gson gson = new Gson();

        try (FileWriter fileWriter = new FileWriter("person.json")) {
            gson.toJson(person, fileWriter);
            System.out.println("Person written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
