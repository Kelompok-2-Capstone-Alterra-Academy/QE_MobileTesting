package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Learning extends BasePageObject {

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
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Matematika Dasar\n" +
                "Section \n" +
                "9\n" +
                "/\n" +
                "11\n" +
                "80\n" +
                " %\"]");
    }
    private By video() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Matematika Dasar \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By material() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"02\n" +
                "Materi Matematika Dasar \n" +
                "Materi\n" +
                "14 Slides\n" +
                "Belum Selesai\"]");
    }
    private By buttonFinish() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By backCourse() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kembali ke Kursus\"]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@123Alta";

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
    public void clickVideo() {
        scrollDown();
        onClick(video());
    }
    @Step
    public void clickMaterial() {
        scrollDown();
        onClick(material());
    }
    @Step
    public void finishButton() {
        onClick(buttonFinish());
    }
    @Step
    public void backToCoursesButton() {
        onClick(backCourse());
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