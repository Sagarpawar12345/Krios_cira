package com.ciranet.utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EnvironmentConfig {

	public static Map<String, String> fileandenv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	public static Properties propPreSet = new Properties();

	private static void environmentVariables() 
	{
		// BrowserType details
		fileandenv.put("BROWSERTYPE", propMain.getProperty("BROWSERTYPE"));

		// Application details
		fileandenv.put("APPLICATIONURL", propMain.getProperty("APPLICATIONURL"));
		
		// Page load timeout
		fileandenv.put("PAGE_LOAD_TIMEOUT", propMain.getProperty("PAGE_LOAD_TIMEOUT"));
		fileandenv.put("IMPLICIT_WAIT", propMain.getProperty("IMPLICIT_WAIT"));

		// FilePath
		fileandenv.put("TESTDATA_PATH", propMain.getProperty("TESTDATA_PATH"));
		fileandenv.put("REPORT_LOCATION", propMain.getProperty("REPORT_LOCATION"));
		fileandenv.put("SCREEN_SHOT_PATH", propMain.getProperty("SCREEN_SHOT_PATH"));

	}

	public static Map<String, String> environmentSetup() {

		String environment = System.getProperty("env");

		String propFilePath = "/src/test/resources/envProperties";

		LoggerManager.info("------- Selected environment ------- " + environment);

		try {
			if (environment.equalsIgnoreCase("sandbox")) {

				FileInputStream fisLocal = new FileInputStream(
						System.getProperty("user.dir") + propFilePath + "/sandbox.properties");

				propMain.load(fisLocal);

				environmentVariables();

			} else if (environment.equalsIgnoreCase("dev")) {

				FileInputStream fisDev = new FileInputStream(
						System.getProperty("user.dir") + propFilePath + "/dev.properties");

				propMain.load(fisDev);

				environmentVariables();

			} else if (environment.equalsIgnoreCase("qa")) {

				FileInputStream fisQA = new FileInputStream(
						System.getProperty("user.dir") + propFilePath + "/qa.properties");

				propMain.load(fisQA);

				environmentVariables();

			} else if (environment.equalsIgnoreCase("stage")) {

				FileInputStream fisStaging = new FileInputStream(
						System.getProperty("user.dir") + propFilePath + "/stage.properties");

				propMain.load(fisStaging);

				environmentVariables();

			} else if (environment.equalsIgnoreCase("prod")) {

				FileInputStream fisProd = new FileInputStream(
						System.getProperty("user.dir") + propFilePath + "/prod.properties");

				propMain.load(fisProd);

				environmentVariables();

			}
		} catch (Exception e) {

			LoggerManager.error("+++++++++ Exception in environmentSetup() +++++++++ " + e.getMessage());

			e.printStackTrace();
		}

		return fileandenv;

	}

	public static Map<String, String> getConfigReader() {

		if (fileandenv == null) {

			fileandenv = environmentSetup();

		} else {

			LoggerManager.error("+++++++++ Exception in Map<String, String> getConfigReader() +++++++++ ");

		}

		return fileandenv;
	}
}