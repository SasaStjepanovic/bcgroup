package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserEditPage extends BasePage {

    public UserEditPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    int waitTime1 = 11;

    @FindBy(xpath = "//a[@href='/korisnik-edit']")
    WebElement userEditButton;

    @FindBy(css = "#name")
    WebElement nameEl;

    @FindBy(css = "#lastname")
    WebElement lastnameEl;

    @FindBy(css = "#address")
    WebElement addressEl;

    @FindBy(css = "#zip")
    WebElement zipEl;

    @FindBy(css = "#city")
    WebElement cityEl;

    @FindBy(css = "#phone")
    WebElement phoneEl;

    @FindBy(css = "#edituser")
    WebElement saveChanges;

    @FindBy(xpath = "//div[@class='alert alert-success row']/div")
    WebElement successfulMessageAfterSaveChanges;

    public void pressUserEditButton() {
        clickElement(userEditButton, "User edit button is pressed");
    }

    public String randomName() {
        Faker fakerData = new Faker();
        String randomName = String.valueOf(fakerData.name().firstName());
        System.out.println("Random name immediately after generated is :" + randomName);
        return randomName;
    }

    public void enterName(String randomDataYesNo, String name, String randomName) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(nameEl, name, "Name is entered");
        } else {
            typeText(nameEl, randomName, "Random name is entered");
        }
    }

    public String randomLastName() {
        Faker fakerData = new Faker();
        String randomLastName = String.valueOf(fakerData.name().lastName());
        System.out.println("Random last name immediately after generated is :" + randomLastName);
        return randomLastName;
    }

    public void enterLastName(String randomDataYesNo, String lastName, String randomLastName) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(lastnameEl, lastName, "Last name is entered");
        } else {
            typeText(lastnameEl, randomLastName, "Random last name is entered");
        }
    }

    public String randomAddress() {
        Faker fakerData = new Faker();
        String randomAddress = String.valueOf(fakerData.address().streetAddress());
        System.out.println("Random address immediately after generated is :" + randomAddress);
        return randomAddress;
    }

    public void enterAddress(String randomDataYesNo, String address, String randomAddress) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(addressEl, address, "Address is entered");
        } else {
            typeText(addressEl, randomAddress, "Random address is entered");
        }
    }

    public String randomZip() {
        Faker fakerData = new Faker();
        String randomZip = String.valueOf(fakerData.number().numberBetween(100000, 999999));
        System.out.println("Random zip immediately after generated is :" + randomZip);
        return randomZip;
    }

    public void enterZip(String randomDataYesNo, String zip, String randomZip) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(zipEl, zip, "Zip is entered");
        } else {
            typeText(zipEl, randomZip, "Random zip is entered");
        }
    }

    public String randomCity() {
        Faker fakerData = new Faker();
        String randomCity = String.valueOf(fakerData.address().cityName());
        System.out.println("Random city immediately after generated is :" + randomCity);
        return randomCity;
    }

    public void enterCity(String randomDataYesNo, String city, String randomCity) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(cityEl, city, "City is entered");
        } else {
            typeText(cityEl, randomCity, "Random city is entered");
        }
    }

    public String randomPhoneNumber() {
        Faker fakerData = new Faker();
        String randomPhoneNumber = String.valueOf(fakerData.phoneNumber().subscriberNumber(14));
        System.out.println("Random phone number immediately after generated is :" + randomPhoneNumber);
        return randomPhoneNumber;
    }

    public void enterPhoneNumber(String randomDataYesNo, String phoneNumber, String randomPhone) {
        if (randomDataYesNo.equalsIgnoreCase("No")) {
            typeText(phoneEl, phoneNumber, "Phone number is entered");
        } else {
            typeText(phoneEl, randomPhone, "Random phone number is entered");
        }
    }

    public void verifyEditedUserData(String attributeType, String randomNameV, String randomLastNameV, String randomAddressV, String randomZipV, String randomCityV, String randomPhoneV) {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        getAttribute(nameEl, randomNameV, attributeType);
        getAttribute(lastnameEl, randomLastNameV, attributeType);
        getAttribute(addressEl, randomAddressV, attributeType);
        getAttribute(zipEl, randomZipV, attributeType);
        getAttribute(cityEl, randomCityV, attributeType);
        getAttribute(phoneEl, randomPhoneV, attributeType);
    }

    public void pressSaveChangesButton() {
        clickElement(saveChanges, "Save changes button is pressed");
    }

    public void verifyMessageAfterUserChanges(String expectedMessage1) {
        compareText(successfulMessageAfterSaveChanges, expectedMessage1);
    }

    public void verifyUnsuccessfulMessageAfterUserChanges(String expectedMessage1, String elementId) {
        WebElement element = driver.findElement(By.xpath("//input[@id='" + elementId + "']/..//div[contains(text(),'" + expectedMessage1 + "')]"));
        explicitWait(element);
        compareText(element, expectedMessage1);
    }

    public void timeDurationOfMessage() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, waitTime1);
        webDriverWait.until(ExpectedConditions.invisibilityOf(successfulMessageAfterSaveChanges));
        System.out.println("Temporary message has disappeared");
    }
}
