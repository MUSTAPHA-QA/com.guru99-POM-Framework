package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'New Customer']") WebElement New_Customer_Button;
	
	public void validateHomePage(String actuelText, String expectedText1, String errorMessage ) {
		validationMethod(actuelText, expectedText1, errorMessage);		
	}
	
	public void clickOnNewCustomer() {
		New_Customer_Button.click();
	}
}
