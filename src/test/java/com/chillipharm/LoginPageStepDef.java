package com.chillipharm;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDef {
    @Given("^I am on ChilliPharm home page$")
    public void iAmOnChilliPharmHomePage() {

    }

    @And("^I navigate to Login page$")
    public void iNavigateToLoginPage() {
    }

    @When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailAndPassword(String arg0, String arg1) throws Throwable {

    }

    @Then("^I should see the error message for \"([^\"]*)\" and password \"([^\"]*)\" on Login screen$")
    public void iShouldSeeTheErrorMessageForAndPasswordOnLoginScreen(String arg0, String arg1) throws Throwable {

    }

    @Then("^I should see the invalid credentials error message$")
    public void iShouldSeeTheInvalidCredentialsErrorMessage() {
    }

    @When("^I enter invalid credentials three time consecutive with same email$")
    public void iEnterInvalidCredentialsThreeTimeConsecutiveWithSameEmail() {
    }

    @Then("^I should see the account lockout warning after third consecutive failed attempt$")
    public void iShouldSeeTheAccountLockoutWarningAfterThirdConsecutiveFailedAttempt() {
    }

    @When("^I enter invalid credentials five time consecutive with same email$")
    public void iEnterInvalidCredentialsFiveTimeConsecutiveWithSameEmail() {
    }

    @Then("^I should see the account lockout warning after fifth consecutive failed attempt$")
    public void iShouldSeeTheAccountLockoutWarningAfterFifthConsecutiveFailedAttempt() {
    }
}
