package starter.stepdefinitions;//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Login;
//import starter.mobile.Logout;
//
//public class LogoutSteps {
//
//    @Steps
//    Login login;
//    Logout logout;
//
//    //Scenario: TC01 - Logout with valid data
//    @Given("I already on the home page")
//    public void alreadyOnTheHomepage() {
//        login.inTheLoginPage();
//        login.fillEmailFieldToLogin();
//        login.fillPasswordFieldToLogin();
//        login.clickLoginButton();
//        login.verifySaveToPassword();
//        login.redirectInTheHomepage();
//    }
//    @When("I click account button")
//    public void clickAccountButton() {
//        logout.clickAccountButton();
//    }
//    @Then("I click logout button")
//    public void clickLogoutButton() {
//        logout.clickLogoutButton();
//    }
//}
