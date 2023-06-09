package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Login;
import starter.mobile.Logout;

public class LoginSteps {

    @Steps
    Login login;
//    Logout logout;

    //TC01 - Login with valid data
    @Given("I am in the login page")
    public void inTheLoginPage() {
        login.inTheLoginPage();
    }
    @When("I fill email field to login")
    public void fillEmailFieldToLogin() {
        login.fillEmailFieldToLogin();
    }
    @And("I fill password field to login")
    public void fillPasswordFieldToLogin() {
        login.fillPasswordFieldToLogin();
    }
    @And("I click login button")
    public void clickLoginButton() {
        login.clickLoginButton();
    }
    @And("I verify save to password")
    public void verifySaveToPassword() {
        login.verifySaveToPassword();
    }
    @Then("Redirect in the homepage")
    public void redirectInTheHomepage() {
        login.redirectInTheHomepage();
//        logout.onTheHomepage();
//        logout.clickAccountButton();
//        logout.clickLogoutButton();
    }

}
