package com.sdet.auto;

import com.sdet.auto.api.GetBitPayData;
import com.sdet.auto.api.TestData;
import com.sdet.auto.api.VerifyBitPay;
import com.sdet.auto.dataModel.RatesObject;
import com.sdet.auto.testHelper.ConfigSettings;
import org.junit.Test;


public class ApiTest extends TestBaseClass {


    @Test
    public void TC0001_GetRates() {

        RatesObject testData = TestData.ratesTestDataSetup();

        final String url = ConfigSettings.getApiUrl() + "rates";

        RatesObject[] rates = GetBitPayData.getRates(url);

        VerifyBitPay.VerifyRatesData(testAssert, rates, testData);
    }
}
