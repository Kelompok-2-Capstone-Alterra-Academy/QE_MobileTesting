//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.NewsPost;
//
//public class NewsPostSteps {
//
//    @Steps
//    NewsPost newsPost;
//
//    //Scenario: User can view education news
//    @Given("I already login in the app")
//    public void alreadyLoginInTheApp() {
//        newsPost.loginPage();
//        newsPost.fillEmailField();
//        newsPost.fillPasswordField();
//        newsPost.loginButton();
//        newsPost.verifyPassword();
//        newsPost.homepage();
//    }
//    @When("I click see all in the regarding education of Indonesia")
//    public void clickSeeAllInTheRegardingEducationOfIndonesia() {
//        newsPost.seeAllNews();
//    }
//    @Then("I click either news education")
//    public void clickEitherNewsEducation() {
//        newsPost.newsEducation();
//    }
//
//    //Scenario: User can create post
//    @Given("I already login on the app")
//    public void alreadyLoginOnTheApp() {
//        newsPost.loginPage();
//        newsPost.fillEmailField();
//        newsPost.fillPasswordField();
//        newsPost.loginButton();
//        newsPost.verifyPassword();
//        newsPost.homepage();
//    }
//    @When("I click see all in the sharing with other user")
//    public void clickSeeAllInTheSharingWithOtherUser() {
//        newsPost.seeAllPost();
//    }
//    @And("Fill tell me about your experience")
//    public void fillTellMeAboutYourExperience() {
//        newsPost.experienceButton();
//        newsPost.fillExperience();
//    }
//    @Then("I click submit a post")
//    public void submitAPost() {
//        newsPost.submitButton();
//    }
//}
