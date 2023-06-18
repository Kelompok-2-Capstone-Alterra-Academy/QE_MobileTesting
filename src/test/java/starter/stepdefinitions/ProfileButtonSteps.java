package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.ProfileButton;

public class ProfileButtonSteps {

    @Steps
    ProfileButton profileButton;

    //Scenario: Check functionality of profile button in the top right corner or bottom right corner
    @Given("I am already login on to the application")
    public void alreadyLoginOnTheApplication() {
        profileButton.loginPage();
        profileButton.fillEmailField();
        profileButton.fillPasswordField();
        profileButton.loginButton();
        profileButton.verifyPassword();
    }
    @When("I will be redirected to the homepage")
    public void willBeRedirectedToTheHomepage() {
        profileButton.homepage();
    }
    @Then("I click on the profile button in the {string} right corner")
    public void clickOnTheProfileButton(String position) {
        if (position.equals("top")) {
            profileButton.topRightCorner();
            profileButton.backArrowHomepage();
        } else if (position.equals("bottom")) {
            profileButton.bottomRightCorner();
        }
    }
}
