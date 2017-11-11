package com.sdet.auto;

import com.sdet.auto.api.bitpay.GetBitPayData;
import com.sdet.auto.api.bitpay.TestDataBitPay;
import com.sdet.auto.api.bitpay.VerifyBitPay;
import com.sdet.auto.api.jsonplaceholder.PostJsonPlaceholder;
import com.sdet.auto.api.jsonplaceholder.TestDataJsonPlaceholder;
import com.sdet.auto.api.jsonplaceholder.VerifyJsonPlaceholder;
import com.sdet.auto.dataModel.JsonPlaceholderObject;
import com.sdet.auto.dataModel.RatesObject;
import com.sdet.auto.testHelper.ConfigSettings;
import org.junit.Test;


public class ApiTest extends TestBaseClass {


    @Test
    public void TC0001_Get_Test() {

        RatesObject testData = TestDataBitPay.ratesTestDataSetup();

        final String url = ConfigSettings.getBitpayApiUrl() + "rates";

        RatesObject[] rates = GetBitPayData.getRates(url);

        VerifyBitPay.VerifyRatesData(testAssert, rates, testData);
    }

    @Test
    public void TC0002_Post_Test() {

        JsonPlaceholderObject testData = TestDataJsonPlaceholder.ratesTestDataSetup();

        final String url = ConfigSettings.getJsonplaceholderApiUrl() + "posts";

        JsonPlaceholderObject response = PostJsonPlaceholder.createRecord(url, testData);

        VerifyJsonPlaceholder.VerifyJsonPlaceholderData(testAssert, response, testData);
    }
}
