package steps;

import excel.ExcelSupport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import pages.*;
import tests.BaseTest;

import java.util.Map;

public class BaseSteps extends BaseTest {

    Map<String, String> data;

    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String env = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("env");
    String wait = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("wait");

    String randomNameVerif;
    String randomLastNameVerif;
    String randomAddressVerif;
    String randomZipVerif;
    String randomCityVerif;
    String randomPhoneVerif;
    UserEditPage ue = new UserEditPage(driver);

    @Before
    public void setup() throws Exception {
        init(browser, wait);
        openBcGroupApp(env);

        randomNameVerif = ue.randomName();
        randomLastNameVerif = ue.randomLastName();
        randomAddressVerif = ue.randomAddress();
        randomZipVerif = ue.randomZip();
        randomCityVerif = ue.randomCity();
        randomPhoneVerif = ue.randomPhoneNumber();
    }

    @After
    public void tearDown() {
        quit();
    }


    @Given("a user reads test data from {string} {string} by id {string}")
    public void aUserReadsTestDataFromById(String fileName, String sheetName, String id) throws Exception {
        data = new ExcelSupport().getDataByID(fileName, sheetName, id);
    }

    @And("users clicks login button")
    public void usersClicksLoginButton() {
        new LoginLogoutPage(driver).pressVipLoginButton();
    }

    @When("user enters email and password for login")
    public void userEntersEmailAndPasswordForLogin() {
        new LoginLogoutPage(driver).login(data.get("email"), data.get("password"));
    }

    @Then("user should be verified login action")
    public void userShouldBeVerifiedLoginAction() {
        new LoginLogoutPage(driver).verifyLoginAction(data.get("verificationType"), data.get("expectedMessage1"));
    }

    @And("user clicks logout button")
    public void userClicksLogoutButton() {
        new LoginLogoutPage(driver).pressLogOutButton();
    }

    @Then("user should be verified logout action")
    public void userShouldBeVerifiedLogoutAction() {
        new LoginLogoutPage(driver).verifyLogOutAction(data.get("verificationType"), data.get("expectedMessage2"));
    }

    @And("users  clicks user edit button")
    public void usersClicksUserEditButton() {
        new UserEditPage(driver).pressUserEditButton();
    }

    @When("users enters name")
    public void usersEntersName() {
        new UserEditPage(driver).enterName(data.get("randomDataYesNo"), data.get("name"), randomNameVerif);
    }

    @When("users enters last name")
    public void usersEntersLastName() {
        new UserEditPage(driver).enterLastName(data.get("randomDataYesNo"), data.get("lastname"), randomLastNameVerif);
    }

    @When("users enters address")
    public void usersEntersAddress() {
        new UserEditPage(driver).enterAddress(data.get("randomDataYesNo"), data.get("address"), randomAddressVerif);
    }

    @When("users enters zip code")
    public void usersEntersZipCode() {
        new UserEditPage(driver).enterZip(data.get("randomDataYesNo"), data.get("zip"), randomZipVerif);
    }

    @When("users enters city")
    public void usersEntersCity() {
        new UserEditPage(driver).enterCity(data.get("randomDataYesNo"), data.get("city"), randomCityVerif);
    }

    @When("users enters phone number")
    public void usersEntersPhoneNumber() {
        new UserEditPage(driver).enterPhoneNumber(data.get("randomDataYesNo"), data.get("phone"), randomPhoneVerif);
    }

    @And("users clicks save changes button")
    public void usersClicksSaveChangesButton() {
        new UserEditPage(driver).pressSaveChangesButton();
    }

    @Then("user should verify successful message after changes")
    public void userShouldVerifySuccessfulMessageAfterChanges() {
        new UserEditPage(driver).verifyMessageAfterUserChanges(data.get("expectedMessage1"));
    }

    @Then("user should verify all edited changes")
    public void userShouldVerifyAllEditedChanges() {
        new UserEditPage(driver).verifyEditedUserData(data.get("attributeType"),
                randomNameVerif,
                randomLastNameVerif,
                randomAddressVerif,
                randomZipVerif,
                randomCityVerif,
                randomPhoneVerif);
    }

    @Then("user should verify unsuccessful message after changes")
    public void userShouldVerifyUnsuccessfulMessageAfterChanges() {
        new UserEditPage(driver).verifyUnsuccessfulMessageAfterUserChanges(data.get("expectedMessage1"), data.get("elementID"));
    }

    @Then("user should be verify lasting time of successful message")
    public void userShouldBeVerifyLastingTimeOfSuccessfulMessage() {
        new UserEditPage(driver).timeDurationOfMessage();
    }

