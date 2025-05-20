🛒 OpenCart Selenium Automation Framework (Java)

This is a robust and scalable Selenium automation framework designed specifically for testing the OpenCart eCommerce platform. It uses Java, TestNG, and Maven, with support for Allure reporting, Page Object Model (POM) architecture, and data-driven testing via Excel.

 👨‍💻 Author: Varsha Jinde

 📌 Tech Stack
- Programming Language: Java  
- Automation Framework: Selenium WebDriver  
- Test Runner: TestNG  
- Build Tool: Maven  
- Assertions: Assert  
- Framework Design: Page Object Model (POM)  
- Reporting: Allure Reports  
- Test Data: Excel + DataProvider  
 🧰 Features
-  Clean Page Object Model (POM) structure
-  Data-driven testing using Excel files
-  Powerful assertions with Assert
-  Test execution reporting using Allure
- Configurable browser and environment settings
-  Supports CI/CD integration



 📂 Project Structure
Opencart_SeleniumJavaFramework/
├── pom.xml
├── testng.xml
├── crossbrowsertesting.xml
├── README.md
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── PageObjects/
│   │   │   ├── testBase/
│   │   │   ├── testCases/
│   │   │   └── Utilities/
│   │   └── resources/
│
├── testData/
├── test-output/
├── target/

 🔧 Prerequisites
- Java 1.8 or higher
- Maven
- Chrome/Firefox drivers placed in system path or configured in code
 🚀 How to Run Tests
 Run All Tests
bash
mvn clean test

