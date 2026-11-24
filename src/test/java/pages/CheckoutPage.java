
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    private final WebDriverWait checkoutWait;

    // Locators
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");
    private final By confirmationMessage =
            By.className("complete-header");

    private final By checkoutOverview =
            By.id("checkout_summary_container");

    private final By errorMessage =
            By.cssSelector("[data-test='error']");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
        checkoutWait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }

    // Enter customer details
    public void enterCustomerDetails(
            String first,
            String last,
            String postal) {

        enterText(firstName, first);
        enterText(lastName, last);
        enterText(postalCode, postal);
    }

    // Continue checkout and verify overview page
    public void clickContinue() {

        click(continueButton);

        checkoutWait.until(
                ExpectedConditions.or(
                        ExpectedConditions.urlContains(
                                "checkout-step-two"
                        ),
                        ExpectedConditions.visibilityOfElementLocated(
                                errorMessage
                        )
                )
        );

        if (!driver.getCurrentUrl().contains("checkout-step-two")) {
            throw new AssertionError(
                    "Checkout did not reach the overview page. " +
                            "Check the customer details."
            );
        }

        checkoutWait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        checkoutOverview
                )
        );
    }

    // Finish checkout
    public void clickFinish() {

        checkoutWait.until(
                ExpectedConditions.elementToBeClickable(
                        finishButton
                )
        ).click();
    }

    // Get confirmation message
    public String getConfirmationMessage() {

        return checkoutWait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        confirmationMessage
                )
        ).getText();
    }
}
