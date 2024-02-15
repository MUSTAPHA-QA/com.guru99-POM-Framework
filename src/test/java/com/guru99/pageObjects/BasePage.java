package com.guru99.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class BasePage {
	
	public void validationMethod(String actualText, String expectedText, String errorMessage) {
		Assert.assertEquals(actualText, expectedText, errorMessage);
	}
	
	public String randomString() {
		String generatedRandomString = RandomStringUtils.randomAlphabetic(4);
		return generatedRandomString;
	}
	
	public String randomInt() {
		String generatedRandomInt = RandomStringUtils.randomNumeric(2);
		return generatedRandomInt;
	}
}
