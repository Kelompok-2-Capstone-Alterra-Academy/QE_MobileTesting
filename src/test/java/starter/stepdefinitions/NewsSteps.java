//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.News;
//
//public class NewsSteps {
//
//    @Steps
//    News news;
//
//    //Scenario: User can view education news
//    @Given("I already login in the app")
//    public void alreadyLoginInTheApp() {
//        news.loginPage();
//        news.fillEmailField();
//        news.fillPasswordField();
//        news.loginButton();
//        news.verifyPassword();
//        news.homepage();
//    }
//    @When("I click see all in the regarding education of Indonesia")
//    public void clickSeeAllInTheRegardingEducationOfIndonesia() {
//        news.seeAllNews();
//    }
//    @Then("I click either news education")
//    public void clickEitherNewsEducation() {
//        news.newsEducation();
//    }
//}
