package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.LiveSession;

public class LiveSessionSteps {

    @Steps
    LiveSession liveSession;

    @Given("I am already login in the application")
    public void alreadyLoginInTheApplication() {
        liveSession.masukButton();
        liveSession.loginPage();
        liveSession.fillEmailField();
        liveSession.fillPasswordField();
        liveSession.loginButton();
        liveSession.verifyPassword();
        liveSession.homepage();
    }
    @When("I clicked on the courses button in the bottom")
    public void clickedOnTheCoursesButtonInTheBottom() {
        liveSession.coursesButton();
    }
    @And("I clicked either of courses")
    public void clickedEitherOfCourses() {
        liveSession.clickCourse();
    }
    @And("I clicked live session button")
    public void clickedLiveSessionButton() {
        liveSession.liveSessionButton();
    }
    @And("I clicked {string} button")
    public void clickedJoinedNoYetButton(String option) {
        if (option.equals("joined not yet")) {
            liveSession.joinedNotYetButton();
        } else if (option.equals("joined already")) {
            liveSession.joinedAlreadyButton();
        }
    }
    @And("I clicked {string} schedule")
    public void clickedClassMeetingSchedule(String option) {
        if (option.equals("joined not yet class meeting")) {
            liveSession.classMeetingSchedule();
        } else if (option.equals("joined already class meeting")) {
            liveSession.classMeetingSchedule2();
        }
    }
    @And("Unable to join live session in course")
    public void unableToJoinLiveSessionInCourse() {
        liveSession.liveSessionPage();
    }
    @Then("I click join meeting button")
    public void clickJoinMeetingButton() {
        liveSession.joinMettingButton();
    }
}
