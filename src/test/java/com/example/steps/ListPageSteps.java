package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {
    @When("scroll list")
    public void scrollList() {
        listPageMenu.swipelist();
    }

    @When("Long press certain list")
    public void longPressCertainList() {
        listPageMenu.longpress();
    }

    @Then("Tap multiple times certain list")
    public void tapMultipleTimesCertainList() {
        listPageMenu.TapMultipleTimes();
    }
}
