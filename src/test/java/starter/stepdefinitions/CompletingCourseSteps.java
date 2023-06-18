//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.CompletingCourses;
//
//public class CompletingCourseSteps {
//
//    @Steps
//    CompletingCourses completingCourse;
//
//    //Scenario: User can submit review
//    @Given("I already logged in the application")
//    public void alreadyLoggedInTheApplication() {
//        completingCourse.loginPage();
//        completingCourse.fillEmailField();
//        completingCourse.fillPasswordField();
//        completingCourse.loginButton();
//        completingCourse.verifyPassword();
//        completingCourse.homepage();
//    }
//    @When("I click courses button bottom")
//    public void clickCourseButtonBottom() {
//        completingCourse.coursesButton();
//    }
//    @And("I click on one of the courses")
//    public void clickOnOneOfTheCourses() {
//        completingCourse.clickCourse();
//    }
//    @And("I click section material on the courses")
//    public void clickSectionMaterialOnTheCourses() {
//        completingCourse.clickMaterial();
//    }
//    @And("I click finish button after view on the material")
//    public void clickFinishButtonAfterViewOnTheMaterial() {
//        completingCourse.finishButton();
//    }
//    @And("I click the star to give rating")
//    public void clickTheStarToGiveRating() {
//        completingCourse.giveRating();
//    }
//    @And("I fill review field")
//    public void fillReviewField() {
//        completingCourse.fillReview();
//    }
//    @Then("I click submit review in the button")
//    public void clickSubmitReviewInTheButton() {
//        completingCourse.submitReviewButton();
//    }
//
//    //Scenario: User can view study history for each subject
//    @Given("I already logged on the application")
//    public void alreadyLoggedOnTheApplication() {
//        completingCourse.loginPage();
//        completingCourse.fillEmailField();
//        completingCourse.fillPasswordField();
//        completingCourse.loginButton();
//        completingCourse.verifyPassword();
//        completingCourse.homepage();
//    }
//    @When("I click in courses button bottom")
//    public void clickInCoursesButtonButtom() {
//        completingCourse.coursesButton();
//    }
//    @And("I click one of the courses")
//    public void clickOneOfTheCourses() {
//        completingCourse.clickCourse();
//    }
//    @Then("I click certificate button")
//    public void clickCertificateButton() {
//        completingCourse.certificateButton();
//    }
//
//    //Scenario: User can download the certificate after completing the courses
//    @Given("I already logged the application")
//    public void alreadyLoggedTheApplication() {
//        completingCourse.loginPage();
//        completingCourse.fillEmailField();
//        completingCourse.fillPasswordField();
//        completingCourse.loginButton();
//        completingCourse.verifyPassword();
//        completingCourse.homepage();
//    }
//    @When("I click bottom in courses button")
//    public void clickBottomInCoursesButton() {
//        completingCourse.coursesButton();
//    }
//    @And("I click the one of the courses")
//    public void clickTheOneOfTheCourses() {
//        completingCourse.clickCourse();
//    }
//    @And("I click in the certificate button")
//    public void clickInTheCertificateButton() {
//        completingCourse.certificateButton();
//    }
//    @And("I click download certificate button")
//    public void clickDownloadCertificateButton() {
//        completingCourse.downloadCertificateButton();
//    }
//    @And("I click access to download certificate")
//    public void clickAccessToDownloadCertificate() {
//        completingCourse.accessDownloadCertificate();
//    }
//}
