package dev.jpineda.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class PersonSaver {
    static void main() {
        List<Person> people = Arrays.asList(
                new Person("John", 30, true, Arrays.asList("Reading", "Swimming")),
                new Person("Jane", 25, false, Arrays.asList("Cooking", "Traveling")),
                new Person("Bob", 40, true, Arrays.asList("Hiking", "Gaming"))
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter fileWriter = new FileWriter("person.json")) {
            gson.toJson(people, fileWriter);
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
