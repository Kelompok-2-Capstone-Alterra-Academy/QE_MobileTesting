//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Learning;
//
//public class LearningSteps {
//
//    @Steps
//    Learning learning;
//
//    //Scenario: User can view the learning video
//    @Given("I am already login in to application")
//    public void alreadyLoginInToApplication() {
//        learning.loginPage();
//        learning.fillEmailField();
//        learning.fillPasswordField();
//        learning.loginButton();
//        learning.verifyPassword();
//        learning.homepage();
//    }
//    @When("I click courses button in the bottom")
//    public void clickCoursesButtonInTheBottom() {
//        learning.coursesButton();
//    }
//    @And("I click either of the courses")
//    public void clickEitherOfTheCourses() {
//        learning.clickCourse();
//    }
//    @And("I click section video in the courses")
//    public void clickSectionVideoInTheCourses() {
//        learning.clickVideo();
//    }
//    @Then("I click finish button after watching the video")
//    public void clickFinishButtonAfterWatchingTheVideo() {
//        learning.finishButton();
//    }
//
//    //Scenario: User can see learning material
//    @Given("I am already logged to application")
//    public void alreadyLoggedToApplication() {
//        learning.loginPage();
//        learning.fillEmailField();
//        learning.fillPasswordField();
//        learning.loginButton();
//        learning.verifyPassword();
//        learning.homepage();
//    }
//    @When("I click courses button in the footer")
//    public void clickCoursesButtonInTheFooter() {
//        learning.coursesButton();
//    }
//    @And("I click either courses")
//    public void clickEitherCourses() {
//        learning.clickCourse();
//    }
//    @And("I click section material in the courses")
//    public void clickSectionMaterialInTheCourses() {
//        learning.clickMaterial();
//    }
//    @And("I click finish button after view in the material")
//    public void clickFinishButtonAfterViewInTheMaterial() {
//        learning.finishButton();
//    }
//    @Then("I click back to courses button")
//    public void clickBackToCourseButton() {
//        learning.backToCoursesButton();
//    }
//}
