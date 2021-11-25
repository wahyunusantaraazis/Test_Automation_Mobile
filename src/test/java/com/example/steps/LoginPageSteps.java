package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps extends BaseTest {

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        //kosong
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click button login")
    public void userClickButtonLogin() {
        loginPage.clickLoginBtn();
    }

    @Then("user successfully login")
    public void userSuccessfullyLogin() {
        //getText
        String titleText = calculatorPage.getTitle();
        Assertions.assertEquals("Calculator", titleText);
        //isDisplayed
        boolean isDisplayed = calculatorPage.checkHamburgerBtnAppear();
        Assertions.assertTrue(isDisplayed);
    }

    @Given("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLoginBtn();
    }
}
