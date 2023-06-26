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
//    @Given("I am already login at the application")
//    public void alreadyLoginAtTheApplication() {
//        history.masukButton();
//        history.loginPage();
//        history.fillEmailField();
//        history.fillPasswordField();
//        history.loginButton();
//        history.verifyPassword();
//        history.homepage();
//    }
//    @When("I clicked {string} on bottom")
//    public void clickedOnBottom(String option) {
//        if (option.equals("transaction button")) {
//            history.transactionButton();
//        } else if (option.equals("account button")) {
//            history.accountButton();
//        }
//
//    }
//    @And("I clicked profile button in the top right corner")
//    public void clickedProfileButtonInTheTopRightCorner() {
//        history.profileButton();
//    }
//    @And("I clicked {string} button")
//    public void clickedButton(String option) {
//        if (option.equals("my transaction")) {
//            history.myTransactionButton();
//        }
//    }
//    @Then("I clicked either of {string} courses")
//    public void clickedEitherOfCourses(String option) {
//        if (option.equals("e-receipt")) {
//            history.receiptCourses();
//        }
//    }
//}
