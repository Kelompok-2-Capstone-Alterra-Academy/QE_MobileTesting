package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.Module;

public class ModuleSteps {

    @Steps
    Module module;

    @Given("I am already login in to application")
    public void alreadyLoginInToApplication() {
        module.masukButton();
        module.loginPage();
        module.fillEmailField();
        module.fillPasswordField();
        module.loginButton();
        module.verifyPassword();
        module.homepage();
    }
    @When("I click see all on the popular courses")
    public void clickSeeAllOnThePopularCourses() {
        module.seeAll();
    }
    @And("I clicked either of courses")
    public void clickedEitherOfCourses() {
        module.eitherOfCourses();
    }
    @And("I click take courses button")
    public void clickTakeCoursesButton() {
        module.takeCoursesButton();
    }
    @And("I click checkout button")
    public void clickCheckoutButton() {
        module.checkoutButton();
    }
    @And("I select payment method")
    public void selectPaymentMethod() {
        module.payment();
    }
    @And("I click pay now button")
    public void clickPayNowButton() {
        module.payNowButton();
    }
    @And("I fill pin")
    public void fillPin() {
        module.fillPin();
    }
    @And("I submit button in the payment")
    public void submitButtonInThePayment() {
        module.submitButton();
        module.backPayment();
    }
    @And("I view history transaction")
    public void viewHistoryTransaction() {
        module.historyTransaction();
        module.viewEReceiptSuccess();
        module.backToHistoryTransaction();
    }
    @And("I click courses button in the bottom")
    public void clickCourseButtonInTheBottom() {
        module.coursesButton();
    }
    @And("I clicked either of the courses")
    public void clickEitherOfTheCourses2() {
        module.clickCourse();
    }
    @And("I click Materi {string}")
    public void clickMateri(String option) {
        module.modulButton();
        if (option.equals("Video 1")) {
            module.materialVideo1();
            module.finishButton1();
        } else if (option.equals("Tugas 1")) {
            module.assignment1();
            module.collectTasks1();
            module.selectFile1();
            module.allowAccess1();
            module.assignmentFile1();
            module.noteAssignment1();
            module.submitButton1();
            module.assignmentSuccess1();
            module.myCoursePage1();
        } else if (option.equals("Materi 1")) {
            module.material1();
            module.finishButton2();
        } else if (option.equals("Video 2")) {
            module.materialVideo2();
            module.finishButton3();
        } else if (option.equals("Tugas 2")) {
            module.assignment2();
            module.collectTasks2();
            module.selectFile2();
            module.assignmentFile2();
            module.noteAssignment2();
            module.submitButton2();
            module.assignmentSuccess2();
            module.myCoursePage2();
        } else if (option.equals("Tugas 3")) {
            module.assignment3();
            module.collectTasks3();
            module.selectFile3();
            module.assignmentFile3();
            module.noteAssignment3();
            module.submitButton3();
            module.assignmentSuccess3();
            module.myCoursePage3();
        } else if (option.equals("Video 3")) {
            module.materialVideo3();
            module.finishButton4();
        } else if (option.equals("Tugas 4")) {
            module.assignment4();
            module.collectTasks4();
            module.selectFile4();
            module.assignmentFile4();
            module.noteAssignment4();
            module.submitButton4();
            module.assignmentSuccess4();
            module.myCoursePage4();
        } else if (option.equals("Materi 2")) {
            module.material2();
            module.finishButton5();
        }
    }
    @And("I click quiz button")
    public void clickQuizButton() {
        module.quizButton();
    }
    @And("I click quiz 4 {string}")
    public void clickQuiz4(String option) {
        if (option.equals("Dasar - Dasar Golang")) {
            module.chooseQuiz1();
            module.answersQuestion1();
            module.answersQuestion2();
            module.answersQuestion3();
            module.submitQuiz();
            module.viewScore();
            module.finishButton();
            module.nextQuizButton();
        } else if (option.equals("Golang Intermediate")) {
            module.chooseQuiz2();
            module.answersQuestion1();
            module.answersQuestion2();
            module.answersQuestion3();
            module.submitQuiz();
            module.viewScore();
            module.finishButton();
            module.nextQuizButton();
        } else if (option.equals("Golang Advance")) {
            module.chooseQuiz3();
            module.answersQuestion1();
            module.answersQuestion2();
            module.answersQuestion3();
            module.submitQuiz();
            module.viewScore();
            module.finishButton();
        }
    }
    @And("I click the star to give {string}")
    public void clickTheStarToGive(String option) {
        if (option.equals("rating 1")) {
            module.giveRating1();
        } else if (option.equals("rating 2")) {
            module.giveRating2();
        } else if (option.equals("rating 3")) {
            module.giveRating3();
        } else if (option.equals("rating 4")) {
            module.giveRating4();
        } else if (option.equals("rating 5")) {
            module.giveRating5();
        }
    }
    @And("I fill review field")
    public void fillReviewField() {
        module.fillReview();
    }
    @And("I click submit review in the button")
    public void clickSubmitReviewInTheButton() {
        module.submitReviewButton();
        module.recordedReview();
    }
    @And("I click finish section")
    public void clickFinishSection() {
        module.finishSection();
    }
    @And("I click detail finished courses")
    public void clickDetailFinishedCourses() {
        module.detailFinishedCourses();
    }
    @And("I click certificate section")
    public void clickCertificateSection() {
        module.certificateSection();
    }
    @Then("I click download certificate button")
    public void clickDownloadCertificateButton() {
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
        module.clickDownloadCertificateButton();
    }
}
