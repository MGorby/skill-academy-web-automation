package steps;

import io.cucumber.java.en.*;
import pagesObject.HomepagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.text.ParseException;

public class homepageSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private HomepagePO homepage = new HomepagePO(driver);

    @Given("user open URL {string}")
    public void userOpenURL(String url) {
        selenium.navigateToPage(url);
    }

    @When("user clicks on Search button")
    public void userClicksOnSearchButton() throws InterruptedException {
        homepage.clickSearchBar();
    }

    @And("user search for {string}")
    public void userSearchFor(String word) throws InterruptedException {
        homepage.enterChar(word);
    }
}
