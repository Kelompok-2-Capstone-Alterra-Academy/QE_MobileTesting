//package starter.stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.mobile.Quiz;
//
//public class QuizSteps {
//
//    @Steps
//    Quiz quiz;
//
//    //Scenario: User can access quiz
//    @Given("I am already login to application")
//    public void alreadyLoginToApplication() {
//        quiz.loginPage();
//        quiz.fillEmailField();
//        quiz.fillPasswordField();
//        quiz.loginButton();
//        quiz.verifyPassword();
//        quiz.homepage();
//    }
//    @When("I clicked the courses button in the bottom")
//    public void clickedTheCoursesButtonInTheBottom() {
//        quiz.coursesButton();
//    }
//    @And("I clicked either of the courses")
//    public void clickedEitherOfTheCourses() {
//        quiz.clickCourse();
//    }
//    @And("I clicked quiz button")
//    public void clickedQuizButton() {
//        quiz.quizButton();
//    }
//    @And("I clicked quiz")
//    public void clickedQuiz() {
//        quiz.chooseQuiz();
//    }
//    @And("I clicked finish button")
//    public void clickedFinishButton() {
//        quiz.finishButton();
//    }
//    @Then("I clicked next quiz button")
//    public void clickedNextQuizButton() {
//        quiz.nextQuizButton();
//    }
//}
