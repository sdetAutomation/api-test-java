package com.sdet.auto.testHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigSettings {


    private static String bitpayApiUrl;
    private static String jsonplaceholderApiUrl;

    public static String getBitpayApiUrl() {
        return bitpayApiUrl;
    }

    public static void setBitpayApiUrl(String bitpayApiUrl) {
        ConfigSettings.bitpayApiUrl = bitpayApiUrl;
    }

    public static String getJsonplaceholderApiUrl() {
        return jsonplaceholderApiUrl;
    }

    public static void setJsonplaceholderApiUrl(String jsonplaceholderApiUrl) {
        ConfigSettings.jsonplaceholderApiUrl = jsonplaceholderApiUrl;
    }

    public void getConfigSettings() throws IOException {

        Properties property = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        property.load(inputStream);

        setBitpayApiUrl(property.getProperty("bitpayApiUrl"));
        setJsonplaceholderApiUrl(property.getProperty("jsonplaceholderApiUrl"));

        IoLibrary.writeLine("Test Config Settings");
        System.out.println(String.format("bitpayApiUrl: %s", bitpayApiUrl));
        System.out.println(String.format("jsonplaceholderApiUrl: %s", jsonplaceholderApiUrl));

        IoLibrary.writelineEnd();
    }
}