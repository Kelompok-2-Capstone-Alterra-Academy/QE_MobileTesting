//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.LearningVideo;
//
//public class LearningVideoSteps {
//
//    @Steps
//    LearningVideo learningVideo;
//
//    //Scenario: User can view the learning video
//    @Given("I am already login in to application")
//    public void alreadyLoginInToApplication() {
//        learningVideo.loginPage();
//        learningVideo.fillEmailField();
//        learningVideo.fillPasswordField();
//        learningVideo.loginButton();
//        learningVideo.verifyPassword();
//        learningVideo.homepage();
//    }
//    @When("I click courses button in the bottom")
//    public void clickCoursesButtonInTheBottom() {
//        learningVideo.coursesButton();
//    }
//    @And("I click either of the courses")
//    public void clickEitherOfTheCourses() {
//        learningVideo.clickCourse();
//    }
//    @And("I click section video in the courses")
//    public void clickSectionVideoInTheCourses() {
//        learningVideo.clickVideo();
//    }
//    @Then("I click finish button after watching the video")
//    public void clickFinishButtonAfterWatchingTheVideo() {
//        learningVideo.finishButton();
//    }
//}
