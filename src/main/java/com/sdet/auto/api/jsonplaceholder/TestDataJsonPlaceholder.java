package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.dataModel.JsonPlaceholderObject;

public class TestDataJsonPlaceholder {

    public static JsonPlaceholderObject postTestDataSetup(){

        JsonPlaceholderObject jsonObj = new JsonPlaceholderObject();

        jsonObj.setUserId("1337");
        jsonObj.setId(null);
        jsonObj.setTitle("sdetAutomation-post-title");
        jsonObj.setBody("sdetAutomation-post-body");

        return jsonObj;
    }

    public static JsonPlaceholderObject putTestDataSetup(){

        JsonPlaceholderObject jsonObj = new JsonPlaceholderObject();

        jsonObj.setUserId("1337");
        jsonObj.setId("100");
        jsonObj.setTitle("sdetAutomation-put-title");
        jsonObj.setBody("sdetAutomation-put-body");

        return jsonObj;
    }
}
