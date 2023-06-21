//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Bookmark;
//
//public class BookmarkSteps {
//
//    @Steps
//    Bookmark bookmark;
//
//    //Scenario: User can view all notification
//    @Given("I already login on the app")
//    public void alreadyLoginOnTheApp() {
//        bookmark.loginPage();
//        bookmark.fillEmailField();
//        bookmark.fillPasswordField();
//        bookmark.loginButton();
//        bookmark.verifyPassword();
//    }
//    @When("Redirect to homepage")
//    public void redirectToHomepage() {
//        bookmark.homepage();
//    }
//    @And("I clik icon notification")
//    public void clickIconNotification() {
//        bookmark.iconNotification();
//    }
//    @And("I clik icon wishlist")
//    public void clickIconWishlist() {
//        bookmark.iconWishlist();
//    }
//    @Then("Return in the return homepage from {string}")
//    public void returnInTheHomepage(String option) {
//        if (option.equals("notification page")) {
//            bookmark.returnHomepage();
//        } else if (option.equals("wishlist page")) {
//            bookmark.returnHomepage2();
//        }
//    }
//}
