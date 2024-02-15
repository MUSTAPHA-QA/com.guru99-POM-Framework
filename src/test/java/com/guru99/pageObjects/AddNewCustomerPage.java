package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewCustomerPage extends BasePage {
	
	WebDriver driver;
	
	public AddNewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'name']") WebElement Customer_Name_Element;
	@FindBy(how = How.XPATH, using = "//input[@value='m']") WebElement Gender_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='dob']") WebElement Date_Of_Birth_Element;
	@FindBy(how = How.XPATH, using = "//textarea[@name = 'addr']") WebElement Address_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'city']") WebElement City_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'state']") WebElement State_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'pinno']") WebElement PIN_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'telephoneno']") WebElement Telephone_Number_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'emailid']") WebElement Email_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'password']") WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "//input[@name = 'sub']") WebElement Submit_Element;
	
	public void validateNewCustomerPage(String actualText, String expectedText2, String errorMessage) {
		validationMethod(actualText, expectedText2, errorMessage);
	}
	
	public void insertCustomerName(String customerName) {
		Customer_Name_Element.sendKeys(randomString() + customerName);
	}
	
	public void selectGender() {
		Gender_Element.click();
	}
	
	public void insertDateOfBirth(String mm, String dd, String yyyy) {
		Date_Of_Birth_Element.sendKeys(mm);
		Date_Of_Birth_Element.sendKeys(dd);
		Date_Of_Birth_Element.sendKeys(yyyy + randomInt());
	}
	
	public void insertAddress(String address) {
		Address_Element.sendKeys(address);
	}
	
	public void insertCity(String city) {
		City_Element.sendKeys(city);
	}
	
	public void insertState(String state) {
		State_Element.sendKeys(state);
	}
	
	public void insertPin(String pin) {
		PIN_Element.sendKeys(randomInt() + pin);
	}
	
	public void insertTelephoneNumber(String telephoneNumber) {
		Telephone_Number_Element.sendKeys(randomInt() + telephoneNumber);
	}
	
	public void insertEmail(String email) {
		Email_Element.sendKeys(randomString() + email);
	}
	
	public void insertPassword(String customerPassword) {
		Password_Element.sendKeys(randomInt() + customerPassword);
	}
	
	public void clickSubmit() {
		Submit_Element.click();
	}
}
