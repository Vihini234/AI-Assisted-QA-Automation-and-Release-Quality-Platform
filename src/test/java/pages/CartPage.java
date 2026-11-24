
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    // Locators
    private final By checkoutButton =
            By.id("checkout");

    private final By cartTitle =
            By.className("title");

    // Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Get cart title
    public String getCartTitle() {
        return getText(cartTitle);
    }

    // Click checkout
    public void clickCheckout() {
        click(checkoutButton);
        wait.until(
                ExpectedConditions.urlContains("checkout-step-one")
        );
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("checkout_info_container")
                )
        );
    }
}
