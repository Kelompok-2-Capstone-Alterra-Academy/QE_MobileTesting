//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.ContactMentor;
//
//public class ContactMentorSteps {
//
//    @Steps
//    ContactMentor contactMentor;

//    //Scenario: User can contact mentor
//    @Given("I already login into application")
//    public void alreadyLoginIntoApplication() {
//        contactMentor.loginPage();
//        contactMentor.fillEmailField();
//        contactMentor.fillPasswordField();
//        contactMentor.loginButton();
//        contactMentor.verifyPassword();
//        contactMentor.homepage();
//    }
//    @When("I click chat button in to bottom")
//    public void clickChatButtonInToBottom() {
//        contactMentor.chatButton();
//    }
//    @And("I click on search to look up the mentor name")
//    public void clickOnSearchToLookUpTheMentorName() {
//        contactMentor.searchMentor();
//    }
//    @Then("I click icon whatsapp to contact mentor")
//    public void clickIconWhatsappToContactMentor() {
//        contactMentor.contactMentor();
//    }

//    //Scenario: User can contact mentors through either courses
//    @Given("I already login at the application")
//    public void alreadyLoginAtTheApplication() {
//        contactMentor.loginPage();
//        contactMentor.fillEmailField();
//        contactMentor.fillPasswordField();
//        contactMentor.loginButton();
//        contactMentor.verifyPassword();
//        contactMentor.homepage();
//    }
//    @When("I click bottom at the courses button")
//    public void clickBottomAtTheCoursesButton() {
//        contactMentor.coursesButton();
//    }
//    @And("I click either at the courses")
//    public void clickEitherAtTheCourses() {
//        contactMentor.clickCourse();
//    }
//    @Then("I click at the ask mentor button")
//    public void clickAtTheAskMentorButton() {
//        contactMentor.askedMentorButton();
//    }

//    //Scenario: User can contact mentors through video courses
//    @Given("I already logged into app")
//    public void alreadyLoggedIntoApp() {
//        contactMentor.loginPage();
//        contactMentor.fillEmailField();
//        contactMentor.fillPasswordField();
//        contactMentor.loginButton();
//        contactMentor.verifyPassword();
//        contactMentor.homepage();
//    }
//    @When("I click bottom in the courses button")
//    public void clickBottomInTheCoursesButton() {
//        contactMentor.coursesButton();
//    }
//    @And("I click either into courses")
//    public void clickEitherIntoCourses() {
//        contactMentor.clickCourse();
//    }
//    @And("I click into video section courses")
//    public void clickIntoVideoSectionCourses() {
//        contactMentor.clickVideo();
//    }
//    @Then("I click ask mentor button")
//    public void clickAskMentorButton() {
//        contactMentor.askMentorButton();
//    }
//}
