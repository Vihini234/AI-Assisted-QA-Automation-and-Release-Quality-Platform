
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class ProductTest extends BaseTest {

    @Test
    public void verifyAddProductToCart() {

        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Open application and login
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        // Create ProductsPage object
        ProductsPage productsPage = new ProductsPage(driver);

        // Verify Products page
        Assert.assertEquals(
                productsPage.getPageTitle(),
                "Products",
                "Products page was not displayed!"
        );

        // Add first product to cart
        productsPage.addFirstProductToCart();

        // Verify cart count
        Assert.assertEquals(
                productsPage.getCartCount(),
                "1",
                "Product was not added to cart!"
        );

        // Open shopping cart
        productsPage.openCart();

        // Verify cart page
        Assert.assertEquals(
                driver.getCurrentUrl().contains("cart.html"),
                true,
                "Shopping cart page was not displayed!"
        );
    }
}
