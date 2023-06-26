package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Mentor;

public class MentorSteps {

    @Steps
    Mentor mentor;

    @Given("I already login into application")
    public void alreadyLoginIntoApplication() {
        mentor.masukButton();
        mentor.loginPage();
        mentor.fillEmailField();
        mentor.fillPasswordField();
        mentor.loginButton();
        mentor.verifyPassword();
        mentor.homepage();
    }
    @When("I click see all the best mentor in the StarEdu")
    public void clickSeeAllTheBestMentorInTheStatEdu() {
        mentor.seeAllBestMentor();
    }
    @And("I view list mentor in the StarEdu")
    public void viewListMentorInTheStarEdu() {
        mentor.listMentor();
    }
    @And("I click {string} in the bottom")
    public void clickInToBottom(String optional) {
        if (optional.equals("chat button")) {
            mentor.chatButton();
        } else if (optional.equals("courses button through courses")) {
            mentor.coursesButton();
        } else if (optional.equals("courses button through video")) {
            mentor.coursesButton();
        } else if (optional.equals("courses button through material")) {
            mentor.coursesButton();
        }
    }
    @And("I click on {string} to look up the mentor name")
    public void clickOnToLookUpTheMentorName(String option) {
        if (option.equals("search mentor")) {
            mentor.searchMentor();
        } else if (option.equals("search mentor either courses")) {
            mentor.searchMentor2();
        } else if (option.equals("search mentor video courses")) {
            mentor.searchMentor3();
        } else if (option.equals("search mentor material courses")) {
            mentor.searchMentor4();
        }
    }
    @And("I click either at the courses")
    public void clickEitherAtTheCourses() {
        mentor.clickCourse();
    }
    @And("I click {string} button")
    public void clickButton(String option) {
        if (option.equals("ask mentor either courses")) {
            mentor.askMentorButtonCourse();
        } else if (option.equals("ask mentor video course")) {
            mentor.askMentorButtonVideo();
        } else if (option.equals("ask mentor material courses")) {
            mentor.askMentorButtonMaterial();
        }
    }
    @And("I click into {string} courses")
    public void clickInToCourses(String option) {
        if (option.equals("video section")) {
            mentor.clickVideo();
        } else if (option.equals("material section")) {
            mentor.clickMaterial();
        }
    }
    @Then("I click icon whatsapp to contact mentor")
    public void clickIconWhatsappToContactMentor() {
        mentor.contactMentor();
    }
}
