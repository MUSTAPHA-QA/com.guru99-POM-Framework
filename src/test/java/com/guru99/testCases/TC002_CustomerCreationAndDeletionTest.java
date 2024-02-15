package com.guru99.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.guru99.pageObjects.AddNewCustomerPage;
import com.guru99.pageObjects.DeleteCustomerPage;
import com.guru99.pageObjects.HomePage;
import com.guru99.pageObjects.LoginPage;
import com.guru99.pageObjects.ValidateCustomerRegistrationPage;
import com.guru99.utilities.BrowserFactory;
import com.guru99.utilities.DataProviders;
import com.guru99.utilities.ReadConfig;

public class TC002_CustomerCreationAndDeletionTest extends BrowserFactory {

	ReadConfig readConfig = new ReadConfig();
	String userId = readConfig.getUserId();
	String password = readConfig.getPassword();
	String expectedText1 = readConfig.getExpectedText1();
	String errorMessage = readConfig.getErrorMessage();
	String expectedText2 = readConfig.getExpectedText2();
	String expectedText3 = readConfig.getExpectedText3();
	String expectedText4 = readConfig.getExpectedText4();
	String expectedText5 = readConfig.getExpectedText5();
	
	@Test(dataProvider = "Data", dataProviderClass = DataProviders.class)
	public void testCustomerCreationAndDeletion(String customerName, String mm, String dd, String yyyy, String address, String city, String state, String pin, String telephoneNumber, String email, String customerPassword) {
		logger.info("Starting test case: Customer Creation and Deletion");
		
		//Login
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userId);
		logger.info("Entered userId: {}", userId);
		loginPage.insertPassword(password);
		logger.info("Entered password");
		loginPage.clickLogin();
		logger.info("Clicked on login button");
		
		//HomePage validation
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.validateHomePage(driver.getTitle(), expectedText1, errorMessage);
		logger.info("Validated home page");
		homePage.clickOnNewCustomer();
		logger.info("Clicked on New Customer");
		
		//Insert customer details
		AddNewCustomerPage addNewCustomerPage = PageFactory.initElements(driver, AddNewCustomerPage.class);
		addNewCustomerPage.validateNewCustomerPage(driver.getTitle(), expectedText2, errorMessage); 
		logger.info("Validated new customer page");
		addNewCustomerPage.insertCustomerName(customerName); 
		logger.info("Entered customer name: {}", customerName);
		addNewCustomerPage.selectGender();
		logger.info("Selected gender");
		addNewCustomerPage.insertDateOfBirth(mm, dd, yyyy); 
		logger.info("Entered date of birth: {}/{}/{}", mm, dd, yyyy);
		addNewCustomerPage.insertAddress(address); 
		logger.info("Entered address: {}", address);
		addNewCustomerPage.insertCity(city);   
		logger.info("Entered city: {}", city);
		addNewCustomerPage.insertState(state);      
		logger.info("Entered state: {}", state);
		addNewCustomerPage.insertPin(pin);       
		logger.info("Entered pin: {}", pin);
		addNewCustomerPage.insertTelephoneNumber(telephoneNumber); 
		logger.info("Entered telephone number: {}", telephoneNumber);
		addNewCustomerPage.insertEmail(email);  
		logger.info("Entered email: {}", email);
		addNewCustomerPage.insertPassword(customerPassword);
		logger.info("Entered customer password");
		addNewCustomerPage.clickSubmit();
		logger.info("Clicked on submit button for new customer creation");
		
		//Validate customer creation
		ValidateCustomerRegistrationPage validateCustomerRegistrationPage = PageFactory.initElements(driver, ValidateCustomerRegistrationPage.class);
		validateCustomerRegistrationPage.validateCustomerRegistrationPage(driver.getTitle(), expectedText3, errorMessage);
		logger.info("Validated customer registration page");
		validateCustomerRegistrationPage.validateCustomerRegisteredText(expectedText4, errorMessage);	
		logger.info("Validated customer registered text");
		
		//Deleting Customer
		String customerId = validateCustomerRegistrationPage.getCustomerIdValue();
		validateCustomerRegistrationPage.clickOnDeleteCustomer();
		logger.info("Clicked on delete customer");
		DeleteCustomerPage deleteCustomerPage = PageFactory.initElements(driver, DeleteCustomerPage.class);
		deleteCustomerPage.validateDeleteCustomerPage(driver.getTitle(), expectedText5, errorMessage);
		logger.info("Validated delete customer page");
		deleteCustomerPage.insertCustomerId(customerId);
		logger.info("Entered customer ID for deletion: {}", customerId);
		deleteCustomerPage.clickSubmit();
		logger.info("Clicked on submit button for customer deletion");
		driver.switchTo().alert().accept();
		logger.info("Accepted alert for customer deletion");
		driver.switchTo().alert().accept();
		logger.info("Accepted second alert for customer deletion");
		
		logger.info("Test case execution completed");
		
		
		
	}

}
