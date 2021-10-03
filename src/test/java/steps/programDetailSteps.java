package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.ProgramDetailPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class programDetailSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private ProgramDetailPO programDetail = new ProgramDetailPO(driver);

    @Then("user redirect to {string} page")
    public void userRedirectToPage(String url) throws InterruptedException {
        Assert.assertTrue(programDetail.getProgramDetailURL().contains(url), "Program Detail URL doesn't equals");
    }
}
