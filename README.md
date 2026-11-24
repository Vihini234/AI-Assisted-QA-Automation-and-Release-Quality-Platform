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
- Adding products to the shopping cart
- Cart validation
- Checkout workflow
- Order confirmation

The Page Object Model (POM) is used to separate page elements and interactions from test logic.

### 3. Database Testing

Database testing is implemented using Java JDBC and SQL.

The current database test scenarios include:

- Valid customer record validation
- Duplicate customer validation
- Non-existing customer validation
- Null customer data validation
- Customer data operation validation

The database tests are organized using TestNG and include assertions to verify expected database behaviour.

### 4. Test Reporting

Allure is integrated with TestNG to generate detailed test execution reports.

Reports help visualize:

- Test execution status
- Passed and failed tests
- Execution details
- Test-level results

### 5. CI/CD Integration

GitHub Actions is configured to execute automated tests when changes are pushed to the main branch or pull requests are created.

The pipeline includes:

1. Repository checkout
2. Java 21 setup
3. Chrome setup
4. Maven environment verification
5. Automated test execution
6. Allure results artifact upload

## Getting Started

### Prerequisites

Install the following tools:

- Java JDK 21
- Apache Maven
- Google Chrome
- IntelliJ IDEA or another Java IDE
- Git

### Clone the Repository

```bash
git clone https://github.com/Vihini234/AI-Assisted-QA-Automation-and-Release-Quality-Platform.git
```

Navigate to the project:

```bash
cd AI-Assisted-QA-Automation-and-Release-Quality-Platform
```

### Run the Tests

Execute the complete test suite:

```bash
mvn clean test
```

### Generate an Allure Report

Generate and serve the report using:

```bash
mvn io.qameta.allure:allure-maven:2.15.0:serve
```

## Continuous Integration

The project uses GitHub Actions to automate test execution.

**Workflow file:** `.github/workflows/main.yml`

View workflow executions:

[GitHub Actions – Project Workflows](https://github.com/Vihini234/AI-Assisted-QA-Automation-and-Release-Quality-Platform/actions)

Allure test results are uploaded as GitHub Actions artifacts when available.

## Current Development Status

| Module | Status |
|---|---|
| API Automation | Implemented |
| Selenium UI Automation | Implemented; checkout scenario under investigation |
| Page Object Model | Implemented |
| Database Testing | Implemented; five tests passed locally |
| TestNG Integration | Implemented |
| Allure Reporting | Integrated |
| GitHub Actions CI/CD | Configured |
| AI-Assisted Failure Analysis | Planned |
| Release Quality Dashboard | Planned |

## Future Enhancements

- Implement evidence-based AI-assisted test failure analysis.
- Integrate automated failure classification.
- Develop a release quality evaluation mechanism.
- Build a dashboard to visualize test execution results.
- Introduce additional database and integration testing scenarios.
- Improve test stability and expand automated regression coverage.

## Learning Objectives

This project is developed to gain practical experience in:

- Designing maintainable automation frameworks.
- Applying software testing principles.
- Automating REST API validation.
- Implementing Selenium-based UI automation.
- Performing database testing with JDBC and SQL.
- Integrating automated tests into CI/CD pipelines.
- Analysing failures and evaluating software quality.

## Author

**Vihini Waths iluni Ranasingha**

Industrial Information Technology Undergraduate  
Uva Wellassa University of Sri Lanka

- [GitHub](https://github.com/Vihini234)
- [LinkedIn](https://www.linkedin.com/in/vihini-wathsiluni-a57b1323a/)
- [QA Portfolio](https://vihini-qa-portfolio.vercel.app/)

---

*This is an ongoing QA engineering project focused on building a practical, maintainable, and evidence-driven software quality automation platform.*
