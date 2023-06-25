package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Quiz extends BasePageObject {

    private By buttonMasuk() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    private By loginPages() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Masuk ke Akun\"]");
    }
    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By buttonLogin() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    private By passwordVerification() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lain Kali\"]");
    }
    private By homepages() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selamat Pagi\"]");
    }
    private By buttonCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kursus\n" +
                "Tab 2 of 5\"]");
    }
    private By eiterCourses() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Kursus Baru !\n" +
                "0\n" +
                " %\"]");
    }
    private By buttonQuiz() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz\"]");
    }
    private By quiz() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz 4 - Dasar-Dasar Golang\n" +
                "100 Point\"]");
    }
    private By answers1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.RadioButton");
    }
    private By answers2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.RadioButton");
    }
    private By answers3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.RadioButton");
    }
    private By submit() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.Button[1]");
    }
    private By score() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lihat skor\"]/android.view.View");
    }
    private By buttonFinish() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By buttonNextQuiz() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Quiz Selanjutnya\"]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@Alta123";

    @Step
    public void masukButton() {
        onClick(buttonMasuk());
    }
    @Step
    public void loginPage() {
        waitUntilPresence(loginPages());
    }
    @Step
    public void fillEmailField() {
        onClick(emailField());
        waitUntilPresence(emailField()).sendKeys(email);
    }
    @Step
    public void fillPasswordField() {
        onClick(passwordField());
        waitUntilPresence(passwordField()).sendKeys(password);
    }
    @Step
    public void loginButton() {
        onClick(buttonLogin());
    }
    @Step
    public void verifyPassword() {
        onClick(passwordVerification());
    }
    @Step
    public void homepage() {
        onClick(homepages());
    }
    @Step
    public void coursesButton() {
        onClick(buttonCourses());
    }
    @Step
    public void clickCourse() {
        onClick(eiterCourses());
    }
    @Step
    public void quizButton() {
        onClick(buttonQuiz());
    }
    @Step
    public void chooseQuiz() {
        onClick(quiz());
    }
    @Step
    public void answersQuestion1() {
        onClick(answers1());
    }
    @Step
    public void answersQuestion2() {
        scrollDown();
        onClick(answers2());
    }
    @Step
    public void answersQuestion3() {
        scrollDown();
        scrollDown();
        onClick(answers3());
    }
    @Step
    public void submitGform() {
        scrollDown();
        onClick(submit());
    }
    @Step
    public void viewScore() {
        onClick(score());
    }
    @Step
    public void finishButton() {
        onClick(buttonFinish());
    }
    @Step
    public void nextQuizButton() {
        onClick(buttonNextQuiz());
    }
    @Step
    public void scrollDown() {
        int startX = getDriver().manage().window().getSize().getWidth() / 2;
        int startY = getDriver().manage().window().getSize().getHeight() * 3 / 4;
        int endY = getDriver().manage().window().getSize().getHeight() / 4;

        TouchAction<?> action = new TouchAction<>(getDriver());
        action.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
}
