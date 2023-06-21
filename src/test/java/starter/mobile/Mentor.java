package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Mentor extends BasePageObject {

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
    private By search() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }
    private By whatsappMentor() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Bambang mentor\n" +
                "react\"]/android.widget.ImageView[2]");
    }
    private By buttonCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kursus\n" +
                "Tab 2 of 5\"]");
    }
    private By eiterCourses() {
//        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Matematika Dasar\n" +
//                "Section \n" +
//                "9\n" +
//                "/\n" +
//                "11\n" +
//                "80\n" +
//                " %\"]");
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Tes\n" +
                "Section \n" +
                "9\n" +
                "/\n" +
                "11\n" +
                "0\n" +
                " %\"]");
    }
    private By buttonAskMentorThroughCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Tanya Mentor\"]");
    }
    private By video() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Matematika Dasar \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By buttonAskMentorThroughLearningVideo() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Tanya Mentor\"]");
    }
    private By seeAllMentor() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[2]");
    }
    private By mentor() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Bambang mentor\n" +
                "react\"]");
    }
    private By back() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    String email = "jono@gmail.com";
    String password = "newpassword";
    String mentor = "Bambang mentor";

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
    public void askedMentorButton() {
        onClick(buttonAskMentorThroughCourses());
    }
    @Step
    public void clickVideo() {
        onClick(video());
    }
    @Step
    public void askMentorButton() {
        onClick(buttonAskMentorThroughLearningVideo());
    }
    @Step
    public void searchMentor() {
        onClick(iconSearch());
        onClick(search());
        waitUntilPresence(search()).sendKeys(mentor);
    }
    @Step
    public void contactMentor() {
        onClick(whatsappMentor());
    }
    @Step
    public void seeAllBestMentor() {
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
}
