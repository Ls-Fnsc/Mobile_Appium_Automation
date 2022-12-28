package com.framework.listeners.android;

import com.framework.base.android.Common;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class AssertionLogging extends SoftAssert {

    @Override
    public void onAssertSuccess(IAssert<?> assertCommand) {
        System.err.println("*** Assertion: " +assertCommand.getMessage()+ " <Passed> ***");
    }

    @Override
    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
        System.err.println("*** Assertion: " +assertCommand.getMessage()+ " <Failed> ***");

        //Taking screenshot of failed assertion
        try {
            Common.getScreenshot(assertCommand.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
