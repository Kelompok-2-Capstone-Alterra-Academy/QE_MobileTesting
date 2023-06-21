//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
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
//    //Scenario: User can view best mentor and contact mentor
//    @Given("I already login into application")
//    public void alreadyLoginIntoApplication() {
//        mentor.loginPage();
//        mentor.fillEmailField();
//        mentor.fillPasswordField();
//        mentor.loginButton();
//        mentor.verifyPassword();
//        mentor.homepage();
//    }
//    @When("I click see all the best mentor in the StarEdu")
//    public void clickSeeAllTheBestMentorInTheStatEdu() {
//        mentor.seeAllBestMentor();
//    }
//    @And("I click either mentor")
//    public void clickEitherMentor() {
//        mentor.eitherBestMentor();
//    }
//    @And("I return to homepage")
//    public void returnToHomepage() {
//        mentor.backHomepage();
//    }
//    @And("I click {string} in the bottom")
//    public void clickChatButtonInToBottom(String optional) {
//        if (optional.equals("chat button")) {
//            mentor.chatButton();
//        } else if (optional.equals("courses button through courses")) {
//            mentor.coursesButton();
//        } else if (optional.equals("courses button through video")) {
//            mentor.coursesButton();
//        }
//    }
//    @And("I click on search to look up the mentor name")
//    public void clickOnSearchToLookUpTheMentorName() {
//        mentor.searchMentor();
//    }
//    @And("I click either at the courses")
//    public void clickEitherAtTheCourses() {
//        mentor.clickCourse();
//    }
//    @And("I click ask mentor button")
//    public void clickAtTheAskMentorButton() {
//        mentor.askedMentorButton();
//    }
//    @And("I click into video section courses")
//    public void clickInToVideoSectionCourses() {
//        mentor.clickVideo();
//    }
//    @Then("I click icon whatsapp to contact mentor")
//    public void clickIconWhatsappToContactMentor() {
//        mentor.contactMentor();
//    }
//}
