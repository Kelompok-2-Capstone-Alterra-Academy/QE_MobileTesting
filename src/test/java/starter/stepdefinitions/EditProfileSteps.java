//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.EditProfile;
//
//public class EditProfileSteps {
//
//    @Steps
//    EditProfile editProfile;
//
//    //Scenario: User can change fullname
//    @Given("I already logged in application")
//    public void alreadyLoggedInApplication() {
//        editProfile.loginPage();
//        editProfile.fillEmailField();
//        editProfile.fillPasswordField();
//        editProfile.loginButton();
//        editProfile.verifyPassword();
//        editProfile.homepage();
//    }
//    @When("I clicked the profile button in the top right corner")
//    public void clickedTheProfileButtonInTheTopRightCorner() {
//        editProfile.topRightCorner();
//    }
//    @And("I click edit profile button")
//    public void clickEditProfileButton() {
//        editProfile.editProfileButton();
//    }
//    @And("I change full name")
//    public void changeFullName() {
//        editProfile.changeFullNameField();
//    }
//    @And("I fill hometown field")
//    public void fillHometownField() {
//        editProfile.fillHometownField();
//    }
//    @And("I change telephone number")
//    public void changeTelephoneNumber() {
//        editProfile.changeTelephoneNumberField();
//    }
//    @And("I fill class level field")
//    public void fillClassLevelField() {
//        editProfile.fillClassLevelField();
//    }
//    @And("I fill school name field")
//    public void fillSchollNameField() {
//        editProfile.fillSchoolNameField();
//    }
//    @And("I fill major field")
//    public void fillMajorField() {
//        editProfile.fillMajorField();
//    }
//    @Then("I click save change button")
//    public void clickSaveChangeButton() {
//        editProfile.saveChangeButton();
//    }
//}
