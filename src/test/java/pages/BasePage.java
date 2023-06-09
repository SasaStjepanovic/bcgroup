package pages;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    int waitTime = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void explicitWait(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void explicitWaitMainPopup(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void explicitWaitInvisibilityOfElement(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime);
        webDriverWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void clickElement(WebElement element, String log) {
        explicitWait(element);

        try {
            scrollToElement(element);
            new Actions(driver).moveToElement(element).perform();
            element.click();
            System.out.println("Clicked element: " + log);
        } catch (Exception e) {
            e.printStackTrace();
            scrollToElement(element);
            element.click();
            System.out.println("Clicked element: " + log);
        }
    }

    public void clickElementJS(WebElement element, String log) {
        explicitWait(element);

        try {
            scrollToElement(element);
            new Actions(driver).moveToElement(element).build().perform();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            System.out.println("Clicked element: " + log);
        } catch (Exception e) {
            e.printStackTrace();
            scrollToElement(element);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            System.out.println("Clicked element: " + log);
        }
    }

    public void typeText(WebElement element, String text, String log) {
        explicitWait(element);

        try {
            scrollToElement(element);
            new Actions(driver).moveToElement(element).perform();
            element.click();
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            element.sendKeys(Keys.DELETE);
            element.sendKeys(text);
            System.out.println("Entered text: " + text + " :to element: " + log);
        } catch (Exception e) {
            e.printStackTrace();
            element.click();
            element.sendKeys(text);
            System.out.println("Entered text: " + text + " :to element: " + log);
        }
    }

    public void typeTextJS(WebElement element, String text, String log) {
        explicitWait(element);

        try {
            new Actions(driver).moveToElement(element).perform();
            clickElementJS(element, " element is clicked");
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            element.sendKeys(Keys.DELETE);
            element.sendKeys(text);
            System.out.println("Entered text: " + text + " :to element: " + log);
        } catch (Exception e) {
            e.printStackTrace();
            clickElementJS(element, " element is clickd");
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            element.sendKeys(Keys.DELETE);
            element.sendKeys(text);
            System.out.println("Entered text: " + text + " :to element: " + log);
        }
    }

    public void clickXbutton(WebElement element, String log) {

        try {
            scrollToElement(element);
            new Actions(driver).moveToElement(element).perform();
            if (!element.isDisplayed()) {
                System.out.println("Web element is not displayed any more");
            } else {
                element.isDisplayed();
                clickElementJS(element, " x button is pressed");
            }
            System.out.println("Checked element" + log);
        } catch (Exception e) {
            e.printStackTrace();
            if (!element.isDisplayed()) {
                System.out.println("Web element is not displayed any more");
            } else {
                element.isDisplayed();
                clickElementJS(element, " x button is pressed");
            }
            System.out.println("Checked element" + log);
        }
    }

    public void checkCheckbox(WebElement element, String log) {
        explicitWait(element);

        try {
            scrollToElement(element);
            new Actions(driver).moveToElement(element).perform();
            if (!element.isSelected()) {
                element.click();
            } else {
                element.isSelected();
                System.out.println("Web element is already clicked");
            }
            System.out.println("Checked element" + log);
        } catch (Exception e) {
            e.printStackTrace();
            if (!element.isSelected()) {
                element.click();
            } else {
                element.isSelected();
                System.out.println("Web element is already clicked");
            }
            System.out.println("Checked element" + log);
        }
    }

    public void compareText(WebElement element, String expectedText) {
        explicitWait(element);
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Actual text is: " + actualText);
    }

    public void compareNumbers(WebElement element, String expectedNumber) {
        explicitWait(element);
        String actualNumber = element.getText();
        Assert.assertTrue(actualNumber.contains(expectedNumber), actualNumber);
        System.out.println("Actual number of products into the basket is: " + actualNumber);

    }

    public void comparePartOfText(WebElement element, String expectedText) {
        String actualTitle = element.getText();
        System.out.println("Actual text is: " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedText), actualTitle);
    }

    public void checkUrlPage(String url) {
        String expextedUrl = "https://www.bcgroup-online.com/" + url;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current url address: " + actualUrl);
        Assert.assertTrue(actualUrl.contains(expextedUrl), actualUrl);
    }

    public void getAttribute(WebElement element, String expectedValue, String attributeType) {
        String actualValue = element.getAttribute(attributeType);
        System.out.println("Actual value of element is : " + actualValue);
        Assert.assertEquals(actualValue, expectedValue);
    }

    public boolean getCssValue(WebElement element, String expectedValue, String cssType) {
        String actualValue = element.getCssValue(cssType);
        System.out.println("Actual CSS value of element is : " + actualValue);
        Assert.assertEquals(actualValue, expectedValue);
        return true;
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public void scroll(String x, String y) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void takeScreenshot(String name, boolean yesNo) {
        try {
            while (!yesNo) {
                System.out.println("Take screenshot will not be done");
                break;
            }
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("src/results/screenshots/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportScreenshotAllure(String name, String desc, boolean yesNo) {
        try {
            while (!yesNo) {
                System.out.println("Take screenshot will not be done");
                break;
            }
            long finish = System.currentTimeMillis();
            takeScreenshot(name + "_" + finish, yesNo);
            Path path = Paths.get("src/results/screenshots/" + name + "_" + finish + ".png");
            InputStream is = Files.newInputStream(path);
            Allure.addAttachment(desc, is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pause(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

    public void verifyInvisibilityOfElement(WebElement element) {
        explicitWaitInvisibilityOfElement(element);
        System.out.println("Element is not displayed");
    }

    public void dropDownList(WebElement element, String dropText) {
        Select select = new Select(element);
        select.selectByVisibleText(dropText);
        System.out.println("Drop down menu item " + dropText + ", is selected");
    }

    protected boolean isElementPresent(WebElement el) {
        try {
            el.isDisplayed();
            System.out.println("Web elemeny exist");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Web element does not exist");
            return false;
        }
    }
}
