package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;
public class HomepagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public HomepagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#root .css-1o8uzu8 input")
    private WebElement searchBar;

    @FindBy(css = "#root .css-13ksas7 img")
    private WebElement searchButton;

    /**
     * Click on 'Search' bar
     * @throws InterruptedException
     */
    public void clickSearchBar() throws InterruptedException {
        selenium.waitTillElementIsVisible(searchBar);
        selenium.clickOn(searchBar);
    }

    /**
     * Enter Text in search bar
     * @param word is text we want to search
     */
    public void enterChar(String word) throws InterruptedException {
        selenium.enterText(searchBar, word, false);
        selenium.clickOn(searchButton);
    }
}
