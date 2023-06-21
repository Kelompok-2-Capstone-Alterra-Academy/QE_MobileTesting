//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.DownloadCertificate;
//
//public class DownloadCertificateSteps {
//
//    @Steps
//    DownloadCertificate downloadCertificate;
//
//    //Scenario: User can download the certificate after completing the courses
//    @Given("I already logged the application")
//    public void alreadyLoggedTheApplication() {
//        downloadCertificate.loginPage();
//        downloadCertificate.fillEmailField();
//        downloadCertificate.fillPasswordField();
//        downloadCertificate.loginButton();
//        downloadCertificate.verifyPassword();
//        downloadCertificate.homepage();
//    }
//    @When("I click bottom in courses button")
//    public void clickBottomInCoursesButton() {
//        downloadCertificate.coursesButton();
//    }
//    @And("I click the one of the courses")
//    public void clickTheOneOfTheCourses() {
//        downloadCertificate.clickCourse();
//    }
//    @And("I click in the certificate button")
//    public void clickInTheCertificateButton() {
//        downloadCertificate.certificateButton();
//    }
//    @And("I click download certificate button")
//    public void clickDownloadCertificateButton() {
//        downloadCertificate.downloadCertificateButton();
//    }
//    @And("I click access to download certificate")
//    public void clickAccessToDownloadCertificate() {
//        downloadCertificate.accessDownloadCertificate();
//    }
//}
