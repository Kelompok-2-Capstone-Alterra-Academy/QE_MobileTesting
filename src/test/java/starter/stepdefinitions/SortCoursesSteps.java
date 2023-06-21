//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.SortCourses;
//
//public class SortCoursesSteps {
//
//    @Steps
//    SortCourses sortCourses;
//
//    //Scenario: User can sort course
//    @Given("I am already logged the application")
//    public void alreadyLoggedTheApplication() {
//        sortCourses.loginPage();
//        sortCourses.fillEmailField();
//        sortCourses.fillPasswordField();
//        sortCourses.loginButton();
//        sortCourses.verifyPassword();
//        sortCourses.homepage();
//    }
//    @When("I clicked courses button on bottom")
//    public void clickedCoursesButtonOnBottom() {
//        sortCourses.coursesButton();
//    }
//    @And("I clicked the sort")
//    public void clickedTheSort() {
//        sortCourses.sortBy();
//    }
//    @And("I select the sort by {string}")
//    public void selectTheSortByOption(String option) {
//
//        if (option.equals("New Course")) {
//            sortCourses.selectSortBy1();
//        } else if (option.equals("New Course and IPA")) {
//            sortCourses.selectSortBy1();
//            sortCourses.selectSortBy2();
//        }else {
//
//        }
//    }
//    @Then("I clicked save button")
//    public void clickedSaveButton() {
//        sortCourses.saveButton();
//    }
//}
