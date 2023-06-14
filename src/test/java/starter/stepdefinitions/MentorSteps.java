//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Mentor;
//
//public class MentorSteps {
//
//    @Steps
//    Mentor mentor;
//
//    //Scenario: User can view the best mentors
//    @Given("I already login at the app")
//    public void alreadyLoginAtTheApp() {
//        mentor.loginPage();
//        mentor.fillEmailField();
//        mentor.fillPasswordField();
//        mentor.loginButton();
//        mentor.verifyPassword();
//        mentor.homepage();
//    }
//    @When("I click see all the best mentor in the StarEdu")
//    public void clickSeeAllTheBestMentorInTheStarEdu() {
//        mentor.seeAllBestMentor();
//    }
//    @Then("I click either mentor")
//    public void clickEitherMentor() {
//        mentor.eitherBestMentor();
//    }
//}
