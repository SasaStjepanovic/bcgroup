package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage extends BasePage {

    public LoginLogoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='VIP Log in']")
    WebElement vipLoginButton;

    @FindBy(css = "#email")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#loginuser")
    WebElement ulogujSeButton;

    @FindBy(xpath = "//div[@id='userinner']/h2")
    WebElement successfulLoginLogOutMessage;

    @FindBy(xpath = "//form[@id='loginform']//div/p[@class='loginerror']")
    WebElement unSuccessfulLoginMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement logOutButton;

    public void pressVipLoginButton() {
        clickElement(vipLoginButton, "Vip login button is pressed");
    }

    public void enterEmail(String emailAddress) {
        typeText(email, emailAddress, " email is entered");
    }

    public void enterPassword(String pass) {
        typeText(password, pass, " password is entered");
    }

    public void pressUlogujSeButton() {
        clickElement(ulogujSeButton, "Uloguj se button is pressed");
    }

    public void pressLogOutButton() {
        clickElement(logOutButton, "Logout button is pressed");
    }

    public void login(String emailAddress, String pass) {
        enterEmail(emailAddress);
        enterPassword(pass);
        pressUlogujSeButton();
    }

    public void verifyLoginAction(String verificationType, String expectedMessage1) {
        if (verificationType.equalsIgnoreCase("validEmailPassword")) {
            compareText(successfulLoginLogOutMessage, expectedMessage1);
        } else if (verificationType.equalsIgnoreCase("emptyEmail")) {
            compareText(unSuccessfulLoginMessage, expectedMessage1);
        } else if (verificationType.equalsIgnoreCase("emptyPassword")) {
            compareText(unSuccessfulLoginMessage, expectedMessage1);
        } else if (verificationType.equalsIgnoreCase("emptyEmailPassword")) {
            compareText(unSuccessfulLoginMessage, expectedMessage1);
        } else if (verificationType.equalsIgnoreCase("InvalidEmailPassword")) {
            compareText(unSuccessfulLoginMessage, expectedMessage1);
        } else {
            System.out.println("Nothing of expected messages for login verification");
        }
    }

    public void verifyLogOutAction(String verificationType, String expectedMessage2) {
        if (verificationType.equalsIgnoreCase("validEmailPassword")) {
            compareText(successfulLoginLogOutMessage, expectedMessage2);
        } else {
            System.out.println("Nothing of expected messages for logout verification");
        }
    }
}
