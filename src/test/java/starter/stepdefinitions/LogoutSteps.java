package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Logout;

public class LogoutSteps {

    @Steps
    Logout logout;

    //Scenario: TC01 - Logout with valid data
    @Given("I am on the login page")
    public void onTheLoginPage() {
        logout.loginPage();
    }
    @When("I filled in email on the login field to logout")
    public void filledInEmailOnTheLoginFieldToLogout() {
        logout.fillEmailField();
    }
    @And("I filled in password on the login field to logout")
    public void filledInPasswordOnTheLoginFieldToLogout() {
        logout.fillPasswordField();
    }
    @And("I click on the login button")
    public void clickOnTheLoginButton() {
        logout.loginButton();
    }
    @And("I verify save on the password")
    public void verifySaveOnThePassword() {
        logout.verifyPassword();
    }
    @And("Redirect on the homepage")
    public void redirectOnTheHomepage() {
        logout.homepage();
    }
    @And("I click account button")
    public void clickAccountButton() {
        logout.accountButton();
    }
    @Then("I click logout button")
    public void clickLogoutButton() {
        logout.logoutButton();
    }
}
