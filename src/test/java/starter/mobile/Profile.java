package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Profile extends BasePageObject {

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
    private By buttonProfile() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
    }
    private By arrowBack() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By accountButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Akun\n" +
                "Tab 5 of 5\"]");
    }
    private By buttonEditProfile() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]");
    }
    private By fullNameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    private By birthOfDate() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By cityOfOriginField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
    }
    private By numberPhoneField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[4]");
    }
    private By gander() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[5]");
    }
    private By levelClassField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[6]");
    }
    private By nameSchoolField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[7]");
    }
    private By majorField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[8]");
    }
    private By buttonSaveChange() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Simpan Perubahan\"]");
    }
    private By profile() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
    }
    private By photo() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@Alta123";
    String fullname = "Wiyan H.H.";
    String fullnameEmpty = "";
    String hometown = "Semarang";
    String hometownLengthLessThan5 = "SMG";
    String telephoneNumber = "081462484322";
    String telephonenNumberLengthLessThan10 = "082234842";
    String telephoneNumberEmpty = "";
    String levelClass = "11";
    String levelClassWithText = "sebelas";
    String schoolName = "SMAN 1 Semarang";
    String major = "IPA";
    String gander = "Male";
    String birthOfDate = "10-02-2002";

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
    public void topRightCorner() {
        onClick(buttonProfile());
    }
    @Step
    public void backArrowHomepage() {
        onClick(arrowBack());
    }
    @Step
    public void bottomRightCorner() {
        onClick(accountButton());
    }
    @Step
    public void editProfileButton() {
        onClick(buttonEditProfile());
    }
    @Step
    public void changeFullNameField() {
        onClick(fullNameField());
        waitUntilPresence(fullNameField()).clear();
        waitUntilPresence(fullNameField()).sendKeys(fullname);
    }
    @Step
    public void changeFullNameWithEmpty() {
        onClick(fullNameField());
        waitUntilPresence(fullNameField()).clear();
        waitUntilPresence(fullNameField()).sendKeys(fullnameEmpty);
    }
    @Step
    public void fillHometownField() {
        onClick(cityOfOriginField());
        waitUntilPresence(cityOfOriginField()).clear();
        waitUntilPresence(cityOfOriginField()).sendKeys(hometown);
    }
    @Step
    public void fillHometownWithLengthLessThat5() {
        onClick(cityOfOriginField());
        waitUntilPresence(cityOfOriginField()).clear();
        waitUntilPresence(cityOfOriginField()).sendKeys(hometownLengthLessThan5);
    }
    @Step
    public void changeTelephoneNumberField() {
        onClick(numberPhoneField());
        waitUntilPresence(numberPhoneField()).clear();
        waitUntilPresence(numberPhoneField()).sendKeys(telephoneNumber);
    }
    @Step
    public void changeTelephoneNumberWithLengthLessThat10() {
        onClick(numberPhoneField());
        waitUntilPresence(numberPhoneField()).clear();
        waitUntilPresence(numberPhoneField()).sendKeys(telephonenNumberLengthLessThan10);
    }
    @Step
    public void changeTelephoneNumberWithEmpty() {
        onClick(numberPhoneField());
        waitUntilPresence(numberPhoneField()).clear();
        waitUntilPresence(numberPhoneField()).sendKeys(telephoneNumberEmpty);
    }
    @Step
    public void fillSchoolNameField() {
        onClick(nameSchoolField());
        waitUntilPresence(nameSchoolField()).clear();
        waitUntilPresence(nameSchoolField()).sendKeys(schoolName);
    }
    @Step
    public void fillClassLevelField() {
        onClick(levelClassField());
        waitUntilPresence(levelClassField()).clear();
        waitUntilPresence(levelClassField()).sendKeys(levelClass);
    }
    @Step
    public void fillClassLevelWithText() {
        onClick(levelClassField());
        waitUntilPresence(levelClassField()).clear();
        waitUntilPresence(levelClassField()).sendKeys(levelClassWithText);
    }
    @Step
    public void fillMajorField() {
        onClick(majorField());
        waitUntilPresence(majorField()).clear();
        waitUntilPresence(majorField()).sendKeys(major);
    }
    @Step
    public void selectGander() {
        onClick(gander());
        waitUntilPresence(gander()).clear();
        waitUntilPresence(gander()).sendKeys(gander);
    }
    @Step
    public void fillBirthOfDate() {
        onClick(birthOfDate());
        waitUntilPresence(birthOfDate()).clear();
        waitUntilPresence(birthOfDate()).sendKeys(birthOfDate);
    }
    @Step
    public void saveChangeButton() {
        onClick(buttonSaveChange());
    }
    @Step
    public void changeProfile() {
        onClick(profile());
    }
    @Step
    public void selectPhoto() {
        onClick(photo());
    }
}
