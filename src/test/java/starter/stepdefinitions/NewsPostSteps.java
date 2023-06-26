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
//    @Given("I already login in the app")
//    public void alreadyLoginInTheApp() {
//        newsPost.masukButton();
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
//    @And("I click either news education")
//    public void clickEitherNewsEducation() {
//        newsPost.selectNews();
//    }
//    @And("I view news education")
//    public void viewNewsEducation() {
//        newsPost.newsEducation();
//    }
//    @And("I click see all in the sharing with other user")
//    public void clickSeeAllInTheSharingWithOtherUser() {
//        newsPost.seeAllPost();
//    }
//    @And("Fill tell me about your experience")
//    public void fillTellMeAboutYourExperience() {
//        newsPost.experienceButton();
//        newsPost.fillExperience();
//    }
//    @And("I click submit a post")
//    public void submitAPost() {
//        newsPost.submitButton();
//    }
//    @Then("I click like on other peoples posts")
//    public void clickLikeOnOtherPeoplesPosts() {
//        newsPost.likePost();
//    }
//}
