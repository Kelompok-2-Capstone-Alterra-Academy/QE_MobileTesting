package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class NewsPost extends BasePageObject {

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
    private By seeAllTheNews() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[3]");
    }
    private By news() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"kumparan\n" +
                "Kumpulan Ucapan Selamat Hari Pendidikan Nasional\n" +
                "Belajar adalah hiasan dalam kemakmuran, perlindungan dalam kesulitan dan tunjangan di masa tua. Belajarlah dari masa lalu.\"]");
    }
    private By seeAllThePost() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[3]");
    }
    private By buttonExperience() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ceritakan pengalamanmu\"]");
    }
    private By experience() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By buttonSubmit() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@123Alta";
    String experience = "This course is so easy to learn";

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
    public void seeAllNews() {
        onClick(seeAllTheNews());
    }
    @Step
    public void newsEducation() {
        onClick(news());
    }
    @Step
    public void seeAllPost() {
        scrollDown();
        onClick(seeAllThePost());
    }
    @Step
    public void experienceButton() {
        onClick(buttonExperience());
    }
    @Step
    public void fillExperience() {
        onClick(experience());
        waitUntilPresence(experience()).sendKeys(experience);
    }
    @Step
    public void submitButton() {
        onClick(buttonSubmit());
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
