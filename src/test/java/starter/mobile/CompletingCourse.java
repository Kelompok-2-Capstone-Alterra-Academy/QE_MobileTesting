package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CompletingCourse extends BasePageObject {

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
    private By buttonCompleted() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selesai\n" +
                "Tab 2 of 2\"]");
    }
    private By eiterCourses() {
        return MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Kursus Baru !\n" +
                "0\n" +
                " %\"])[1]");
    }
    private By buttonCertificate() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Sertifikat\n" +
                "Tab 2 of 2\"]");
    }
    private By buttonDownloadCertificate() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Unduh Sertifikat\"]");
    }
    private By access() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@123Alta";

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
    public void certificateButton() {
        onClick(buttonCertificate());
    }
    @Step
    public void downloadCertificateButton() {
        onClick(buttonDownloadCertificate());
    }
    @Step
    public void accessDownloadCertificate() {
        onClick(access());
    }
    @Step
    public void completeButton() {
        onClick(buttonCompleted());
    }
}
