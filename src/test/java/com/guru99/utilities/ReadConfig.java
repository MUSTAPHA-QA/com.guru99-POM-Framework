package com.guru99.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	public ReadConfig() {
		
		try {
			FileInputStream inputStream = new FileInputStream("./src/test/resources/config.properties");
			properties = new Properties();
			properties.load(inputStream);
		
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getURL() {
		return properties.getProperty("url");
	}
	
	public String getUserId() {
		return properties.getProperty("userId");
	}
	
	public String getPassword() {
		return properties.getProperty("password");
	}
	
	public String getHomePageExpectedText() {
		return properties.getProperty("homePageExpectedText");
	}
	
	public String getErrorMessage() {
		return properties.getProperty("errorMessage");
	}
	
	public String getEntryPageExpectedText() {
		return properties.getProperty("entryPageExpectedText");
	}
	
	public String getRegistrationPageExpectedText() {
		return properties.getProperty("registrationPageExpectedText");
	}
	
	public String getCustomerRegisteredExpectedText() {
		return properties.getProperty("customerRegisteredExpectedText");
	}
	
	public String getDeleteCustomerPageExpectedText() {
		return properties.getProperty("deleteCustomerPageExpectedText");
	}	
}
