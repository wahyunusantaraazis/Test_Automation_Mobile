package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class OperationSteps extends BaseTest {

    @Given("User succesfully login")
    public void userSuccesfullyLogin() {

    }

    @And("I am input username {string}")
    public void iAmInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("I am input password {string}")
    public void iAmInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("I am click button login")
    public void iAmClickButtonLogin() {
        loginPage.clickLoginBtn();
    }

    @When("I am input angka pertama dengan {string}")
    public void iAmInputAngkaPertamaDengan(String angka1) {
        operationPage.inputangka1(angka1);
    }

    @And("I choose plus in dropdown menu operators")
    public void iChoosePlusInDropdownMenuOperators() {
        operationPage.clickDropDownOperator();
        operationPage.choosePlus();
    }

    @And("I am input angka kedua dengan {string}")
    public void iAmInputAngkaKeduaDengan(String angka2) {
        operationPage.inputangka2(angka2);
    }

    @And("I am click button equals")
    public void iAmClickButtonEquals() {
        operationPage.clickEqualsBtn();
    }

    @Then("I am succesfully calculate the numbers")
    public void iAmSuccesfullyCalculateTheNumbers() {
    }

    @When("user input angka pertama dengan {string}")
    public void userInputAngkaPertamaDengan(String angka1) {
        operationPage.inputangka1(angka1);
    }

    @And("user choose plus in dropdown menu operators")
    public void userChoosePlusInDropdownMenuOperators() {
        operationPage.clickDropDownOperator();
        operationPage.choosePlus();
    }

    @And("user input angka kedua dengan {string}")
    public void userInputAngkaKeduaDengan(String angka2) {
        operationPage.inputangka2(angka2);
    }

    @And("user click button equals")
    public void userClickButtonEquals() {
        operationPage.clickEqualsBtn();
    }

    @Then("user succesfully calculate plus the numbers")
    public void userSuccesfullyCalculatePlusTheNumbers() {

        String hasil = operationPage.getHasil();
        Assertions.assertEquals("15",hasil);
    }

    @And("user choose minus in dropdown menu operators")
    public void userChooseMinusInDropdownMenuOperators() {
        operationPage.clickDropDownOperator();
        operationPage.chooseMinus();
    }

    @And("user choose times in dropdown menu operators")
    public void userChooseTimesInDropdownMenuOperators() {
        operationPage.clickDropDownOperator();
        operationPage.chooseTimes();
    }

    @And("user choose divided in dropdown menu operators")
    public void userChooseDividedInDropdownMenuOperators() {
        operationPage.clickDropDownOperator();
        operationPage.chooseDivided();
    }


}
