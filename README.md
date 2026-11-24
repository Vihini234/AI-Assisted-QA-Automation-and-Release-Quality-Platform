# AI-Assisted QA Automation and Release Quality Platform

An end-to-end Quality Assurance automation project that combines API testing, UI automation, database validation, test reporting, and CI/CD practices to evaluate application quality and support reliable software releases.

**Repository:** [GitHub – AI-Assisted QA Automation and Release Quality Platform](https://github.com/Vihini234/AI-Assisted-QA-Automation-and-Release-Quality-Platform)

---

## Project Overview

This project demonstrates a structured QA automation framework designed to validate different layers of a software application.

It integrates automated API testing, browser-based UI testing, database validation, and continuous integration using GitHub Actions.

The project also explores how AI-assisted analysis can help interpret test failures and support release quality decisions using actual test execution evidence.

## Key Features

- **API Automation:** REST API testing with REST Assured.
- **UI Automation:** Browser automation using Selenium WebDriver.
- **Page Object Model:** Reusable page classes for maintainable UI tests.
- **Database Testing:** JDBC-based database validation using SQL queries.
- **Test Framework:** TestNG for test execution and assertions.
- **Test Reporting:** Allure reporting for test execution results.
- **CI/CD Integration:** GitHub Actions workflow for automated test execution.
- **AI-Assisted Quality Analysis:** Planned extension for evidence-based test failure analysis and release quality evaluation.

## Technology Stack

| Category | Technologies |
|---|---|
| Programming Language | Java 21 |
| UI Automation | Selenium WebDriver |
| API Testing | REST Assured |
| Test Framework | TestNG |
| Database Testing | JDBC, SQL |
| Reporting | Allure |
| Build Tool | Maven |
| CI/CD | GitHub Actions |
| Version Control | Git, GitHub |
| Browser | Google Chrome |

## Project Architecture

```text
AI-Assisted-QA-Automation-and-Release-Quality-Platform/
│
├── .github/
│   └── workflows/
│       └── main.yml
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── config/
│       │   │   ├── ApiConfig.java
│       │   │   ├── DatabaseConnection.java
│       │   │   └── DriverFactory.java
│       │   │
│       │   ├── pages/
│       │   │   ├── BasePage.java
│       │   │   ├── LoginPage.java
│       │   │   ├── ProductsPage.java
│       │   │   ├── CartPage.java
│       │   │   └── CheckoutPage.java
│       │   │
│       │   ├── specifications/
│       │   │   ├── RequestSpec.java
│       │   │   └── ResponseSpec.java
│       │   │
│       │   ├── tests/
│       │   │   ├── API Tests
│       │   │   ├── UI Tests
│       │   │   └── DatabaseTest.java
│       │   │
│       │   └── utils/
│       │       └── TestDataReader.java
│       │
│       └── resources/
│           └── testdata/
│               ├── postData.json
│               └── multiplePostData.json
│
├── pom.xml
└── README.md
```

*The architecture is subject to change as additional modules are developed.*

## Testing Modules

### 1. API Automation Testing

API automation is implemented using REST Assured.

The test suite covers:

- GET requests
- POST requests
- PUT requests
- PATCH requests
- DELETE requests
- Positive and negative scenarios
- HTTP status code validation
- Response body validation
- Data-driven API testing using JSON test data

The API test suite uses JSONPlaceholder as a sample REST API.

### 2. UI Automation Testing

UI automation is implemented using Selenium WebDriver and TestNG.

The target application is [SauceDemo](https://www.saucedemo.com/).

Test scenarios include:

- Valid user login
- Invalid login validation
- Product selection
