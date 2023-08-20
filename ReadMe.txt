**Project Description**
This project is about automating a test page using Selenium Webdriver.

**Software Requirements**
(1) Java: Java 8(v1.8.0_202) or higher
(2) Browsers:
    (2.1) Chrome: v114.0.5735.110 (32-bit)
    (2.2) Firefox: v116.0.3 (64-bit)
(3) Drivers:
    (3.1) chromedriver: v114.0.5735.90 (32-bit) - https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/
    (3.2) geckodriver: v0.33.0 (64-bit) - https://github.com/mozilla/geckodriver/releases/tag/v0.33.0
Note: Set the environment variables for drivers in your machine
(4) Libraries:
    (4.1) Selenium
    (4.2) TestNG (Eclipse: Go to Project Properties -> Add Library -> TestNG) 
    _To Install TestNG, in eclipse_: Go to Help -> Eclipse Marketplace -> Search 'testNG' and Install    

**Project Structure and Details**
(1) ResolverAssessment -> src -> Properties: This package contains properties files as follows-
    (1.1) PageObjects.properties: This file contains xpaths to elements present in the test page 
    (1.2) Parameters.properties: This file contains parameters to be passed as input in the test-setup, test-utilities, testcase scripts
(2) ResolverAssessment -> src -> TestBase: This package contains file for test automation setup code as follows-
    (2.1) TestSetup.java: This java class file contains methods to be run before and after each test class file
(3) ResolverAssessment -> src -> TestCases: This package contains test class files for automation of each form in the test page as follows-
    (3.1) Test1.java: This test script contains tests to validate the following usecases in Test1 form-
          (a) Navigate to the home page
          (b) Assert that both the email address and password inputs are present as well as the login button
          (c) Enter in an email address and password combination into the respective fields
    (3.2) Test2.java: This test script contains tests to validate the following usecases in Test2 form-
          (a) Navigate to the home page
          (b) In the test 2 div, assert that there are three values in the listgroup
          (c) Assert that the second list item's value is set to "List Item 2"
          (d) Assert that the second list item's badge value is 6
    (3.3) Test3.java: This test script contains tests to validate the following usecases in Test3 form-
          (a) Navigate to the home page          
          (b) In the test 3 div, assert that "Option 1" is the default selected value
          (c) Select "Option 3" from the select list
    (3.4) Test4.java: This test script contains tests to validate the following usecases in Test4 form-
          (a) Navigate to the home page
          (b) In the test 4 div, assert that the first button is enabled and that the second button is disabled
    (3.5) Test5.java: This test script contains tests to validate the following usecases in Test5 form-
          (a) Navigate to the home page
          (b) In the test 5 div, wait for a button to be displayed (note: the delay is random) and then click it
          (c) Once you've clicked the button, assert that a success message is displayed
          (d) Assert that the button is now disabled
    (3.6) Test6.java: This test script contains tests to validate the following usecases in Test6 form-
          (a) Navigate to the home page
          (b) Write a method that allows you to find the value of any cell on the grid
          (c) Use the method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
          (d) Assert that the value of the cell is "Ventosanzap"
(4) ResolverAssessment -> src -> Utils: This package contains utilities files as follows-
    (4.1) CommonUtils.java: This file contains common methods to be used in the test scripts.
    (4.2) testUtils.java: This file contains methods being used in the testcase scripts.
(5) ResolverAssessment -> testNG.xml: This is a configuration file to organize the test suites and test classes.

**How to run?**
Download the workspace and run "testNG.xml"
- The tests will run in an order as mentioned in the testng xml file. 