# EA_Employee_Project

BootFlow Automation Project  - BDD Framework With Cucumber

### Codes and Tests Prepared By:

Nihan Tasci Uygur

Test Automation Engineer

### Getting Started
To get started with this framework, you will need to have the following software on ymy system.

• Java 8 or later\
• Maven 3 or later\
• Chrome or Firefox Web Browser

1. Open the terminal or command prompt and navigate to the root directory of the project.\
2. Run the following command to download the required dependencies:\

mvn clean install\
3. Run the following command to run the tests:

mvn verify\
4. Open the project with IntelliJ IDEA\
-- Go to Cukes Runner inside the project\
-- Click the Run button

### This framework is Cucumber (BDD)
•  I built my framework using Java Programming Language.\
•  I used Maven as a build automation tool for my Java project.\
•  I used Cucumber-Junit and Cucumber Runner to orchestrate tests.\
•  Inside the Cucumber runner, I used glues to connect feature files to step definitions.\
•  I added the report plugin to Cucumber Runner to generate JSON and HTML reports.\
•  I have a Utilities package, which contains utility classes such as Configuration Reader.\
•  I am using Page Object Modelling to enhance test maintenance and reduce code duplication. This is one of the most famous Selenium approaches.\
•  I use Page Object Classes to store and identify the elements that I work on.\
•  I use the PageFactory class and initElements method to initialize them.\
•  I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.\
•  To interact with browsers, I am utilizing Selenium WebDriver.\
•  I used the Singleton pattern by declaring the constructor of the class as private so that no one instantiates the class outside of it. 
And declared a static method with return type as the object of the class which should check if the class is already instantiated once.\
•  I used a Cucumber Scenario outline and example feature.\
•  I have created my test cases in the feature files as-is.\
•  In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.\
•  I use hook class as pre-and post-test implementations.\
•  Step Definitions folder is the place where my actual test scripts are.\
•  I added a screenshot interface; when the scenario fails, it takes a screenshot.\
•  For assertions/verifications, to compare expected and actual results I utilize Junit assertions.\
•  I also use tags for tests that I want to run in bulk.\
•  My framework is easy to maintain since I have elements stored in one centralized place. If any changes happen in the application about the elements, 
I know where to go and how to fix it to run test scripts correctly.

