package com.sdet.auto.testHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigSettings {

    public static String getApiUrl() {
        return apiUrl;
    }

    public static void setApiUrl(String apiUrl) {
        ConfigSettings.apiUrl = apiUrl;
    }

    private static String apiUrl;

    public void getConfigSettings() throws IOException {

        Properties property = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        property.load(inputStream);

        setApiUrl(property.getProperty("apiUrl"));

        IoLibrary.writeLine("Test Config Settings");
        System.out.println(String.format("apiUrl: %s", getApiUrl()));
        IoLibrary.writelineEnd();
    }
}