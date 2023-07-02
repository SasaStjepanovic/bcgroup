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
    WebElement shoppingBasketIsEmpty1;

    @FindBy(xpath = "//div[@id='cartwrap']//div")
    WebElement shoppingBasketIsEmpty2;

    @FindBy(xpath = "//span[text()=' Korpa']")
    WebElement korpaButton;

    @FindBy(xpath = "//button[@id='cart-submit']")
    WebElement posaljiPorudzbinuButton;

    @FindBy(xpath = "//table[@id='shopping-cart-table']//tbody/tr[1]//i[@class='glyphicon glyphicon-trash']/..//i[1]")
    WebElement deleteButton;

    @FindBy(xpath = "//select[@id='payment_method']")
    WebElement dropDownMenuPayment;

    @FindBy(xpath = "//div[@id='customer-data']//div[1]//span")

    WebElement verifyMeesageIme;

    @FindBy(xpath = "//div[@id='customer-data']//div[2]//span")

    WebElement verifyMeesagePrezime;

    @FindBy(xpath = "//div[@id='customer-data']//div[3]//span")

    WebElement verifyMeesageEmail;

    @FindBy(xpath = "//div[@id='customer-data']//div[4]//span")

    WebElement verifyMeesageTel;

    @FindBy(xpath = "//div[@id='customer-data']//div[5]//span")

    WebElement verifyMeesageUlica;

    @FindBy(xpath = "//div[@id='customer-data']//div[6]//span")

    WebElement verifyMeesageZip;

    @FindBy(xpath = "//div[@id='customer-data']//div[7]//span")
    WebElement verifyMeesageGrad;


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

    public void verifyEmptyBasket(String emptyBasketMessage){
        comparePartOfText(shoppingBasketIsEmpty1, emptyBasketMessage);
    }

    public void verifySuccessfulOrder(String emptyBasketMessage){
        comparePartOfText(shoppingBasketIsEmpty2, emptyBasketMessage);
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
            Assert.fail("Error. Nastavi kupovinu button is displayed");
        } else {
            System.out.println("Nastavi kupovinu button is not displayed");
        }
    }

    public void verifyPoruciButtonInvisibility() {

        boolean b = isElementPresent(poruciButton);

        if (b) {
            Assert.fail("Error. Poruci button is displayed");
        } else {
            System.out.println("Poruci button is not displayed");
        }
    }

    public void clickPoruciButton() {
        clickElement(poruciButton, "Poruci button is pressed");
    }

    public void clickPosaljiPorudzbinu(){
        clickElementJS(posaljiPorudzbinuButton, "Posalji porudzbinu button is pressed");
    }

    public void choosePaymentMethod(String dropItem) {
        dropDownList(dropDownMenuPayment, dropItem);
    }

    public void verifyMessageOnKorpaPage(String verifTag, String expectedText) throws InterruptedException {

        if ((verifTag.equalsIgnoreCase("ime1")||(verifTag.equalsIgnoreCase("ime2"))||(verifTag.equalsIgnoreCase("ime3"))||(verifTag.equalsIgnoreCase("ime4")))) {
            compareText(verifyMeesageIme, expectedText);
        } else if ((verifTag.equalsIgnoreCase("prezime1")||(verifTag.equalsIgnoreCase("prezime2"))||(verifTag.equalsIgnoreCase("prezime3"))||(verifTag.equalsIgnoreCase("prezime4"))||(verifTag.equalsIgnoreCase("prezime5")))) {
            compareText(verifyMeesagePrezime, expectedText);
        } else if ((verifTag.equalsIgnoreCase("adresa1")||(verifTag.equalsIgnoreCase("adresa2"))||(verifTag.equalsIgnoreCase("adresa3"))||(verifTag.equalsIgnoreCase("adresa4")))) {
            compareText(verifyMeesageUlica, expectedText);
        } else if ((verifTag.equalsIgnoreCase("zip1")||(verifTag.equalsIgnoreCase("zip2"))||(verifTag.equalsIgnoreCase("zip3"))||(verifTag.equalsIgnoreCase("zip4"))||(verifTag.equalsIgnoreCase("zip5")))) {
            compareText(verifyMeesageZip, expectedText);
        } else if ((verifTag.equalsIgnoreCase("grad1")||(verifTag.equalsIgnoreCase("grad2"))||(verifTag.equalsIgnoreCase("grad3")))) {
            compareText(verifyMeesageGrad, expectedText);
        } else if ((verifTag.equalsIgnoreCase("tel1")||(verifTag.equalsIgnoreCase("tel2"))||(verifTag.equalsIgnoreCase("tel3"))||(verifTag.equalsIgnoreCase("tel4")))) {
            compareText(verifyMeesageTel, expectedText);
        } else {
            compareText(verifyMeesageEmail, expectedText);
        }

    }


}
