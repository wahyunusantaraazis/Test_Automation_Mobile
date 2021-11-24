package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {
    @When("scroll list")
    public void scrollList() {
        listPageMenu.swipelist();
    }
}
