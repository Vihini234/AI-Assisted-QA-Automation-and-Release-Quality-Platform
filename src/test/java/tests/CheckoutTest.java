
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCompleteCheckout() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Step 2: Add product
        ProductsPage productsPage =
                new ProductsPage(driver);

        productsPage.addFirstProductToCart();
        productsPage.openCart();

        // Step 3: Verify cart
        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(
                cartPage.getCartTitle(),
                "Your Cart",
                "Cart page was not displayed!"
        );

        // Step 4: Start checkout
        cartPage.clickCheckout();

        // Step 5: Enter customer details
        CheckoutPage checkoutPage =
                new CheckoutPage(driver);

        checkoutPage.enterCustomerDetails(
                "QA",
                "Tester",
                "10001"
        );

        // Step 6: Continue to overview
        checkoutPage.clickContinue();

        Assert.assertTrue(
                driver.getCurrentUrl().contains(
                        "checkout-step-two"
                ),
                "Checkout overview page was not displayed!"
        );

        // Step 7: Finish checkout
        checkoutPage.clickFinish();

        // Step 8: Verify confirmation
        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!",
                "Order confirmation was not displayed!"
        );
    }
}
