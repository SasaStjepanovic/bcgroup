package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class GeneralPage extends BasePage {

    @FindBy(xpath = "//div[@id='popup']//div")
    WebElement popupAd;
    @FindBy(css = "#puclose")
    WebElement closePopupButton;

    @FindBy(xpath = "//div[@id='cart']//button//span[contains(text(),'Dodaj u korpu')]")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='products']//div[1]//div[@class='pbi']/a")
    WebElement firstFilteredProduct;

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void closePopupWindow(String weekendActionYesNo) throws InterruptedException {
        if (weekendActionYesNo.equalsIgnoreCase("Yes")) {
            explicitWaitMainPopup(popupAd);
            clickElement(closePopupButton, "Close popup button is pressed");
        } else {
            System.out.println("There are no any weekend action popup, not to do anything");
        }
        Thread.sleep(500);
    }

    public void clickOnProductType(String productType) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='mainnavwrap']//li//li/a[contains(text(),'" + productType + "')]"))));
        driver.findElement(By.xpath("//div[@id='mainnavwrap']//li//li/a[contains(text(),'" + productType + "')]")).click();
        System.out.println("Product type: " + productType + " is selected");
    }

    public void clickOnSubProductType(String productSubType) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='rightwrap']//div//h3//a[contains(text(),'" + productSubType + "')]"))));
        driver.findElement(By.xpath("//div[@id='rightwrap']//div//h3//a[contains(text(),'" + productSubType + "')]")).click();
        System.out.println("Product sub type: " + productSubType + " is selected");
    }

    public void clickOnProductTypeFromSliderPage(String sliderGroup, String elPositionInSliderGroup) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='prodCarousel']/div//div[" + sliderGroup + "]//div[" + elPositionInSliderGroup + "]"))));
        driver.findElement(By.xpath("//div[@id='prodCarousel']/div//div[" + sliderGroup + "]//div[" + elPositionInSliderGroup + "]")).click();
        System.out.println("Element has been clicked from slider position: " + elPositionInSliderGroup);
    }

    public void clickOnFirstFilteredProduct() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(firstFilteredProduct));
        clickElementJS(firstFilteredProduct, "First filtered element is clicked");
        System.out.println("First element has been clicked");
    }

    public void clickAddToCartButton() {
        clickElement(addToCartButton, "Button AddToCart is pressed");
    }

    public void hoverOverProductType(String productType) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='mainnavwrap']//li//li/a[contains(text(),'" + productType + "')]"))).build().perform();
        System.out.println("hover is pressed");
    }

    int menuSizeDefault = 0;
    int menuSizeHover = 0;

    public void verifySubProductItems(String[] expectedItem) {

        List<WebElement> menuItems = driver.findElements(By.xpath("//div[@id='rightwrap']//div/h3"));
        menuSizeDefault = menuItems.size();
        System.out.println("Total number of product items = " + menuSizeDefault);
        for (int i = 0; i < menuItems.size(); i++) {
            String actualItem = driver.findElements(By.xpath("//div[@id='rightwrap']//div['" + i + "']//h3/a")).get(i).getText();
            System.out.println("Menu item_before" + i + ": " + actualItem + " ,is displayed before comparing");
            Assert.assertEquals(actualItem, expectedItem[i]);
            System.out.println("Menu item_after" + i + ": " + expectedItem + " ,is displayed after comparing");
        }
    }

    public int checkTotalNumbersOfSubProductDefaultItems() {

        boolean b = driver.findElements(By.xpath("//div[@id='rightwrap']//div/h3")).size() > 0;
        if (b) {
            List<WebElement> menuItems = driver.findElements(By.xpath("//div[@id='rightwrap']//div/h3"));
            menuSizeDefault = menuItems.size();
            System.out.println("Total number of product default items = " + menuSizeDefault);
        }
        return menuSizeDefault;
    }

    public int checkTotalNumbersOfSubProductHoverItems() {

        boolean b = driver.findElements(By.xpath("//div[@id='mainnavwrap']//li//li//div/li")).size() > 0;
        if (b) {
            List<WebElement> menuItems = driver.findElements(By.xpath("//div[@id='mainnavwrap']//li//li//div/li"));
            menuSizeHover = menuItems.size();
            System.out.println("Total number of product items hover over = " + menuSizeHover);
        }
        return menuSizeHover;
    }

    public void compareNumberOfItemsDefaultAndHoverView(String productType) throws InterruptedException {

        hoverOverProductType(productType);
        int totalHoverItems = checkTotalNumbersOfSubProductHoverItems();
        System.out.println("total hovers item: " + totalHoverItems);

        clickOnProductType(productType);
        int totalDefaultNumbers = checkTotalNumbersOfSubProductDefaultItems();
        System.out.println("total hovers item: " + totalHoverItems);

        Assert.assertEquals(totalHoverItems, totalDefaultNumbers);

    }

}

