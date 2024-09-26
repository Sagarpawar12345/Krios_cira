package com.ciranet.testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;

public class TestListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {

		LoggerManager.debug("*** Test Suite " + context.getName() + " started ***");
	}

	@Override
	public void onFinish(ITestContext context) {

		LoggerManager.debug(("*** Test Suite " + context.getName() + " ending ***"));
	}

	@Override
	public void onTestStart(ITestResult result) {

		LoggerManager.debug(("*** Running test method " + result.getMethod().getMethodName() + "..."));

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		LoggerManager.debug("*** Executed " + result.getMethod().getMethodName() + " test successfully...");

		
		  TestBase.test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case PASSED", ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {

		LoggerManager.debug("*** Test execution " + result.getMethod().getMethodName() + " failed...");

		
		  try {
		  
		  TestBase.test.log(Status.FAIL, MarkupHelper .createLabel(result.getName() +
		  " Test case FAILED due to below issues:", ExtentColor.RED));
		  
		  TestBase.test.fail(result.getThrowable());
		  
	  } catch (Exception e) {
		  LoggerManager.debug("=========== Error while taking Screenshot : ==========="
		  ); e.printStackTrace(); }
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		LoggerManager.debug("*** Test " + result.getMethod().getMethodName() + "skipped...");

		
		  TestBase.test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
		  TestBase.test.skip(result.getThrowable());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		LoggerManager.debug("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

}
