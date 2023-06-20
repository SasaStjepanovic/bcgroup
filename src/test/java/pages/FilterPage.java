package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage extends BasePage {

    public FilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='product']//h2")
    WebElement filteredProductTitle;

    @FindBy(xpath = "//select[@id='price']")
    WebElement choosePrice;

    @FindBy(xpath = "//div[@id='filtersinfo']")
    WebElement negativeFilteredMessage;

    public void applyFilterProduct(String filterTitle3, String filterTitle4, String filterValue4, String filterTitle5, String filterValue5,
                                   String filterTitle6, String filterValue6, String filterTitle7, String filterValue7, String filterTitle8, String filterValue8,
                                   String filterTitle9, String filterValue9, String filterValue10) throws InterruptedException {

        int wait = 800;

        boolean filterChoice3 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle3 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue4 + "']")).size() > 0;
        if (filterChoice3) {
            WebElement subFilter1 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle3 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue4 + "']"));
            explicitWait(subFilter1);
            checkCheckbox(subFilter1, "Checkbox element1 : " + subFilter1 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General third filter choice is not entered");
        }

        boolean filterChoice4 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle4 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue5 + "']")).size() > 0;
        if (filterChoice4) {
            WebElement subFilter2 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle4 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue5 + "']"));
            explicitWait(subFilter2);
            checkCheckbox(subFilter2, "Checkbox element2 : " + subFilter2 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General fourth filter choice is not entered");
        }

        boolean filterChoice5 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle5 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue6 + "']")).size() > 0;
        if (filterChoice5) {
            WebElement subFilter3 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle5 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue6 + "']"));
            explicitWait(subFilter3);
            checkCheckbox(subFilter3, "Checkbox element1 : " + subFilter3 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General fifth filter choice is not entered");
        }

        boolean filterChoice6 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle6 + "')]/..//div[@class='filtervalues']//label[contains(text(),'" + filterValue7 + "')]")).size() > 0;
        if (filterChoice6) {
            WebElement subFilter4 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle6 + "')]/..//div[@class='filtervalues']//label[contains(text(),'" + filterValue7 + "')]"));
            explicitWait(subFilter4);
            checkCheckbox(subFilter4, "Checkbox element2 : " + subFilter4 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General sixth filter choice is not entered");
        }

        boolean filterChoice7 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle7 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue8 + "']")).size() > 0;
        if (filterChoice7) {
            WebElement subFilter5 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle7 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue8 + "']"));
            explicitWait(subFilter5);
            checkCheckbox(subFilter5, "Checkbox element2 : " + subFilter5 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General seventh filter choice is not entered");
        }

        boolean filterChoice8 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle8 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue9 + "']")).size() > 0;
        if (filterChoice8) {
            WebElement subFilter6 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle8 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue9 + "']"));
            explicitWait(subFilter6);
            checkCheckbox(subFilter6, "Checkbox element1 : " + subFilter6 + " is selected");
            Thread.sleep(wait);
        } else {
            System.out.println("General eighth filter choice is not entered");
        }

        boolean filterChoice9 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle9 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue10 + "']")).size() > 0;
        if (filterChoice9) {
            WebElement subFilter7 = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle9 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue10 + "']"));
            explicitWait(subFilter7);
            checkCheckbox(subFilter7, "Checkbox element2 : " + subFilter7 + " is selected");
        } else {
            System.out.println("General ninth filter choice is not entered");
        }
    }

    public void verifyFilteredProductTitle(String filteredTitle) {
        compareText(filteredProductTitle, filteredTitle);
    }

    public void verifyNegativeFilteredMessage(String filteredNegativeMessage1) {
        comparePartOfText(negativeFilteredMessage, filteredNegativeMessage1);
    }

    public void clickOdaberite() {
        clickElementJS(choosePrice, "Odaberite ceni filed is pressed");
    }

    public void applyGeneralFilter(String filterTitle1, String filterValue1, String filterTitle2, String filterValue2, String filterValue3) {

        boolean filterChoice1 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle1 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue1 + "']")).size() > 0;
        if (filterChoice1) {
            WebElement promoPonuda = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle1 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue1 + "']"));
            checkCheckbox(promoPonuda, "Checkbox element1 : " + promoPonuda + " is selected");
        } else {
            System.out.println("General first filter choice is not entered");
        }

        boolean filterChoice2 = driver.findElements(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle2 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue2 + "']")).size() > 0;
        if (filterChoice2) {
            WebElement proizvodjac = driver.findElement(By.xpath("//form[@id='filtersform']//div[contains(text(),'" + filterTitle2 + "')]/..//div[@class='filtervalues']//label[text()='" + filterValue2 + "']"));
            checkCheckbox(proizvodjac, "Checkbox element2 : " + proizvodjac + " is selected");
        } else {
            System.out.println("General second filter choice is not entered");
        }

        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(choosePrice));
        clickOdaberite();
        dropDownList(choosePrice, filterValue3);
    }

}
