package dev.jpineda.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConfigSaver {
    public static void saveConfig(AppConfig config, String filePath) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            gson.toJson(config, fileWriter);
            System.out.println("Config saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving config: " + e.getMessage());
        }
    }

    static void main() {
        AppConfig config = ConfigLoader.loadConfig("config.json");

        if (config != null) {
            config.getSettings().setTheme("light");
            saveConfig(config, "config.json");
        }
    }
}
