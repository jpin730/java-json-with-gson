package dev.jpineda.validation;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;

public class JsonValidator {
    static void main() {
        try (
                FileReader personReader = new FileReader("person.json");
                FileReader schemaReader = new FileReader("person-schema.json");

        ) {
            JSONObject schemaObject = new JSONObject(new JSONTokener(schemaReader));
            Schema schema = SchemaLoader.load(schemaObject);
            JSONArray peopleJsonArray = new JSONArray(new JSONTokener(personReader));
            schema.validate(peopleJsonArray);

            for (int i = 0; i < peopleJsonArray.length(); i++) {
                System.out.println("Person " + (i + 1) + ": " + peopleJsonArray.getJSONObject(i));
            }
            System.out.println("JSON is valid against the schema.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (ValidationException e) {
            System.out.println("JSON validation failed: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
