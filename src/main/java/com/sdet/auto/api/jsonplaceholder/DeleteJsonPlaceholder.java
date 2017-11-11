package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.testHelper.IoLibrary;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class DeleteJsonPlaceholder {

    public static String deleteRecord(String url) {

        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, Object> headers = new LinkedMultiValueMap<String, Object>();
        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity request = new HttpEntity("", headers);

        final ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.DELETE, request, String.class);

        IoLibrary.writeLine(String.format("Delete Executed for jsonplaceholder: ", url ));

        String status = exchange.getStatusCode().toString();

        if(!status.equals("200")){
            throw new RuntimeException(String.format("Delete jsonplaceholder did not return 200.  Actual ERROR:[%s].", status));
        }
        else {
            System.out.println("PASS: Delete successfully executed. Status CodeL:" + status);
        }

        return status;
    }
}
