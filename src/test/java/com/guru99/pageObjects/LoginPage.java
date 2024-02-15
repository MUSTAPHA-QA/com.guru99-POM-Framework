package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name ='uid']") WebElement USER_ID_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name ='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name ='btnLogin']") WebElement LOGIN_ELEMENT;
	
	public void insertUserName(String userId) {
		USER_ID_ELEMENT.sendKeys(userId);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickLogin() {
		LOGIN_ELEMENT.click();
	}
}
