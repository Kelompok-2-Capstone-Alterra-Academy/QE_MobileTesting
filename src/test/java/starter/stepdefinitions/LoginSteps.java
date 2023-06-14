//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Login;
//
//public class LoginSteps {
//
//    @Steps
//    Login login;

//    //Login with valid data
//    @Given("I am in the login page")
//    public void inTheLoginPag() {
//        login.loginPage();
//    }
//    @When("I fill email field to login")
//    public void fillEmailFieldToLogin() {
//        login.fillEmailField();
//    }
//    @And("I fill password field to login")
//    public void fillPasswordFieldToLogin() {
//        login.fillPasswordField();
//    }
//    @And("I click login button")
//    public void clickLoginButton() {
//        login.loginButton();
//    }
//    @And("I verify save to password")
//    public void verifySaveToPassword() {
//        login.verifyPassword();
//    }
//    @Then("Redirect in the homepage")
//    public void redirectInTheHomepage() {
//        login.homepage();
//    }

//    //Login without fill all fields
//    @Given("I am at the login page")
//    public void atTheLoginPage() {
//        login.loginPage();
//    }
//    @When("I login without filling in the email field")
//    public void loginWithoutFillingInTheEmailField() {
//        login.fieldEmailEmpty();
//    }
//    @And("I login without filling in the password field")
//    public void loginWithoutFillingInThePasswordField() {
//        login.fieldPasswordEmpty();
//    }
//    @Then("I click in the login button")
//    public void clickInTheLoginButton() {
//        login.loginButton();
//        login.verifyEmailEmpty();
//        login.verifyPasswordEmpty();
//    }

//    //Login with email field empty
//    @Given("I am logged in")
//    public void loggedIn() {
//        login.loginPage();
//    }
//    @When("I fill email field with empty")
//    public void fillEmailFieldWithEmpty() {
//        login.fieldEmailEmpty();
//    }
//    @And("I fill password field with valid data")
//    public void fillPasswordFieldWithValidData() {
//        login.fillPasswordField();
//    }
//    @Then("I click the login button")
//    public void clickTheLoginButton() {
//        login.loginButton();
//        login.verifyEmailEmpty();
//    }

//    //Login with unregistered email
//    @Given("I am in login page")
//    public void inLoginPage() {
//        login.loginPage();
//    }
//    @When("I fill email field with unregistered email")
//    public void fillEmailFieldWithUnregisteredEmail() {
//        login.fillUnregisterEmailField();
//    }
//    @And("I fill password field with accordingly")
//    public void fillPasswordFieldWithAccordingly() {
//        login.fillPasswordField();
//    }
//    @Then("I click in login button")
//    public void clickInLoginButton() {
//        login.loginButton();
//        login.failedLogin();
//    }

//    //Login with incorrect email
//    @Given("I am on login page")
//    public void onLoginPage() {
//        login.loginPage();
//    }
//    @When("I fill email field with incorrect email")
//    public void fillEmailFieldWithIncorrectEmail() {
//        login.fillIncorrectEmailField();
//    }
//    @And("I fill password field with correct password")
//    public void fillPasswordFieldWithCorrectPassword() {
//        login.fillPasswordField();
//    }
//    @Then("I click at the login button")
//    public void clickAtTheLoginButton() {
//        login.loginButton();
//        login.invalidEmail();
//    }

//    //Login with incorrect password
//    @Given("I am at login page")
//    public void atLoginPage() {
//        login.loginPage();
//    }
//    @When("I fill email field with correct email")
//    public void fillEmailFieldWithCorrectEmail() {
//        login.fillEmailField();
//    }
//    @And("I fill password field with incorrect password")
//    public void fillPasswordFieldWithIncorrectPassword() {
//        login.fillIncorrectPasswordField();
//    }
//    @Then("I click button login")
//    public void clickButtonLogin() {
//        login.loginButton();
//        login.failedLogin();
//    }

//    //Login with password field empty
//    @Given("I am at logged in page")
//    public void atLoggedInPage() {
//        login.loginPage();
//    }
//    @When("I fill email field with valid data")
//    public void fillEmailFieldWithValidData() {
//        login.fillEmailField();
//    }
//    @And("I fill password field with empty")
//    public void fillPasswordFieldWithEmpty() {
//        login.fieldPasswordEmpty();
//    }
//    @Then("I click in button login")
//    public void clickInButtonLogin() {
//        login.loginButton();
//        login.verifyPasswordEmpty();
//    }
//}