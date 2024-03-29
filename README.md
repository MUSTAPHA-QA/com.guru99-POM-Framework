# # Selenium with Java UI Testing POM Framework for guru99 Customer LifeCycle By MUSTAPHA-QA

**## About the Project**

**### Overview**

- This project presents a comprehensive PAGE OBJECT MODEL testing framework designed to automate UI testing of the Customer LifeCycle functionality of guru99.com web application, ensuring its quality and reliability.

**### Features**

- List of the key features:
  - Test cases covering login, add and delete a new customer
  - Data generation using excel file
  - Extent report and logging for comprehensive test results

**### Technologies Used**

- List of the technologies employed:
  - IDE: Eclipse
  - Coding language: Java
  - Test automation framework: TestNG
  - UI testing library: Selenium
  - Build and project management tool: Maven

**## Framework Structure**

- The framework's structure is organized into two folders src/test/java folder and src/test/resources folder:
   - The src/test/java folder is organized into three packages:

  - ```
    com.guru99.pageObjects
    ```

    - BasePage class which encapsulates common methods.
    - LoginPage contains methods to interact with the login page
    - HomePage contains methods to interact with the home page
    - AddNewCustomerPage contains methods to interact with adding a new customer page
    - ValidateCustomerRegistrationPage contains methods to validate the registration of a new customer
    - DeleteCustomerPage contains methods to interact with deleting a customer page



  - ```
    com.guru99.testCases
    ```

    - TC001_LoginTest
    - TC002_CustomerCreationAndDeletionTest

  

  - ```
    com.guru99.utilities
    ```

    - BrowserFactory class which encapsulates launching browser related methods
    - ExtentReportManager class for report generation.
    - DataProviders
    - ReadConfig
    - XLUtility



   - The src/test/resources folder contains the external files used for the project:
     - config.properties
     - extent-config.xml
     - log4j2.xml


**## Setup and Usage**

- Add necessary dependencies according to the pom.xml file.

**## Project Structure**

To ensure a clear and organized project structure, we've adopted the following conventions:

- Source code:
  - All project packages are located within the `src/test/java`folder, as this is the standard directory for test code in Maven projects.
- External resources:
  - The `src/test/resources` folder serves as a repository for external files essential for testing (listed above)


**## Results Achieved** 

#### Test Case Success Rates
- **Adding a new customer:** 100% success rate
- **Deleting a customer:** 100% success rate
- **Logging into the application:** 100% success rate

### Identified Issue
- **Issue:** After attempting to delete a customer, the application displays a message stating that the customer doesn't exist, despite the customer being created successfully.


### Additional Observations
- All test cases were executed successfully without any failures.
- Automated tests provided comprehensive coverage of the application's tested functionalities.
- Performance of automated tests was satisfactory, with no significant delays or timeouts observed.
- Continuous integration (CI) pipelines were successfully set up with Jenkins to automate testing processes. 



**## Screenshot of Extent Report**

![Screenshot](https://github.com/MUSTAPHA-QA/com.guru99-POM-Framework/blob/master/reports/Selenium%20with%20Java%20UI%20Testing%20POM%20Framework%20for%20guru99%20Customer%20LifeCycle%20By%20MUSTAPHA-QA.PNG?raw=true)

This screenshot demonstrates the comprehensive test results generated by the framework (check reports folder).

**## License**

- This project is licensed under the MIT License.

