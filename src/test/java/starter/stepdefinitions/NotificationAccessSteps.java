//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.NotificationAccess;
//
//public class NotificationAccessSteps {
//
//    @Steps
//    NotificationAccess notificationAccess;
//
//    //Scenario: User can view all notification
//    @Given("I already login on the app")
//    public void alreadyLoginOnTheApp() {
//        notificationAccess.loginPage();
//        notificationAccess.fillEmailField();
//        notificationAccess.fillPasswordField();
//        notificationAccess.loginButton();
//        notificationAccess.verifyPassword();
//    }
//    @When("Redirect to homepage")
//    public void redirectToHomepage() {
//        notificationAccess.homepage();
//    }
//    @Then("I clik icon notification")
//    public void clickIconNotification() {
//        notificationAccess.iconNotification();
//    }
//}
