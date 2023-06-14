//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.LiveSession;
//
//public class LiveSessionSteps {
//
//    @Steps
//    LiveSession liveSession;
//
//    //Scenario: User can join live session in the courses
//    @Given("I am already login in the application")
//    public void alreadyLoginInTheApplication() {
//        liveSession.loginPage();
//        liveSession.fillEmailField();
//        liveSession.fillPasswordField();
//        liveSession.loginButton();
//        liveSession.verifyPassword();
//        liveSession.homepage();
//    }
//    @When("I clicked on the courses button in the bottom")
//    public void clickedOnTheCoursesButtonInTheBottom() {
//        liveSession.coursesButton();
//    }
//    @And("I clicked either of courses")
//    public void clickedEitherOfCourses() {
//        liveSession.clickCourse();
//    }
//    @And("I clicked live session button")
//    public void clickedLiveSessionButton() {
//        liveSession.liveSessionButton();
//    }
//    @And("I clicked class meeting schedule")
//    public void clickedClassMeetingSchedule() {
//        liveSession.classMeetingSchedule();
//    }
//    @Then("I click join meeting button")
//    public void clickJoinMeetingButton() {
//        liveSession.joinMettingButton();
//    }
//}
