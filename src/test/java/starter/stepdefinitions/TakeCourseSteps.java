//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.TakeCourse;
//
//public class TakeCourseSteps {
//
//    @Steps
//    TakeCourse takeCourse;
//
//    //Scenario: User can take courses
//    @Given("I already logged on application")
//    public void alreadyLoggedOnApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllOnThePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooseClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose class")
//    public void chooseClass() {
//        takeCourse.chooseClass();
//    }
//    @And("I choose major")
//    public void chooseMajor() {
//        takeCourse.chooseMajor();
//    }
//    @And("I click save button")
//    public void clickSaveButton() {
//        takeCourse.saveButton();
//    }
//    @And("I click claim promo button")
//    public void clickClaimPromoButton() {
//        takeCourse.claimPromoButton();
//    }
//    @And("I {string} all promo")
//    public void clickAllPromo(String promo) {
//        if (promo.equals("click")) {
//            takeCourse.claimPromo();
//            takeCourse.arrowBack();
//        } else {
//
//        }
//    }
//    @And("I click either of courses")
//    public void clickEitherOfCourses() {
//        takeCourse.eitherOfCourses();
//    }
//    @And("I click take courses button")
//    public void clickTakeCoursesButton() {
//        takeCourse.takeCoursesButton();
//    }
//    @And("I click use promo button")
//    public void clickUsePromoButton() {
//        takeCourse.voucherButton();
//    }
//    @And("I {string} promo")
//    public void choosePromo(String promo) {
//        if (promo.equals("choose")) {
//            takeCourse.addUsePromo1();
//            takeCourse.arrowBack();
//        } else {
//
//        }
//    }
//    @And("I click checkout button")
//    public void clickCheckoutButton() {
//        takeCourse.checkoutButton();
//    }
//    @And("I select payment method")
//    public void selectPaymentMethod() {
//        takeCourse.payment();
//    }
//    @And("I click pay now button")
//    public void clickPayNowButton() {
//        takeCourse.payNowButton();
//    }
//    @And("I fill pin")
//    public void fillPin() {
//        takeCourse.fillPin();
//    }
//    @And("I submit button")
//    public void submitButton() {
//        takeCourse.submitButton();
//    }
//    @Then("I payment success")
//    public void paymentSuccess() {
//        takeCourse.paymentSuccess();
//    }
//
//    //Scenario: User take course without choosing class or major
//    @Given("I already logged on application")
//    public void alreadyLoginOnApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllThePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooseeClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose {string} only")
//    public void chooseeMajor(String option) {
//        if (option.equals("major")) {
//            takeCourse.chooseMajor();
//        } else if (option.equals("class")) {
//            takeCourse.chooseClass();
//        } else {
//
//        }
//    }
//    @Then("I click save button")
//    public void clickSaveButtonn() {
//        takeCourse.saveButton();
//    }
//}