    @And("user closes popup window")
    public void userClosesPopupWindow() throws InterruptedException {
        new GeneralPage(driver).closePopupWindow(data.get("weekendActionYesNo"));
    }

    @And("user clicks product type")
    public void userClicksProductType() {
        new GeneralPage(driver).clickOnProductType(data.get("productType"));
    }

    @Then("user should verify all sub products")
    public void userShouldVerifyAllSubProducts() throws InterruptedException {
        new GeneralPage(driver).verifySubProductItems(new String[]{
                data.get("SubPrType1"), data.get("SubPrType2"), data.get("SubPrType3"), data.get("SubPrType4"),
                data.get("SubPrType5"), data.get("SubPrType6"), data.get("SubPrType7"), data.get("SubPrType8"),
                data.get("SubPrType9"), data.get("SubPrType10"), data.get("SubPrType11"), data.get("SubPrType12"),
                data.get("SubPrType13"), data.get("SubPrType14"), data.get("SubPrType15"), data.get("SubPrType16"),
                data.get("SubPrType17"), data.get("SubPrType18"), data.get("SubPrType19"), data.get("SubPrType20"),
                data.get("SubPrType21"), data.get("SubPrType22"), data.get("SubPrType23"), data.get("SubPrType24"),
                data.get("SubPrType25"), data.get("SubPrType26"), data.get("SubPrType27"), data.get("SubPrType28"),
                data.get("SubPrType29"), data.get("SubPrType30"), data.get("SubPrType31"), data.get("SubPrType32"),
                data.get("SubPrType33"), data.get("SubPrType34")});
    }

    @Then("user should verify current opened page")
    public void userShouldVerifyCurrentOpenedPage() {
        new BasePage(driver).checkUrlPage(data.get("urlPage"));
    }

    @And("user clicks hover over product type")
    public void userClicksHoverOverProductType() throws InterruptedException {
        new GeneralPage(driver).hoverOverProductType(data.get("productType"));
    }

    @Then("user should checks total number of product on hover view")
    public void userShouldChecksTotalNumberOfProductOnHoverView() {
        new GeneralPage(driver).checkTotalNumbersOfSubProductHoverItems();
    }

    @Then("user should checks total number of product on default view")
    public void userShouldChecksTotalNumberOfProductOnDefaultView() {
        new GeneralPage(driver).checkTotalNumbersOfSubProductDefaultItems();
    }

    @Then("user should compare default and hover number of items")
    public void userShouldCompareDefaultAndHoverNumberOfItems() throws InterruptedException {
        new GeneralPage(driver).compareNumberOfItemsDefaultAndHoverView(data.get("productType"));
    }

    @And("user clicks sub product type")
    public void userClicksSubProductType() {
        new GeneralPage(driver).clickOnSubProductType(data.get("SubPrType1"));
    }

    @And("user clicks sub product type from slider page")
    public void userClicksSubProductTypeFromSliderPage() {
        new GeneralPage(driver).clickOnProductTypeFromSliderPage(data.get("sliderGroup"), data.get("elPositionInSliderGroup"));
    }

    @And("user clicks add to cart button")
    public void userClicksAddToCartButton() {
        new GeneralPage(driver).clickAddToCartButton();
    }

    @Then("user should verify number of items from basket on the main page")
    public void userShouldVerifyNumberOfItemsFromBasketOnTheMainPage() {
        new ShoppingBasketPage(driver).checkNumberOfBasketItemsFromMainPage(data.get("productNumber"));
    }

    @And("user add products to basket")
    public void userAddProductsToBasket() {
        new ShoppingBasketPage(driver).addProductToTheBasket(data, data.get("productType"), data.get("SubPrType1"), data.get("sliderGroup"), data.get("elPositionInSliderGroup"));
    }

    @Then("user should delete and verify that all products are deleted")
    public void userShouldDeleteAndVerifyThatAllProductsAreDeleted() throws InterruptedException {
        ShoppingBasketPage sb = new ShoppingBasketPage(driver);
        sb.clickKorpaButton();
        sb.deleteAllProductFromBasket();
    }

    @And("user clicks on korpa button")
    public void userClicksOnKorpaButton() {
        new ShoppingBasketPage(driver).clickKorpaButton();
    }

    @Then("user should verify invisibility of nastavi kupovinu button")
    public void userShouldVerifyInvisibilityOfNastaviKupovinuButton() {
        new ShoppingBasketPage(driver).verifyNastaviKupovinuButtonInvisibility();
    }

    @Then("user should verify invisibility of poruci button")
    public void userShouldVerifyInvisibilityOfPoruciButton() {
        new ShoppingBasketPage(driver).verifyPoruciButtonInvisibility();
    }
}
