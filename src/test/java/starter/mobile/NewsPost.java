package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class NewsPost extends BasePageObject {

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
    private By seeAllTheNews() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[2]");
    }
    private By newsSelect() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Kumpulan Ucapan Selamat Hari Pendidikan Nasional\n" +
                "Belajar adalah hiasan dalam kemakmuran\"]");
    }
    private By educationNews() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"News\"]");
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
    private By like1() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Indra Primawan\n" +
                "20 April 2023, 12:37\n" +
                "Sangat Menyenangkan belajar di sini\n" +
                "15\n" +
                "0\"]/android.widget.Button[1]");
    }
    private By like2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kevin Sanjaya\n" +
                "23 April 2023, 12:37\n" +
                "Belajar di sini telah meningkatkan keterampilan saya secara signifikan.\n" +
                "12\n" +
                "0\"]/android.widget.Button[1]");
    }
    private By like3() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Imam Raul\n" +
                "20 April 2023, 12:37\n" +
                "Ini adalah platform yang bagus untuk belajar!\n" +
                "10\n" +
                "0\"]/android.widget.Button[1]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@123Alta";
    String experience = "This course is so easy to learn";

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
    public void seeAllNews() {
        scrollDown();
        scrollDown();
        onClick(seeAllTheNews());
    }
    @Step
    public void selectNews() {
        onClick(newsSelect());
    }
    @Step
    public void seeAllPost() {
        scrollDown();
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
    public void likePost() {
        onClick(like1());
        onClick(like2());
        onClick(like3());
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
    @Step
    public void newsEducation() {
        onClick(educationNews());
    }
}
