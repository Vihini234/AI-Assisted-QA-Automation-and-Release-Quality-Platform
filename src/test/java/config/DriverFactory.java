
package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");
            options.addArguments("--disable-features=PasswordLeakDetection");

            options.setExperimentalOption(
                    "prefs",
                    java.util.Map.of(
                            "credentials_enable_service", false,
                            "profile.password_manager_enabled", false
                    )
            );

            driver = new ChromeDriver(options);
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
