package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.SendAssignment;

public class SendAssignmentSteps {

    @Steps
    SendAssignment sendAssignment;

    @Given("I am already logged at the application")
    public void alreadyLoggedAtTheApplication() {
        sendAssignment.masukButton();
        sendAssignment.loginPage();
        sendAssignment.fillEmailField();
        sendAssignment.fillPasswordField();
        sendAssignment.loginButton();
        sendAssignment.verifyPassword();
        sendAssignment.homepage();
    }
    @When("I clicked courses button on the bottom")
    public void clickedCoursesButtonOnTheBottom() {
        sendAssignment.coursesButton();
    }
    @And("I clicked either courses")
    public void clickedEitherCourses() {
        sendAssignment.clickCourse();
    }
    @And("I clicked assignment section in the courses")
    public void clickAssignmentSectionInTheCourses() {
        sendAssignment.clickAssignment();
    }
    @And("I clicked collect assignment button")
    public void clickCollectAssignmentButton() {
        sendAssignment.clickSubmitAssignmentButton();
    }
    @And("I clicked select files button")
    public void clickedSelectFileButton() {
        sendAssignment.selectFileAssignment();
    }
    @And("I clicked select access allow")
    public void clickedSelectAccessAllow() {
        sendAssignment.selectAccess();
    }
    @And("I select {string} assignment")
    public void selectFileAssignment(String option) {
        if (option.equals("file")) {
            sendAssignment.addFile();
        } else {

        }
    }
    @And("I fill {string} field")
    public void fillNoteField(String option) {
        if (option.equals("note")) {
            sendAssignment.fillNoteField();
        } else {

        }
    }
    @And("I clicked submit button")
    public void clickedSubmitButton() {
        sendAssignment.submitButton();
    }
    @Then("I clicked back to my course button")
    public void clickedBackToMyCourseButton() {
        sendAssignment.backToMyCourseButton();
    }
}
