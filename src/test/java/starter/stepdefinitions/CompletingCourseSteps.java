package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.CompletingCourse;

public class CompletingCourseSteps {

    @Steps
    CompletingCourse completingCourse;

    @Given("I already logged the application")
    public void alreadyLoggedTheApplication() {
        completingCourse.masukButton();
        completingCourse.loginPage();
        completingCourse.fillEmailField();
        completingCourse.fillPasswordField();
        completingCourse.loginButton();
        completingCourse.verifyPassword();
        completingCourse.homepage();
    }
    @When("I click bottom in courses button")
    public void clickBottomInCoursesButton() {
        completingCourse.coursesButton();
    }
    @And("I  click done button in the my course")
    public void clickDoneButonInTheMyCourse() {
        completingCourse.completeButton();
    }
    @And("I click the one of the courses")
    public void clickTheOneOfTheCourses() {
        completingCourse.clickCourse();
    }
    @And("I click in the certificate button")
    public void clickInTheCertificateButton() {
        completingCourse.certificateButton();
    }
    @And("I click download certificate button")
    public void clickDownloadCertificateButton() {
        completingCourse.downloadCertificateButton();
    }
    @Then("I click access to download certificate")
    public void clickAccessToDownloadCertificate() {
        completingCourse.accessDownloadCertificate();
    }
}
