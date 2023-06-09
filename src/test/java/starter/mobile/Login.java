package starter.mobile;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.remote.MobileBrowserType;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import automation.pageobject.BasePageObject;

import java.util.Locale;

public class Login extends BasePageObject {

    private By loginPage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Masuk ke Akun\"]");
    }
    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    private By verifyPassword() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lain Kali\"]");
    }
    private By homepage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selamat Pagi\"]");
    }
    private By profile(){
//        return MobileBy.xpath("//android.view.View[@content-desc=\"Akun\n" +
//                "Tab 5 of 5\"]");
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
    }
    private By logout() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Keluar\"]");
    }

    Faker faker = new Faker(new Locale("in-ID"));
    String email = "wiyanalta@gmail.com";
    String password = "@Alta123";

    @Step("I am in the login page")
    public void inTheLoginPage() {
        waitUntilPresence(loginPage());

    }
    @Step("I fill email field to login")
    public void fillEmailFieldToLogin() {
        onClick(emailField());
        waitUntilPresence(emailField()).sendKeys(email);
    }
    @Step("I fill password field to login")
    public void fillPasswordFieldToLogin() {
        onClick(passwordField());
        waitUntilPresence(passwordField()).sendKeys(password);
    }
    @Step("I click login button")
    public void clickLoginButton() {
        onClick(loginButton());

    }
    @Step("I verify save to password")
    public void verifySaveToPassword() {
        onClick(verifyPassword());
    }
    @Step("Redirect in the homepage")
    public void redirectInTheHomepage() {
        onClick(homepage());
        onClick(profile());
        onClick(logout());
    }
}
