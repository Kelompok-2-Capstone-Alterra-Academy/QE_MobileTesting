//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Review;
//
//public class ReviewSteps {
//
//    @Steps
//    Review review;
//
//    //Scenario: User can submit review
//    @Given("I already logged in the application")
//    public void alreadyLoggedInTheApplication() {
//        review.loginPage();
//        review.fillEmailField();
//        review.fillPasswordField();
//        review.loginButton();
//        review.verifyPassword();
//        review.homepage();
//    }
//    @When("I click courses button bottom")
//    public void clickCourseButtonBottom() {
//        review.coursesButton();
//    }
//    @And("I click on one of the courses")
//    public void clickOnOneOfTheCourses() {
//        review.clickCourse();
//    }
//    @And("I click section material on the courses")
//    public void clickSectionMaterialOnTheCourses() {
//        review.clickMaterial();
//    }
//    @And("I click finish button after view on the material")
//    public void clickFinishButtonAfterViewOnTheMaterial() {
//        review.finishButton();
//    }
//    @And("I click the star to give rating")
//    public void clickTheStarToGiveRating() {
//        review.giveRating();
//    }
//    @And("I fill review field")
//    public void fillReviewField() {
//        review.fillReview();
//    }
//    @Then("I click submit review in the button")
//    public void clickSubmitReviewInTheButton() {
//        review.submitReviewButton();
//    }
//}
