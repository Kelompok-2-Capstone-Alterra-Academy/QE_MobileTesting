//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Authentication;
//
//public class AuthenticationSteps {
//
//    @Steps
//    Authentication authentication;

//    //Login with valid data
//    @Given("I am in the login page")
//    public void inTheLoginPage() {
//        authentication.loginPage();
//    }
//
//    @When("I fill email field to login")
//    public void fillEmailFieldToLogin() {
//        authentication.fillEmailField();
//    }
//
//    @And("I fill password field to login")
//    public void fillPasswordFieldToLogin() {
//        authentication.fillPasswordField();
//    }
//
//    @And("I click login button")
//    public void clickLoginButton() {
//        authentication.loginButton();
//    }
//
//    @And("I verify save to password")
//    public void verifySaveToPassword() {
//        authentication.verifyPassword();
//    }
//
//    @Then("Redirect in the homepage")
//    public void redirectInTheHomepage() {
//        authentication.homepage();
//    }

//    //Login with email or password field empty
//    @Given("I am logged in")
//    public void loggedIn() {
//        authentication.loginPage();
//    }
//
//    @When("I filled email field with {string}")
//    public void filledEmailField(String email) {
//        if (email.equals("empty")) {
//            authentication.fieldEmailEmpty();
//        } else {
//            authentication.fillEmailField();
//        }
//    }
//
//    @And("I filled password field with {string}")
//    public void filledPasswordField(String password) {
//        if (password.equals("empty")) {
//            authentication.fieldPasswordEmpty();
//        } else {
//            authentication.fillPasswordField();
//        }
//    }
//
//    @Then("I click the login button")
//    public void clickTheLoginButton() {
//        authentication.loginButton();
//    }
//
//    //Login with incorrect email or password
//    @Given("I am on login page")
//    public void onLoginPage() {
//        authentication.loginPage();
//    }
//
//    @When("I fills email field with {string}")
//    public void fillsEmailFieldWith(String email) {
//        if (email.equals("incorrect")) {
//            authentication.fillIncorrectEmailField();
//        } else {
//            authentication.fillEmailField();
//        }
//    }
//
//    @And("I fills password field with {string}")
//    public void fillsPasswordFieldWith(String password) {
//        if (password.equals("incorrect")) {
//            authentication.fillIncorrectPasswordField();
//        } else {
//            authentication.fillPasswordField();
//        }
//    }
//
//    @Then("I click at the login button")
//    public void clickAtTheLoginButton() {
//        authentication.loginButton();
//    }

//    //Login without fill all fields
//    @Given("I am at the login page")
//    public void atTheLoginPage() {
//        authentication.loginPage();
//    }
//
//    @When("I login without filling in the email field")
//    public void loginWithoutFillingInTheEmailField() {
//        authentication.fieldEmailEmpty();
//    }
//
//    @And("I login without filling in the password field")
//    public void loginWithoutFillingInThePasswordField() {
//        authentication.fieldPasswordEmpty();
//    }
//
//    @Then("I click in the login button")
//    public void clickInTheLoginButton() {
//        authentication.loginButton();
//        authentication.verifyEmailEmpty();
//        authentication.verifyPasswordEmpty();
//    }
//
//    //Login with unregistered email
//    @Given("I am in login page")
//    public void inLoginPage() {
//        authentication.loginPage();
//    }
//
//    @When("I fill email field with unregistered email")
//    public void fillEmailFieldWithUnregisteredEmail() {
//        authentication.fillUnregisterEmailField();
//    }
//
//    @And("I fill password field with accordingly")
//    public void fillPasswordFieldWithAccordingly() {
//        authentication.fillPasswordField();
//    }
//
//    @Then("I click in login button")
//    public void clickInLoginButton() {
//        authentication.loginButton();
//        authentication.invalidLogin();
//    }
//
//    //Scenario: TC01 - Logout with valid data
//    @Given("I am already login in the application")
//    public void alreadyLoginInTheApplication() {
//        authentication.loginPage();
//        authentication.fillEmailField();
//        authentication.fillPasswordField();
//        authentication.loginButton();
//        authentication.verifyPassword();
//        authentication.homepage();
//    }
//
//    @When("I click account button")
//    public void clickAccountButton() {
//        authentication.accountButton();
//    }
//
//    @Then("I click logout button")
//    public void clickLogoutButton() {
//        authentication.logoutButton();
//    }
//}