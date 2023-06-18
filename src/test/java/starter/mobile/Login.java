package starter.mobile;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import automation.pageobject.BasePageObject;


public class Login extends BasePageObject {

    private By loginPages() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Masuk ke Akun\"]");
    }
    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    private By withoutEmail() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
    }
    private By emailInvalid() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email tidak valid\"]");
    }
    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By withoutPassword() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kata Sandi tidak boleh kosong\"]");
    }
    private By buttonLogin() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    private By unregistered() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Login Failed\"]");
    }
    private By unregisteredLogin() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Invalid email or password\"]");
    }
    private By passwordVerification() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lain Kali\"]");
    }
    private By homepages() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selamat Pagi\"]");
    }

    String email = "wiyanalta@gmail.com";
    String emailIncorrect = "wiyan.com";
    String emailUnregister = "wiyan@alta.com";
    String password = "@123Alta";
    String passwordIncorrect = "Alta123";

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
    public By fillIncorrectEmailField() {
        onClick(emailField());
        waitUntilPresence(emailField()).sendKeys(emailIncorrect);
        return null;
    }
    @Step
    public void fillUnregisterEmailField() {
        onClick(emailField());
        waitUntilPresence(emailField()).sendKeys(emailUnregister);
    }
    @Step
    public void fieldEmailEmpty() {
        onClick(emailField());
    }
    @Step
    public void verifyEmailEmpty() {
        Assert.assertTrue(waitUntilVisible(withoutEmail()).isDisplayed());
    }
    @Step
    public void invalidEmail() {
        Assert.assertTrue(waitUntilVisible(emailInvalid()).isDisplayed());
    }
    @Step
    public void fillPasswordField() {
        onClick(passwordField());
        waitUntilPresence(passwordField()).sendKeys(password);
    }
    @Step
    public By fillIncorrectPasswordField() {
        onClick(passwordField());
        waitUntilPresence(passwordField()).sendKeys(passwordIncorrect);
        return null;
    }
    @Step
    public void fieldPasswordEmpty() {
        onClick(passwordField());
    }
    @Step
    public void verifyPasswordEmpty() {
        Assert.assertTrue(waitUntilVisible(withoutPassword()).isDisplayed());
    }
    @Step
    public void loginButton() {
        onClick(buttonLogin());
    }
    @Step
    public void failedLogin() {
        onClick(unregistered());
    }
    @Step
    public void invalidLogin() {
        onClick(unregisteredLogin());
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
    public boolean isEmailFieldEmpty() {
        return waitUntilVisible(emailField()).getText().isEmpty();
    }
    @Step
    public boolean isPasswordFieldEmpty() {
        return waitUntilVisible(passwordField()).getText().isEmpty();
    }
    @Step
    public boolean isEmailIncorrect() {
        // Lakukan pengecekan apakah pesan error "Email tidak valid" muncul di halaman
        return waitUntilVisible(emailField()).getText().isEmpty();
    }
    @Step
    public boolean isPasswordIncorrect() {
        // Lakukan pengecekan apakah pesan error "Password tidak valid" muncul di halaman
        return waitUntilVisible(passwordField()).getText().isEmpty();
    }
    @Step
    public boolean isFailedLogin() {
        // Lakukan pengecekan apakah pesan error "Login Failed" muncul di halaman
        return waitUntilVisible(unregistered()).isDisplayed();
    }
}