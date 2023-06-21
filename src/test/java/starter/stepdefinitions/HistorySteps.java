//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.History;
//
//public class HistorySteps {
//
//    @Steps
//    History history;
//
//    //Scenario: User can view history transaction
//    @Given("I am already login at the application")
//    public void alreadyLoginAtTheApplication() {
//        history.loginPage();
//        history.fillEmailField();
//        history.fillPasswordField();
//        history.loginButton();
//        history.verifyPassword();
//        history.homepage();
//    }
//    @When("I clicked transaction button on bottom")
//    public void clickedTransactionButtonOnBottom() {
//        history.transactionButton();
//    }
//    @Then("I clicked either of receipt courses")
//    public void clickedEitherOfReceiptCourses() {
//        history.receiptCourses();
//    }
//
//    //Scenario: User can view study history for each subject
//    @Given("I already logged on the application")
//    public void alreadyLoggedOnTheApplication() {
//        history.loginPage();
//        history.fillEmailField();
//        history.fillPasswordField();
//        history.loginButton();
//        history.verifyPassword();
//        history.homepage();
//    }
//    @When("I click in courses button bottom")
//    public void clickInCoursesButtonButtom() {
//        history.coursesButton();
//    }
//    @And("I click one of the courses")
//    public void clickOneOfTheCourses() {
//        history.clickCourse();
//    }
//    @Then("I click certificate button")
//    public void clickCertificateButton() {
//        history.certificateButton();
//    }
//
//    //Scenario: User view history
//    @Given("I already login the app")
//    public void alreadyLoginTheApp() {
//        history.loginPage();
//        history.fillEmailField();
//        history.fillPasswordField();
//        history.loginButton();
//        history.verifyPassword();
//        history.homepage();
//    }
//    @When("I click bottom the courses button")
//    public void clickBottomTheCoursesButton() {
//        history.coursesButton();
//    }
//    @Then("I click finish button")
//    public void clickFinishButton() {
//        history.completedButton();
//    }
//}
