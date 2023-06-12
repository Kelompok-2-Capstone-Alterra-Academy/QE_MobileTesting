package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.ProfileButton;

public class ProfileButtonSteps {

    @Steps
    ProfileButton profileButton;

    //Scenario: Check functionality of profile button in the top right corner
    @Given("I am currently on the login page")
    public void currentlyOnTheLoginPage() {
        profileButton.loginPage();
    }
    @When("I fill email in the designated field")
    public void fillEmailInTheDesignatedField() {
        profileButton.fillEmailField();
    }
    @And("I fill password in the designated field")
    public void fillPasswordInTheDesignatedField() {
        profileButton.fillPasswordField();
    }
    @And("I clicking on the login button")
    public void clickingOnTheLoginButton() {
        profileButton.loginButton();
    }
    @And("I confirm in the option to save password")
    public void confirmInTheOptionToSavePassword() {
        profileButton.verifyPassword();
    }
    @And("I will be redirected to the homepage")
    public void willBeRedirectedToTheHomepage() {
        profileButton.homepage();
    }
    @Then("I click on the profile button in the top right corner")
    public void clickOnTheProfileButtonInTheTopRightCorner() {
        profileButton.topRightCorner();
    }

    //Scenario: Check functionality of profile button in the bottom right corner
    @Given("I am currently in the login page")
    public void currentlyInTheLoginPage() {
        profileButton.loginPage();
    }
    @When("I filled email on the designated field")
    public void filledEmailOnTheDesignatedField() {
        profileButton.fillEmailField();
    }
    @And("I filled password on the designated field")
    public void filledPasswordOnTheDesignatedField() {
        profileButton.fillPasswordField();
    }
    @And("I clicking in the login button")
    public void clickingInTheLoginButton() {
        profileButton.loginButton();
    }
    @And("I confirm on the option to save password")
    public void confirmOnTheOptionToSavePassword() {
        profileButton.verifyPassword();
    }
    @And("I will be redirected in the homepage")
    public void willBeRedirectedInTheHomepage() {
        profileButton.homepage();
    }
    @Then("I click on the profile button in the bottom right corner")
    public void clickOnTheProfileButtonInTheButtomRightCorner() {
        profileButton.bottomRightCorner();
    }

}
