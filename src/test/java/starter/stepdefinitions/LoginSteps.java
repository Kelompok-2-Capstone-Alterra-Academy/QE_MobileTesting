package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Login;

public class LoginSteps {

    @Steps
    Login login;

    //Login with valid data
    @Given("I am in the login page")
    public void inTheLoginPage() {
        login.loginPage();
    }
    @When("I fill email field to login")
    public void fillEmailFieldToLogin() {
        login.fillEmailField();
    }
    @And("I fill password field to login")
    public void fillPasswordFieldToLogin() {
        login.fillPasswordField();
    }
    @And("I click login button")
    public void clickLoginButton() {
        login.loginButton();
    }
    @And("I verify save to password")
    public void verifySaveToPassword() {
        login.verifyPassword();
    }
    @Then("Redirect in the homepage")
    public void redirectInTheHomepage() {
        login.homepage();
    }

    //Login with email or password field empty
    @Given("I am logged in")
    public void loggedIn() {
        login.loginPage();
    }

    @When("I filled email field with {string}")
    public void filledEmailField(String email) {
        if (email.equals("empty")) {
            login.fieldEmailEmpty();
        } else {
            login.fillEmailField();
        }
    }

    @And("I filled password field with {string}")
    public void filledPasswordField(String password) {
        if (password.equals("empty")) {
            login.fieldPasswordEmpty();
        } else {
            login.fillPasswordField();
        }
    }

    @Then("I click the login button")
    public void clickTheLoginButton() {
        login.loginButton();

        if (login.isEmailFieldEmpty()) {
            login.verifyEmailEmpty();
        } else if (login.isPasswordFieldEmpty()) {
            login.verifyPasswordEmpty();
        }
    }

    //Login with incorrect email or password
    @Given("I am on login page")
    public void onLoginPage() {
        login.loginPage();
    }
    @When("I fills email field with {string}")
    public void fillsEmailFieldWith(String email) {
        if (email.equals("incorrect")) {
            login.fillIncorrectEmailField();
        } else {
            login.fillEmailField();
        }
    }
    @And("I fills password field with {string}")
    public void fillsPasswordFieldWith(String password) {
        if (password.equals("incorrect")) {
            login.fillIncorrectPasswordField();
        } else {
            login.fillPasswordField();
        }
    }
    @Then("I click at the login button")
    public void clickAtTheLoginButton() {
        login.loginButton();

        if (login.isEmailIncorrect()) {
            login.failedLogin();
        } else if (login.isPasswordIncorrect()) {
            login.failedLogin();
        }
    }

    //Login without fill all fields
    @Given("I am at the login page")
    public void atTheLoginPage() {
        login.loginPage();
    }
    @When("I login without filling in the email field")
    public void loginWithoutFillingInTheEmailField() {
        login.fieldEmailEmpty();
    }
    @And("I login without filling in the password field")
    public void loginWithoutFillingInThePasswordField() {
        login.fieldPasswordEmpty();
    }
    @Then("I click in the login button")
    public void clickInTheLoginButton() {
        login.loginButton();
        login.verifyEmailEmpty();
        login.verifyPasswordEmpty();
    }

    //Login with unregistered email
    @Given("I am in login page")
    public void inLoginPage() {
        login.loginPage();
    }
    @When("I fill email field with unregistered email")
    public void fillEmailFieldWithUnregisteredEmail() {
        login.fillUnregisterEmailField();
    }
    @And("I fill password field with accordingly")
    public void fillPasswordFieldWithAccordingly() {
        login.fillPasswordField();
    }
    @Then("I click in login button")
    public void clickInLoginButton() {
        login.loginButton();
        login.invalidLogin();
    }
}