package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.dataModel.JsonPlaceholderObject;
import com.sdet.auto.testHelper.IoLibrary;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class PutJsonPlaceholder {

    public static JsonPlaceholderObject updateRecord(String url, JsonPlaceholderObject putBody) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<JsonPlaceholderObject> entity = new HttpEntity<JsonPlaceholderObject>(putBody, headers);

        IoLibrary.writeLine("Update Jsonplaceholder executed for uri: " + url);

        JsonPlaceholderObject response = restTemplate.exchange(url, HttpMethod.PUT, entity, JsonPlaceholderObject.class).getBody();

        return response;
    }
}
