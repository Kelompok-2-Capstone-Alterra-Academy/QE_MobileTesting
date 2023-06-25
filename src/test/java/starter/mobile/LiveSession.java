package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LiveSession extends BasePageObject {

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
    private By buttonLiveSession() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Live Session\"]");
    }
    private By buttonJoinedNotYet() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Belum Ikut\"]");
    }
    private By buttonJoinedAlready() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sudah Ikut\"]");
    }
    private By scheduleLiveSession() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Rabu, 17 April 2023, 13:00 - 16:00\n" +
                "Live Sesion - Pertemuan 5\n" +
                "Belum Ikut\"]");
    }
    private By scheduleLiveSession2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Senin, 17 April 2023, 13:00 - 16:00\n" +
                "Live Sesion - Pertemuan 1\n" +
                "Sudah Ikut\"]");
    }
    private By buttonJoinMeeting() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Join Meeting\"]");
    }
    private By pageLiveSession() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Live Sesion - Pertemuan 1\"]");
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
    public void liveSessionButton() {
        onClick(buttonLiveSession());
    }
    @Step
    public void joinedNotYetButton() {
        onClick(buttonJoinedNotYet());
    }
    @Step
    public void joinedAlreadyButton() {
        onClick(buttonJoinedAlready());
    }
    @Step
    public void classMeetingSchedule() {
        onClick(scheduleLiveSession());
    }
    @Step
    public void classMeetingSchedule2() {
        onClick(scheduleLiveSession2());
    }
    @Step
    public void joinMettingButton() {
        onClick(buttonJoinMeeting());
    }
    @Step
    public void liveSessionPage() {
        onClick(pageLiveSession());
    }
}
