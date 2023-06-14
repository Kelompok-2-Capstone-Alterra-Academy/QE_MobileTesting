//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.LearningMaterial;
//
//public class LearningMaterialSteps {
//
//    @Steps
//    LearningMaterial learningMaterial;
//
//    //Scenario: User can see learning material
//    @Given("I am already logged to application")
//    public void alreadyLoggedToApplication() {
//        learningMaterial.loginPage();
//        learningMaterial.fillEmailField();
//        learningMaterial.fillPasswordField();
//        learningMaterial.loginButton();
//        learningMaterial.verifyPassword();
//        learningMaterial.homepage();
//    }
//    @When("I click courses button in the bottom")
//    public void clickCoursesButtonInTheBottom() {
//        learningMaterial.coursesButton();
//    }
//    @And("I click either courses")
//    public void clickEitherCourses() {
//        learningMaterial.clickCourse();
//    }
//    @And("I click section material in the courses")
//    public void clickSectionMaterialInTheCourses() {
//        learningMaterial.clickMaterial();
//    }
//    @And("I click finish button after view in the material")
//    public void clickFinishButtonAfterViewInTheMaterial() {
//        learningMaterial.finishButton();
//    }
//    @Then("I click back to courses button")
//    public void clickBackToCourseButton() {
//        learningMaterial.backToCoursesButton();
//    }
//}
