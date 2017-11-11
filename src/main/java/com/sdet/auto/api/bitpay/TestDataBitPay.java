package com.sdet.auto.api.bitpay;

import com.sdet.auto.dataModel.RatesObject;

public class TestDataBitPay {

    public static RatesObject ratesTestDataSetup(){

        RatesObject rateModel = new RatesObject();

        rateModel.setCode("BTC");
        rateModel.setName("Bitcoin");
        rateModel.setRate("1");

        return rateModel;
    }
}
