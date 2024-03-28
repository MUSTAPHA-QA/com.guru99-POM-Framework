package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateCustomerRegistrationPage extends BasePage {
	
	WebDriver driver;
	
	String customerRegisteredText;
	
	@FindBy(how = How.XPATH, using = "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]") WebElement Customer_Registered_Element;
	@FindBy(how = How.XPATH, using = "//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]") WebElement Customer_ID_Value_Element;
	@FindBy(how = How.XPATH, using = "//a[text() = 'Delete Customer']") WebElement Delete_Customer_Element;
	
	
	public ValidateCustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateCustomerRegistrationPage(String actuelText, String expectedText3, String errorMessage) {
		validationMethod(actuelText, expectedText3, errorMessage);
	}
	
	public void validateCustomerRegisteredText(String expectedText4, String errorMessage) {
		customerRegisteredText = Customer_Registered_Element.getText();
		validationMethod(customerRegisteredText, expectedText4, errorMessage);
	}
	
	public String getCustomerIdValue() {
		String customerId = Customer_ID_Value_Element.getText();
		return customerId;
	}
	
	public void clickOnDeleteCustomer() {
		Delete_Customer_Element.click();
	}
}
