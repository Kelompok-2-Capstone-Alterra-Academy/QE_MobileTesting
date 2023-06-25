package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class History extends BasePageObject {

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
    private By buttonTransaction() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Transaksi\n" +
                "Tab 4 of 5\"]");
    }
    private By buttonAccount() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Akun\n" +
                "Tab 5 of 5\"]");
    }
    private By buttonProfile() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
    }
    private By buttonMyTransaction() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Transaksi Saya\"]");
    }
    private By ereceipt() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "22 June 2023\n" +
                "success\n" +
                "E-Recipt\"]");
    }
    private By buttonCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kursus\n" +
                "Tab 2 of 5\"]");
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
    public void transactionButton() {
        onClick(buttonTransaction());
    }
    @Step
    public void accountButton() {
        onClick(buttonAccount());
    }
    @Step
    public void profileButton() {
        onClick(buttonProfile());
    }
    @Step
    public void myTransactionButton() {
        onClick(buttonMyTransaction());
    }
    @Step
    public void receiptCourses() {
        onClick(ereceipt());
    }
    @Step
    public void coursesButton() {
        onClick(buttonCourses());
    }
}
