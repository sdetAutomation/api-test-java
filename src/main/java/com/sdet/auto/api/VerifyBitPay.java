package com.sdet.auto.api;

import com.sdet.auto.dataModel.RatesObject;
import com.sdet.auto.testHelper.IoLibrary;
import com.sdet.auto.testHelper.LoggingLibrary;
import com.sdet.auto.testHelper.TestAssert;

public class VerifyBitPay {

    public static void VerifyRatesData(TestAssert testAssert, RatesObject[] ratesObject, RatesObject baseline){

        IoLibrary.writeLine("Verifying Rates Data Found in Rates Object.");

        boolean rateFound = false;

        for (RatesObject rate : ratesObject) {

            if(rate.getCode().equals(baseline.getCode())) {
                System.out.println("Baseline Code Found.  Verifying Rate Object. " + baseline.getCode());
                testAssert.setPass(LoggingLibrary.CompareResult(rate.getCode(), baseline.getCode()));
                testAssert.setPass(LoggingLibrary.CompareResult(rate.getName(), baseline.getName()));
                testAssert.setPass(LoggingLibrary.CompareResult(rate.getRate(), baseline.getRate()));
                rateFound = true;
                break;
            }
        }

        if(rateFound == false){
            testAssert.setPass(false);
            System.out.println("FAIL: Rate Code Not Found in Collection."  + baseline.getCode());
        }
    }
}
