package com.ciranet.testlisteners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.RequiresLogin;

public class LoginListener implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod() && method.getTestMethod().getConstructorOrMethod().getMethod()
				.isAnnotationPresent(RequiresLogin.class)) {
			TestBase testBase = (TestBase) testResult.getInstance();
			try {
				testBase.performLogin();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// Optional cleanup after test method execution
	}
}
