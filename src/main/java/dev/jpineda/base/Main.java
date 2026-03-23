package dev.jpineda.base;

import com.google.gson.Gson;
import dev.jpineda.Person;

public class Main {
    static void main() {
        Person person = new Person("John Doe", 30, true);

        Gson gson = new Gson();

        String personToJson = gson.toJson(person);

        System.out.println("personToJson = " + personToJson);

        personToJson = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "isStudent": true
                }
                """;

        Person personFromJson = gson.fromJson(personToJson, Person.class);

        System.out.println("personFromJson = " + personFromJson);
    }
}
