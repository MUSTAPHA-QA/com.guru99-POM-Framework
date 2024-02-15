package com.guru99.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.guru99.pageObjects.LoginPage;
import com.guru99.utilities.BrowserFactory;
import com.guru99.utilities.ReadConfig;

public class TC001_LoginTest extends BrowserFactory {
	
	ReadConfig readConfig = new ReadConfig();
	String userId = readConfig.getUserId();
	String password = readConfig.getPassword();
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		logger.info("Starting Login Test Case");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userId);
		logger.info("Entering User ID: {}", userId);
		loginPage.insertPassword(password);
		logger.info("Entering Password");
		loginPage.clickLogin();
		logger.info("Clicking Login Button");
		
		logger.info("Login Test Case Completed");
	}
}
