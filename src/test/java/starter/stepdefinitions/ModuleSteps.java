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
    @When("I click see all on the popular coursesx")
    public void clickSeeAllOnThePopularCoursesx() {
        module.seeAll();
    }
    @And("I clicked either of coursesx")
    public void clickedEitherOfCoursesx() {
        module.eitherOfCourses();
    }
    @And("I click take courses buttonx")
    public void clickTakeCoursesButtonx() {
        module.takeCoursesButton();
    }
    @And("I click checkout buttonx")
    public void clickCheckoutButtonx() {
        module.checkoutButton();
    }
    @And("I select payment methodx")
    public void selectPaymentMethodx() {
        module.payment();
    }
    @And("I click pay now buttonx")
    public void clickPayNowButtonx() {
        module.payNowButton();
    }
    @And("I fill pinx")
    public void fillPinx() {
        module.fillPin();
    }
    @And("I submit button in the paymentx")
    public void submitButtonInThePaymentx() {
        module.submitButton();
        module.backPayment();
    }
    @And("I view history transactionx")
    public void viewHistoryTransactionx() {
        module.historyTransaction();
        module.viewEReceiptSuccess();
        module.backToHistoryTransaction();
    }
    @And("I click courses button in the bottomx")
    public void clickCourseButtonInTheBottomx() {
        module.coursesButton();
    }
    @And("I clicked either of the coursesx")
    public void clickEitherOfTheCoursesx() {
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
    @And("I click quiz buttonx")
    public void clickQuizButtonx() {
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
    @And("I fill review fieldx")
    public void fillReviewFieldx() {
        module.fillReview();
    }
    @And("I click submit review in the buttonx")
    public void clickSubmitReviewInTheButtonx() {
        module.submitReviewButton();
        module.recordedReview();
    }
    @And("I click finish sectionx")
    public void clickFinishSectionx() {
        module.finishSection();
    }
    @And("I click detail finished coursesx")
    public void clickDetailFinishedCoursesx() {
        module.detailFinishedCourses();
    }
    @And("I click certificate sectionx")
    public void clickCertificateSectionx() {
        module.certificateSection();
    }
    @Then("I click download certificate buttonx")
    public void clickDownloadCertificateButtonx() {
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
