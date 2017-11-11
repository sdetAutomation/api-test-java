package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.dataModel.JsonPlaceholderObject;

public class TestDataJsonPlaceholder {

    public static JsonPlaceholderObject ratesTestDataSetup(){

        JsonPlaceholderObject jsonObj = new JsonPlaceholderObject();

        jsonObj.setUserId("1337");
        jsonObj.setId(null);
        jsonObj.setTitle("sdetAutomation-title");
        jsonObj.setBody("sdetAutomation-body");

        return jsonObj;
    }
}
