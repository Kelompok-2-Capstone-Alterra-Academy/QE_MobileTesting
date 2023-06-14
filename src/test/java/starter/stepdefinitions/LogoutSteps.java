//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Logout;
//
//public class LogoutSteps {
//
//    @Steps
//    Logout logout;
//
//    //Scenario: TC01 - Logout with valid data
//    @Given("I am already login in the application")
//    public void alreadyLoginInTheApplication() {
//        logout.loginPage();
//        logout.fillEmailField();
//        logout.fillPasswordField();
//        logout.loginButton();
//        logout.verifyPassword();
//        logout.homepage();
//    }
//    @When("I click account button")
//    public void clickAccountButton() {
//        logout.accountButton();
//    }
//    @Then("I click logout button")
//    public void clickLogoutButton() {
//        logout.logoutButton();
//    }
//}
