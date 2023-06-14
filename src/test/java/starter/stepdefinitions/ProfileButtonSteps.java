//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.ProfileButton;
//
//public class ProfileButtonSteps {
//
//    @Steps
//    ProfileButton profileButton;
//
//    //Scenario: Check functionality of profile button in the top right corner and bottom right corner
//    @Given("I am already login on the application")
//    public void alreadyLoginOnTheApplication() {
//        profileButton.loginPage();
//        profileButton.fillEmailField();
//        profileButton.fillPasswordField();
//        profileButton.loginButton();
//        profileButton.verifyPassword();
//        profileButton.homepage();
//    }
//    @When("I click on the profile button in the top right corner")
//    public void clickOnTheProfileButtonInTheTopRightCorner() {
//        profileButton.topRightCorner();
//    }
//    @And("I click back arrow to homepage")
//    public void clickBackArrowToHomepage() {
//        profileButton.backArrowHomepage();
//    }
//    @Then("I click on the profile button in the bottom right corner")
//    public void clickOnTheProfileButtonInTheButtomRightCorner() {
//        profileButton.bottomRightCorner();
//    }
//}
