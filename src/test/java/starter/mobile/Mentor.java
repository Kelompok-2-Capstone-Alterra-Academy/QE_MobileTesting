package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Mentor extends BasePageObject {

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
    private By buttonChat() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Chat\n" +
                "Tab 3 of 5\"]");
    }
    private By iconSearch() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By iconSearch2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
    }
    private By iconSearch3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By iconSearch4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By search() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By search2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By search3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By search4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By whatsappMentor() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Alejandro Garnacho\n" +
                "react\"]/android.widget.ImageView[2]");
    }
    private By buttonCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kursus\n" +
                "Tab 2 of 5\"]");

    }
    private By eiterCourses() {
        return MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Kursus Baru !\n" +
                "0\n" +
                " %\"])[1]");
    }
    private By buttonAskMentorThroughCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Tanya Mentor\"]");
    }
    private By video() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Video 1 \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By material() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"03\n" +
                "Materi Slide 1 \n" +
                "Materi\n" +
                "14 Slides\n" +
                "Belum Selesai\"]");
    }
    private By buttonAskMentorThroughLearningVideo() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Tanya Mentor\"]");
    }
    private By buttonAskMentorThroughLearningMaterial() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Tanya Mentor\"]");
    }
    private By seeAllMentor() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[1]");
    }
    private By mentor() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Alejandro Garnacho\n" +
                "react\"]");
    }
    private By back() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By mentorList() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"List Mentor\"]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@123Alta";
    String mentor = "Alejandro Garnacho";

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
    public void chatButton() {
        onClick(buttonChat());
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
    public void askMentorButtonCourse() {
        onClick(buttonAskMentorThroughCourses());
    }
    @Step
    public void clickVideo() {
        onClick(video());
    }
    @Step
    public void clickMaterial() {
        onClick(material());
    }
    @Step
    public void askMentorButtonVideo() {
        onClick(buttonAskMentorThroughLearningVideo());
    }
    @Step
    public void askMentorButtonMaterial() {
        onClick(buttonAskMentorThroughLearningMaterial());
    }
    @Step
    public void searchMentor() {
        onClick(iconSearch());
        onClick(search());
        waitUntilPresence(search()).sendKeys(mentor);
    }
    @Step
    public void searchMentor2() {
        onClick(iconSearch2());
        onClick(search());
        waitUntilPresence(search2()).sendKeys(mentor);
    }
    @Step
    public void searchMentor3() {
        onClick(iconSearch3());
        onClick(search());
        waitUntilPresence(search2()).sendKeys(mentor);
    }
    @Step
    public void searchMentor4() {
        onClick(iconSearch4());
        onClick(search());
        waitUntilPresence(search2()).sendKeys(mentor);
    }
    @Step
    public void contactMentor() {
        onClick(whatsappMentor());
    }
    @Step
    public void seeAllBestMentor() {
        scrollDown();
        scrollDown();
        onClick(seeAllMentor());
    }
    @Step
    public void eitherBestMentor() {
        onClick(mentor());
    }
    @Step
    public void backHomepage() {
        onClick(back());
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
    public void listMentor() {
        onClick(mentorList());
    }
}
