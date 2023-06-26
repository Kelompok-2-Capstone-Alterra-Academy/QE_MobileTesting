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
//    @Given("I am already login to application")
//    public void alreadyLoginToApplication() {
//        quiz.masukButton();
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
//    @And("I {string} question multiple choice in the gform")
//    public void answersQuestionMultipleChoiceInTheGform(String answers) {
//        if (answers.equals("answers")) {
//            quiz.answersQuestion1();
//            quiz.answersQuestion2();
//            quiz.answersQuestion3();
//        } else if (answers.equals("answers without completing")) {
//            quiz.answersQuestion1();
//            quiz.answersQuestion3();
//        }
//    }
//    @And("I {string} answers the gform")
//    public void submitAnswersTheGform(String submit) {
//        if (submit.equals("submit")) {
//            quiz.submitGform();
//        } else {
//
//        }
//    }
//    @And("I {string} score quiz")
//    public void viewScoreQuiz(String view) {
//        if (view.equals("view")) {
//            quiz.viewScore();
//        } else {
//
//        }
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
