
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    // Wait until element is visible
    protected WebElement waitForVisibility(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    // Wait until element is clickable
    protected WebElement waitForClickability(By locator) {
        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    // Click after waiting
    protected void click(By locator) {
        waitForClickability(locator).click();
    }

    // Enter text after waiting
    protected void enterText(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Get text after waiting
    protected String getText(By locator) {
        return waitForVisibility(locator).getText();
    }
}
