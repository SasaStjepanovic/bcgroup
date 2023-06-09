package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class ShoppingBasketPage extends BasePage {

    public ShoppingBasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='userinner']/h2")
    WebElement successfulLoginLogOutMessage;

    @FindBy(xpath = "//form[@id='loginform']//div/p[@class='loginerror']")
    WebElement unSuccessfulLoginMessage;

    @FindBy(xpath = "//div[@id='cartwrap']//a[contains(text(),'Nastavi kupovinu')]")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//div[@id='cartwrap']//span[contains(text(),'Poruči')]")
    WebElement poruciButton;

    @FindBy(xpath = "//table[@id='shopping-cart-table']")
    WebElement shoppingBasketNotEmpty;

    @FindBy(xpath = "//div[@id='cartwrap']//div[text()='Vaša korpa je prazna']")
    WebElement shoppingBasketIsEmpty;

    @FindBy(xpath = "//span[text()=' Korpa']")
    WebElement korpaButton;

    @FindBy(xpath = "//table[@id='shopping-cart-table']//tbody/tr[1]//i[@class='glyphicon glyphicon-trash']/..//i[1]")
    WebElement deleteButton;

    public void checkNumberOfBasketItemsFromMainPage(String numberOfBasketItems) {
        WebElement element = driver.findElement(By.xpath("//div[@id='links']//a[contains(text(),'" + numberOfBasketItems + "')]"));

        compareNumbers(element, numberOfBasketItems);
    }

    GeneralPage gp = new GeneralPage(driver);

    public void addProductToTheBasket(Map<String, String> data, String productType, String productSubType, String sliderGroup, String elPositionInSliderGroup) {
        int numberOfProduct = Integer.parseInt(data.get("productNumber"));

        if (numberOfProduct == 0) {
            System.out.println("Wrong number of product. Number can not be zero");
        } else if (numberOfProduct < 5) {
            for (int i = 0; i < numberOfProduct; i++) {
                System.out.println("Number of product is more than 1 and less of 5");
                gp.clickOnProductType(productType);
                gp.clickOnSubProductType(productSubType);
                gp.clickOnProductTypeFromSliderPage(sliderGroup, String.valueOf(i + 1));
                gp.clickAddToCartButton();
                clickElement(continueShoppingButton, "Nastavi kupovinu button is pressed");
            }
        } else {
            System.out.println("Number of product is more than 4");

        }
    }

    public void clickKorpaButton() {
        clickElement(korpaButton, "Korpa button is pressed");
    }

    public void deleteAllProductFromBasket() throws InterruptedException {

        boolean b = isElementPresent(shoppingBasketNotEmpty);
        if (b) {
            List<WebElement> listOfCheckList = driver.findElements(By.xpath("//table[@id='shopping-cart-table']//tbody/tr"));
            System.out.println("Elements exist in the basket");
            for (int i = 0; i < listOfCheckList.size(); i++) {
                clickElement(deleteButton, "Delete button is pressed");
                System.out.println("Element No: " + (i + 1) + " is deleted");
            }
        } else {
            System.out.println("Basket of products is already empty");
        }
    }

    public void verifyNastaviKupovinuButtonInvisibility() {

        boolean b = isElementPresent(continueShoppingButton);

        if (b) {
            Assert.fail("Nastavi kupovinu button is displayed");
        } else {
            System.out.println("Nastavi kupovinu button is not displayed");
        }
    }

    public void verifyPoruciButtonInvisibility() {

        boolean b = isElementPresent(poruciButton);

        if (b) {
            Assert.fail("Poruci button is displayed");
        } else {
            System.out.println("Poruci button is not displayed");
        }
    }
}
