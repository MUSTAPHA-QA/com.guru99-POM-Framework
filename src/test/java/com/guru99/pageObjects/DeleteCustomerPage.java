package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeleteCustomerPage extends BasePage {
	
	WebDriver driver;
	
	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'cusid']") WebElement Customer_ID_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name = 'AccSubmit']") WebElement Submit_ELEMENT;
	
	public void validateDeleteCustomerPage(String actualText, String expectedText5, String errorMessage) {
		validationMethod(actualText, expectedText5, errorMessage);
	}
	
	public void insertCustomerId(String customerId) {
		Customer_ID_ELEMENT.sendKeys(customerId);
	}
	
	public void clickSubmit() {
		Submit_ELEMENT.click();
	}
}
