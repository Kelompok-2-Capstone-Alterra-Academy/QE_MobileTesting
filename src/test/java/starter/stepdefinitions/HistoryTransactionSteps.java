//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.HistoryTransaction;
//
//public class HistoryTransactionSteps {
//
//    @Steps
//    HistoryTransaction historyTransaction;
//
//    //Scenario: User can submit review
//    @Given("I am already login at the application")
//    public void alreadyLoginAtTheApplication() {
//        historyTransaction.loginPage();
//        historyTransaction.fillEmailField();
//        historyTransaction.fillPasswordField();
//        historyTransaction.loginButton();
//        historyTransaction.verifyPassword();
//        historyTransaction.homepage();
//    }
//    @When("I clicked transaction button on bottom")
//    public void clickedTransactionButtonOnBottom() {
//        historyTransaction.transactionButton();
//    }
//    @Then("I clicked either of receipt courses")
//    public void clickedEitherOfReceiptCourses() {
//        historyTransaction.receiptCourses();
//    }
//}
