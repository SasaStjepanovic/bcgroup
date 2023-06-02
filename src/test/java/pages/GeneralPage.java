package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralPage extends BasePage {

    public GeneralPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='popup']//div")
    WebElement popupAd;

    @FindBy(css = "#puclose")
    WebElement closePopupButton;

    public void closePopupWindow(){
        explicitWaitMainPopup(popupAd);
        clickElement(closePopupButton, "Close popup button is pressed");
    }
}
