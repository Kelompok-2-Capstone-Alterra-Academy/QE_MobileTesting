//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.WishlistAccess;
//
//public class WishlistAccessSteps {
//
//    @Steps
//    WishlistAccess wishlistAccess;
//
//    //Scenario: User can view courses details
//    @Given("I already login in app")
//    public void alreadyLoginInApp() {
//        wishlistAccess.loginPage();
//        wishlistAccess.fillEmailField();
//        wishlistAccess.fillPasswordField();
//        wishlistAccess.loginButton();
//        wishlistAccess.verifyPassword();
//    }
//    @When("Redirect on the homepage")
//    public void redirectOnTheHomepage() {
//        wishlistAccess.homepage();
//    }
//    @And("I clik icon wishlist")
//    public void clickIconWishlist() {
//        wishlistAccess.iconWishlist();
//    }
//}
