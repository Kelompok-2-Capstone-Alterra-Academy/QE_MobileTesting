package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class History extends BasePageObject {

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
    private By buttonTransaction() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Transaksi\n" +
                "Tab 4 of 5\"]");
    }
    private By ereceipt() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Matematika\n" +
                "Tanggal Order : 15 JAnuari 2023\n" +
                "E-Recipt\"]");
    }
    private By buttonCompleted() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selesai\n" +
                "Tab 2 of 2\"]");
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
    private By buttonCertificate() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Sertifikat\n" +
                "Tab 2 of 2\"]");
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
    public void transactionButton() {
        onClick(buttonTransaction());
    }
    @Step
    public void receiptCourses() {
        onClick(ereceipt());
    }
    @Step
    public void coursesButton() {
        onClick(buttonCourses());
    }
    @Step
    public void completedButton() {
        onClick(buttonCompleted());
    }
    @Step
    public void clickCourse() {
        onClick(eiterCourses());
    }
    @Step
    public void certificateButton() {
        onClick(buttonCertificate());
    }
}
