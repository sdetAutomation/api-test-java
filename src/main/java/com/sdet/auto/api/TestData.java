package com.sdet.auto.api;

import com.sdet.auto.dataModel.RatesObject;

public class TestData {

    public static RatesObject ratesTestDataSetup(){

        RatesObject rateModel = new RatesObject();

        rateModel.setCode("BTC");
        rateModel.setName("Bitcoin");
        rateModel.setRate("1");

        return rateModel;
    }
}
