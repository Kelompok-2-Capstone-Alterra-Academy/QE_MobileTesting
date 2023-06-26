package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.mobile.TakeCourse;

public class TakeCourseSteps {

    @Steps
    TakeCourse takeCourse;

    @Given("I already logged on application")
    public void alreadyLoggedOnApplication() {
        takeCourse.masukButton();
        takeCourse.loginPage();
        takeCourse.fillEmailField();
        takeCourse.fillPasswordField();
        takeCourse.loginButton();
        takeCourse.verifyPassword();
        takeCourse.homepage();
    }
    @When("I click see all on the popular courses")
    public void clickSeeAllOnThePopulerCourses() {
        takeCourse.seeAll();
    }
    @And("I click choose class and major")
    public void clickChooseClassAndMajor() {
        takeCourse.chooseClassAndMajor();
    }
    @And("I choose class")
    public void chooseClass() {
        takeCourse.chooseClass();
    }
    @And("I choose major")
    public void chooseMajor() {
        takeCourse.chooseMajor();
    }
    @And("I choose {string} only")
    public void chooseOnly(String option) {
        if (option.equals("major")) {
            takeCourse.chooseMajor();
        } else if (option.equals("class")) {
            takeCourse.chooseClass();
        } else {

        }
    }
    @And("I click save button")
    public void clickSaveButton() {
        takeCourse.saveButton();
    }
    @And("I click claim promo button")
    public void clickClaimPromoButton() {
        takeCourse.claimPromoButton();
    }
    @And("I {string} all promo")
    public void clickAllPromo(String promo) {
        if (promo.equals("click")) {
            takeCourse.claimPromo();
            takeCourse.back();
        } else {

        }
    }
    @And("I click either of courses")
    public void clickEitherOfCourses() {
        takeCourse.eitherOfCourses();
    }
    @And("I click take courses button")
    public void clickTakeCoursesButton() {
        takeCourse.takeCoursesButton();
    }
    @And("I click use promo button")
    public void clickUsePromoButton() {
        takeCourse.voucherButton();
    }
    @And("I {string} promo")
    public void choosePromo(String promo) {
        if (promo.equals("choose")) {
            takeCourse.addUsePromo1();
            takeCourse.back();
        } else {

        }
    }
    @And("I click checkout button")
    public void clickCheckoutButton() {
        takeCourse.checkoutButton();
    }
    @And("I click back without choosing payment")
    public void clickBackWithoutChoosingPayment() {
        takeCourse.backWithoutPayment();
    }
    @And("I select payment method")
    public void selectPaymentMethod() {
        takeCourse.payment();
    }
    @And("I click pay now button")
    public void clickPayNowButton() {
        takeCourse.payNowButton();
    }
    @And("I fill pin")
    public void fillPin() {
        takeCourse.fillPin();
    }
    @And("I submit button in the payment")
    public void submitButtonInThePayment() {
        takeCourse.submitButton();
        takeCourse.backPayment();
    }
    @Then("I view history transaction {string}")
    public void viewHistoryTransaction(String option) {
        takeCourse.historyTransaction();
        if (option.equals("success")) {
            takeCourse.viewEReceiptSuccess();
        } else if (option.equals("pending")) {
            takeCourse.viewEReceiptPending();
        }
    }
}
