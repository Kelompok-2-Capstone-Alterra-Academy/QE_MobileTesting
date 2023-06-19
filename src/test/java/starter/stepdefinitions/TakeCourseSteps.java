//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.TakeCourse;
//
//public class TakeCourseSteps {
//
//    @Steps
//    TakeCourse takeCourse;
//
//    //Scenario: User can take courses
//    @Given("I already logged on application")
//    public void alreadyLoggedOnApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllOnThePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooseClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose class")
//    public void chooseClass() {
//        takeCourse.chooseClass();
//    }
//    @And("I choose major")
//    public void chooseMajor() {
//        takeCourse.chooseMajor();
//    }
//    @And("I click save button")
//    public void clickSaveButton() {
//        takeCourse.saveButton();
//    }
//    @And("I click either of courses")
//    public void clickEitherOfCourses() {
//        takeCourse.eitherOfCourses();
//    }
//    @And("I click take courses button")
//    public void clickTakeCoursesButton() {
//        takeCourse.takeCoursesButton();
//    }
//    @And("I click checkout button")
//    public void clickCheckoutButton() {
//        takeCourse.checkoutButton();
//    }
//    @Then("Can view modul")
//    public void canViewModul() {
//        takeCourse.viewModul();
//    }
//
//    //Scenario: User take course without choosing class
//    @Given("I already logged on application")
//    public void alreadyLoginOnApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllThePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooseeClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose {string} only")
//    public void chooseeMajor(String option) {
//        if (option.equals("major")) {
//            takeCourse.chooseMajor();
//        } else if (option.equals("class")) {
//            takeCourse.chooseClass();
//        } else {
//
//        }
//    }
//    @Then("I click save button")
//    public void clickSaveButtonn() {
//        takeCourse.saveButton();
//    }
//
//    //Scenario: User take course without choosing class
//    @Given("I already logged on application")
//    public void alreadyLoginOnApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllThePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooseeClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose major")
//    public void chooseeMajor() {
//        takeCourse.chooseMajor();
//    }
//    @Then("Then I click save button")
//    public void clickSaveButtonn() {
//        takeCourse.saveButton();
//    }
//
//    //Scenario: User take course without choosing major
//    @Given("I already logged on application")
//    public void alreadyLoginApplication() {
//        takeCourse.loginPage();
//        takeCourse.fillEmailField();
//        takeCourse.fillPasswordField();
//        takeCourse.loginButton();
//        takeCourse.verifyPassword();
//        takeCourse.homepage();
//    }
//    @When("I click see all on the popular courses")
//    public void clickSeeAllePopulerCourses() {
//        takeCourse.seeAll();
//    }
//    @And("I click choose class and major")
//    public void clickChooClassAndMajor() {
//        takeCourse.chooseClassAndMajor();
//    }
//    @And("I choose major")
//    public void chooseTheMajor() {
//        takeCourse.chooseMajor();
//    }
//    @Then("Then I click save button")
//    public void clickSavetheButtonn() {
//        takeCourse.saveButton();
//    }
//
//}
