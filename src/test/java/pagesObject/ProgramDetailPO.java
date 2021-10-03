package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;


public class ProgramDetailPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public ProgramDetailPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    /**
     * Check redirection program detail link
     * @return url is equal
     * @throws InterruptedException
     */
    public String getProgramDetailURL() throws InterruptedException {
        selenium.hardWait(2);
        return selenium.getURL();
    }
}
