package dev.jpineda.nested;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class PersonLoader {
    static void main() {
        Gson gson = new Gson();
        Type peopleType = new TypeToken<List<Person>>() {
        }.getType();

        try (FileReader fileReader = new FileReader("person.json")) {
            List<Person> people = gson.fromJson(fileReader, peopleType);
            System.out.println("people = ");
            for (Person person : people) {
                System.out.println("  " + person);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
