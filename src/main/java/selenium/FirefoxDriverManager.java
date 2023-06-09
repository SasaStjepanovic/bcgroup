package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirefoxDriverManager extends DriverManager {
    @Override
    public void createWebDriver() {
        WebDriverManager.firefoxdriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
    }
}
