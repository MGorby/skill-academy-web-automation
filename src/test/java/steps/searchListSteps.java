package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.SearchListPO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.util.List;

public class searchListSteps extends TestBase{

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private SearchListPO search = new SearchListPO(driver);

    @And("user set price filter")
    public void userSetPriceFilter() throws InterruptedException {
        search.choosePriceRange();
    }

    @Then("should display the result list of keyword {string}")
    public void shoudlDisplayTheResultListOfKeyword(String keyword) {
        List<String> resultList = search.listResultNameKeyword();
        for (String a : resultList) {
            if (a.contains(keyword)){
                Assert.assertTrue(a.contains(keyword), "There is no " + keyword + " on search result");
            }
        }
    }

    @And("user choose the result")
    public void userChooseTheResult() throws InterruptedException {
        search.chooseTheResult();
    }
}
