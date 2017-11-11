package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.dataModel.JsonPlaceholderObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class PostJsonPlaceholder {

    public static JsonPlaceholderObject createRecord(String url, JsonPlaceholderObject postBody) {

        JsonPlaceholderObject returnObj = new JsonPlaceholderObject();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<JsonPlaceholderObject> request = new HttpEntity<JsonPlaceholderObject>(postBody, headers);
        returnObj = restTemplate.postForObject(url, request, JsonPlaceholderObject.class);

        return returnObj;
    }
}
