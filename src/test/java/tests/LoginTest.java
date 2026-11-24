
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void verifySuccessfulLogin() {

        LoginPage loginPage = new LoginPage(driver);

        // Open application
        loginPage.open();

        // Enter valid credentials
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        // Submit login
        loginPage.clickLogin();

        // Verify successful login
        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory.html"),
                "Login was not successful!"
        );
    }

    @Test
    public void verifyInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        // Open application
        loginPage.open();

        // Enter invalid credentials
        loginPage.enterUsername("invalid_user");
        loginPage.enterPassword("wrong_password");

        // Submit login
        loginPage.clickLogin();

        // Verify error message
        String actualMessage = loginPage.getErrorMessage();

        Assert.assertTrue(
                actualMessage.contains(
                        "Username and password do not match"
                ),
                "Expected login error message was not displayed!"
        );
    }
}
