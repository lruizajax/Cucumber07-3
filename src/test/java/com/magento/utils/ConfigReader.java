package com.magento.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();
    private static boolean isLoaded = false;

    private ConfigReader() {
        // private constructor to prevent instantiation
    }

    public static void load(String env) {
        if (isLoaded) return;
        if (env == null || env.isEmpty()) {
            env = "qa";
        }
        String path = System.getProperty("user.dir") + "/src/test/resources/config/" + env + ".properties";
        try (FileInputStream fis = new FileInputStream(path)) {
            properties.load(fis);
            isLoaded = true;
        } catch (IOException e) {
            throw new RuntimeException("Could not load properties file: " + path, e);
        }
    }

    public static String get(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("Property '" + key + "' not found in config file");
        }
        return value;
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }

    public static void clear() {
        properties.clear();
        isLoaded = false;
    }

}
