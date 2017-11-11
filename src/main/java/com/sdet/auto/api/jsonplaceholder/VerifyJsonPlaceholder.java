package com.sdet.auto.api.jsonplaceholder;

import com.sdet.auto.dataModel.JsonPlaceholderObject;
import com.sdet.auto.testHelper.IoLibrary;
import com.sdet.auto.testHelper.LoggingLibrary;
import com.sdet.auto.testHelper.TestAssert;

public class VerifyJsonPlaceholder {

    public static void VerifyJsonPlaceholderData(TestAssert testAssert, JsonPlaceholderObject actualObj, JsonPlaceholderObject baselineObj){

        IoLibrary.writeLine("Verifying Json Placeholder response Data Object.");

        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getUserId(), baselineObj.getUserId()));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getId().isEmpty(), false));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getTitle(), baselineObj.getTitle()));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getBody(), baselineObj.getBody()));
    }

    public static void VerifyJsonPlaceholderDelete(TestAssert testAssert, String actual, String baseline ){

        IoLibrary.writeLine("Verifying Json Placeholder Delete.");

        testAssert.setPass(LoggingLibrary.CompareResult(actual, baseline));
    }

    public static void VerifyJsonPlaceholderPutData(TestAssert testAssert, JsonPlaceholderObject actualObj, JsonPlaceholderObject baselineObj){

        IoLibrary.writeLine("Verifying Json Placeholder response Data Object.");

        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getUserId(), baselineObj.getUserId()));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getId(), baselineObj.getId()));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getTitle(), baselineObj.getTitle()));
        testAssert.setPass(LoggingLibrary.CompareResult(actualObj.getBody(), baselineObj.getBody()));
    }
}
