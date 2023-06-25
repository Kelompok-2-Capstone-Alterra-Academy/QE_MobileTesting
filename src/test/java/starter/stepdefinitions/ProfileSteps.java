package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Profile;

public class ProfileSteps {

    @Steps
    Profile profile;

    @Given("I am already login on to the application")
    public void alreadyLoginOnTheApplication() {
        profile.masukButton();
        profile.loginPage();
        profile.fillEmailField();
        profile.fillPasswordField();
        profile.loginButton();
        profile.verifyPassword();
    }
    @When("I will be redirected to the homepage")
    public void willBeRedirectedToTheHomepage() {
        profile.homepage();
    }
    @And("I click on the profile button in the {string} right corner")
    public void clickOnTheProfileButton(String position) {
        if (position.equals("top")) {
            profile.topRightCorner();
            profile.backArrowHomepage();
        } else if (position.equals("bottom")) {
            profile.bottomRightCorner();
        }
    }
    @And("I clicked the profile button in the top right corner")
    public void clickedTheProfileButtonInTheTopRightCorner() {
        profile.topRightCorner();
    }
    @And("I click edit profile button")
    public void clickEditProfileButton() {
        profile.editProfileButton();
    }
    @And("I change a {string} field")
    public void changeFullNameField(String option) {
        if (option.equals("full name")) {
            profile.changeFullNameField();
        } else if (option.equals("empty")) {
            profile.changeFullNameWithEmpty();
        }
    }
    @And("I fill on {string} field")
    public void fillBirthOfDate(String option) {
        if (option.equals("birth of date")) {
            profile.fillBirthOfDate();
        } else {

        }
    }
    @And("I fill a {string} field")
    public void fillHometownField(String option) {
        if (option.equals("hometown")) {
            profile.fillHometownField();
        } else if (option.equals("hometown field with length < 6")) {
            profile.fillHometownWithLengthLessThat5();
        }
    }
    @And("I change {string} field")
    public void changeTelephoneNumberField(String option) {
        if (option.equals("telephone number")) {
            profile.changeTelephoneNumberField();
        } else if (option.equals("telephone number with length < 10")) {
            profile.changeTelephoneNumberWithLengthLessThat10();
        } else if (option.equals("empty")) {
            profile.changeTelephoneNumberWithEmpty();
        }
    }
    @And("I select {string} field")
    public void selectGenderField(String option) {
        if (option.equals("gender")) {
            profile.selectGander();
        } else {

        }
    }
    @And("I fill the {string} field")
    public void fillSchollNameField(String option) {
        if (option.equals("school name")) {
            profile.fillSchoolNameField();
        } else {

        }
    }
    @And("I fill in {string} field")
    public void fillClassLevelField(String option) {
        if (option.equals("class level")) {
            profile.fillClassLevelField();
        } else if (option.equals("class level with text")) {
            profile.fillClassLevelWithText();
        }
    }
    @And("I fill one {string} field")
    public void fillMajorField(String option) {
        if (option.equals("major")) {
            profile.fillMajorField();
        } else {

        }
    }
    @And("I change profile")
    public void changeProfile() {
        profile.changeProfile();
        profile.selectPhoto();
    }
    @And("I clicked the accout button")
    public void clickedTheAccountButton() {
        profile.bottomRightCorner();
    }
    @Then("I click save change button")
    public void clickSaveChangeButton() {
        profile.saveChangeButton();
    }
}
