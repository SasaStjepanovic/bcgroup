package steps;

import excel.ExcelSupport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import pages.GeneralPage;
import pages.LoginLogoutPage;
import pages.UserEditPage;
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
        new LoginLogoutPage(driver).verifyLoginAction(data.get("verificationType"),data.get("expectedMessage1"));
    }

    @And("user clicks logout button")
    public void userClicksLogoutButton() {
        new LoginLogoutPage(driver).pressLogOutButton();
    }

    @Then("user should be verified logout action")
    public void userShouldBeVerifiedLogoutAction() {
        new LoginLogoutPage(driver).verifyLogOutAction(data.get("verificationType"),data.get("expectedMessage2"));
    }

    @And("users  clicks user edit button")
    public void usersClicksUserEditButton() {
        new UserEditPage(driver).pressUserEditButton();
    }

    @When("users enters name")
    public void usersEntersName() {
        new UserEditPage(driver).enterName(data.get("randomDataYesNo"),data.get("name"), randomNameVerif);
    }

    @When("users enters last name")
    public void usersEntersLastName() {
        new UserEditPage(driver).enterLastName(data.get("randomDataYesNo"),data.get("lastname"), randomLastNameVerif);
    }

    @When("users enters address")
    public void usersEntersAddress() {
        new UserEditPage(driver).enterAddress(data.get("randomDataYesNo"),data.get("address"), randomAddressVerif);
    }

    @When("users enters zip code")
    public void usersEntersZipCode() {
        new UserEditPage(driver).enterZip(data.get("randomDataYesNo"),data.get("zip"), randomZipVerif);
    }

    @When("users enters city")
    public void usersEntersCity() {
        new UserEditPage(driver).enterCity(data.get("randomDataYesNo"),data.get("city"), randomCityVerif);
    }

    @When("users enters phone number")
    public void usersEntersPhoneNumber() {
        new UserEditPage(driver).enterPhoneNumber(data.get("randomDataYesNo"),data.get("phone"), randomPhoneVerif);
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
        new UserEditPage(driver).verifyUnsuccessfulMessageAfterUserChanges(data.get("expectedMessage1"),data.get("elementID"));
    }

    @Then("user should be verify lasting time of successful message")
    public void userShouldBeVerifyLastingTimeOfSuccessfulMessage() {
        new UserEditPage(driver).checkLastingMessageTime();
    }

    @And("user closes popup window")
    public void userClosesPopupWindow() {
        new GeneralPage(driver).closePopupWindow();
    }
}
