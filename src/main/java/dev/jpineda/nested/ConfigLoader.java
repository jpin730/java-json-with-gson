package dev.jpineda.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static AppConfig loadConfig(String filePath) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try (FileReader fileReader = new FileReader(filePath)) {
            return gson.fromJson(fileReader, AppConfig.class);
        } catch (IOException e) {
            System.out.println("Error reading config: " + e.getMessage());
            return null;
        }
    }

    static void main() {
        AppConfig config = loadConfig("config.json");

        if (config != null) {
            System.out.println("App Name: " + config.getAppName());
            System.out.println("Version: " + config.getVersion());
            System.out.println("Settings:");
            System.out.println("  Theme: " + config.getSettings().getTheme());
            System.out.println("  Notifications Enabled: " + config.getSettings().isNotificationEnabled());
            System.out.println("  Language: " + config.getSettings().getLanguage());
        }
    }
}
