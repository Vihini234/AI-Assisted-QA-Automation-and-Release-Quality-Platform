
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    // Locators
    private final By pageTitle =
            By.className("title");

    private final By firstAddToCartButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private final By shoppingCart =
            By.className("shopping_cart_link");

    private final By cartBadge =
            By.className("shopping_cart_badge");

    // Constructor
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    // Get page title
    public String getPageTitle() {
        return getText(pageTitle);
    }

    // Add first product
    public void addFirstProductToCart() {
        click(firstAddToCartButton);
    }

    // Get cart count
    public String getCartCount() {
        return getText(cartBadge);
    }

    // Open shopping cart
    public void openCart() {
        click(shoppingCart);
    }
}
