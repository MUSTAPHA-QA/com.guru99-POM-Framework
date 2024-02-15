package com.guru99.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	public ReadConfig() {
		
		try {
			FileInputStream inputStream = new FileInputStream("./src\\test\\resources\\config.properties");
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
	
	public String getExpectedText1() {
		return properties.getProperty("expectedText1");
	}
	
	public String getErrorMessage() {
		return properties.getProperty("errorMessage");
	}
	
	public String getExpectedText2() {
		return properties.getProperty("expectedText2");
	}
	
	public String getExpectedText3() {
		return properties.getProperty("expectedText3");
	}
	
	public String getExpectedText4() {
		return properties.getProperty("expectedText4");
	}
	
	public String getExpectedText5() {
		return properties.getProperty("expectedText5");
	}
	
	
	
	

}
