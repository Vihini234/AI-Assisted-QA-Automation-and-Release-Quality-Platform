
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameField =
            By.id("user-name");

    private final By passwordField =
            By.id("password");

    private final By loginButton =
            By.id("login-button");

    private final By errorMessage =
            By.cssSelector("[data-test='error']");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Open application
    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    // Enter username
    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    // Enter password
    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    // Click login
    public void clickLogin() {
        click(loginButton);
    }

    // Get error message
    public String getErrorMessage() {
        return getText(errorMessage);
    }

    // Complete login
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
