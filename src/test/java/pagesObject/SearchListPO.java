package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

import java.util.ArrayList;
import java.util.List;

public class SearchListPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public SearchListPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//div[contains(text(),'Harga')]")
    private WebElement priceDropDown;

    @FindBy(xpath = "//div[contains(text(),'150.000 - 200.000')]")
    private WebElement priceSet;

    @FindBy(xpath = "//div[contains(text(),'Durasi')]")
    private WebElement durationDropDown;

    @FindBy(xpath = "//div[contains(text(),'<1 jam>')]")
    private WebElement durationSet;

    @FindBy(css = "#main-scrollview > div > div:nth-child(2) > div > div:nth-child(1) > a > div > div > div.css-1130oij")
    private WebElement result;

    /**
     * Select price range
     * @throws InterruptedException
     */
    public void choosePriceRange() throws InterruptedException {
        selenium.waitTillElementIsVisible(priceDropDown);
        selenium.clickOn(priceDropDown);
        selenium.clickOn(priceSet);
    }

    /** List all listing result in name section
     * @return list of result (String)
     */
    public List<String> listResultNameKeyword() {
        String cssLocator = "#main-scrollview .css-1oohd5r";
        List<WebElement> elements = selenium.waitTillAllElementsAreLocated(By.cssSelector(cssLocator));
        List<String> addressList = new ArrayList<>();
        for (WebElement a : elements) {
            addressList.add((selenium.getText(a)));
        }
        return addressList;
    }

    /**
     * Select search result
     * @throws InterruptedException
     */
    public void chooseTheResult() throws InterruptedException {
        selenium.waitTillElementIsVisible(result);
        selenium.clickOn(result);
    }
}
