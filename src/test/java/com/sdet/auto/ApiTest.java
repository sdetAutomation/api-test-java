package com.sdet.auto;

import com.sdet.auto.api.bitpay.GetBitPayData;
import com.sdet.auto.api.bitpay.TestDataBitPay;
import com.sdet.auto.api.bitpay.VerifyBitPay;
import com.sdet.auto.api.jsonplaceholder.*;
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

        JsonPlaceholderObject testData = TestDataJsonPlaceholder.postTestDataSetup();

        final String url = ConfigSettings.getJsonplaceholderApiUrl() + "posts";

        JsonPlaceholderObject response = PostJsonPlaceholder.createRecord(url, testData);

        VerifyJsonPlaceholder.VerifyJsonPlaceholderData(testAssert, response, testData);
    }

    @Test
    public void TC0003_Delete_Test() {

        final String url = ConfigSettings.getJsonplaceholderApiUrl() + "posts/100";

        String response = DeleteJsonPlaceholder.deleteRecord(url);

        VerifyJsonPlaceholder.VerifyJsonPlaceholderDelete(testAssert, response, "200");
    }

    @Test
    public void TC0004_Put_Test() {

        JsonPlaceholderObject testData = TestDataJsonPlaceholder.putTestDataSetup();

        final String url = ConfigSettings.getJsonplaceholderApiUrl() + "posts/100";

        JsonPlaceholderObject response = PutJsonPlaceholder.updateRecord(url, testData);

        VerifyJsonPlaceholder.VerifyJsonPlaceholderPutData(testAssert, response, testData);
    }
}
