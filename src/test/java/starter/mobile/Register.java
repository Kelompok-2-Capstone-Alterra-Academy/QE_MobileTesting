package starter.mobile;//package starter.mobile;
//
//import com.github.javafaker.Faker;
//import io.appium.java_client.MobileBy;
//import net.thucydides.core.annotations.Step;
//import org.openqa.selenium.By;
//import automation.pageobject.BasePageObject;
//
//import java.util.Locale;
//
//public class Register extends BasePageObject {
//
//    private By loginPage() {
//        return MobileBy.xpath("//android.view.View[@content-desc=\"Masuk ke Akun\"]");
//    }
//    private By registerText() {
//        return MobileBy.xpath("//android.view.View[@content-desc=\"  Daftar\"]");
//    }
//    private By fullNameField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
//    }
//    private By emailField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
//    }
//    private By phoneNumberField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
//    }
//    private By passwordField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]");
//    }
//    private By rePasswordField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]");
//    }
//    private By nextButton() {
//        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lanjut\"]");
//    }
//    private By firstOTPField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
//    }
//    private By secondOTPField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
//    }
//    private By thirdOTPField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
//    }
//    private By fourthOTPField() {
//        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]");
//    }
//    private By accountVerificationButton() {
//        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Verifikasi Akun\"]");
//    }
//    private By homepage() {
//        return MobileBy.xpath("");
//    }
//
//    Faker faker = new Faker(new Locale("in-ID"));
//    String firstName= faker.name().firstName();
//    String lastName= faker.name().lastName();
//    String fullname = String.format("%s %s",firstName, lastName);
//    String email = String.format("%s.%s@email.com",firstName,lastName);
//
//    String phonenumber = "082345678901";
//    String password = "@Password123";
//
//    @Step("I am on the login page")
//    public void onTheLoginPage() {
//        waitUntilPresence(loginPage());
//    }
//    @Step("I click register text")
//    public void clickRegisterText() {
//        onClick(registerText());
//    }
//    @Step("I fill full name field")
//    public void fillFullNameField() {
//        onClick(fullNameField());
//        waitUntilPresence(fullNameField()).sendKeys(fullname);
//    }
//    @Step("I fill email field")
//    public void fillEmailField() {
//        onClick(emailField());
//        waitUntilPresence(emailField()).sendKeys(email);
//    }
//    @Step("I fill phone number field")
//    public void fillPhoneNumberField() {
//        onClick(phoneNumberField());
//        waitUntilPresence(phoneNumberField()).sendKeys((CharSequence) phonenumber);
//    }
//    @Step("I fill password field")
//    public void fillPasswordField() {
//        onClick(passwordField());
//        waitUntilPresence(passwordField()).sendKeys(password);
//
//    }
//    @Step("I fill re-password field")
//    public void fillRePasswordField() {
//        onClick(rePasswordField());
//        waitUntilPresence(rePasswordField()).sendKeys(password);
//    }
//    @Step("I click next button")
//    public void clickNextButton() {
//        onClick(nextButton());
//    }
//
//    @Step("I enter code OTP")
//    public void enterCodeOTP() {
//        onClick(firstOTPField());
//        waitUntilPresence(firstOTPField()).sendKeys("1");
//        onClick(secondOTPField());
//        waitUntilPresence(secondOTPField()).sendKeys("2");
//        onClick(thirdOTPField());
//        waitUntilPresence(thirdOTPField()).sendKeys("3");
//        onClick(fourthOTPField());
//        waitUntilPresence(fourthOTPField()).sendKeys("4");
//
//    }
//    @Step("I click Account Verification button")
//    public void clickAccountVerificationButton() {
//        onClick(accountVerificationButton());
//    }
//    @Step("Redirect to homepage")
//    public void redirectToHomepage() {
//
//    }
//
//}
