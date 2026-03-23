package dev.jpineda;

import com.google.gson.Gson;

public class Main {
    static void main() {
        Person person = new Person("John Doe", 30, true);

        Gson gson = new Gson();

        String jsonPerson = gson.toJson(person);

        System.out.println("jsonPerson = " + jsonPerson);
    }
}
