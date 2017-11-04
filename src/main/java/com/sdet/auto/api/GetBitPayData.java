package com.sdet.auto.api;

import com.sdet.auto.dataModel.RatesObject;
import org.springframework.web.client.RestTemplate;

public class GetBitPayData {

    public static RatesObject[] getRates(String url) {

        RestTemplate restTemplate = new RestTemplate();

        RatesObject[] rates  = restTemplate.getForObject(url, RatesObject[].class);

        return rates;
    }
}
