package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TakeCourse extends BasePageObject {

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
    private By viewAll() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[1]");
    }
    private By classAndMajor() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pilih Kelas\"]");
    }
    private By selectClass() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kelas 12\"]");
    }
    private By selectMajor() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"IPA\"]");
    }
    private By buttonSave() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Simpan\"]");
    }
    private By courses() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Matematika\n" +
                "Rp. 750.000\n" +
                "4.8\n" +
                "|\n" +
                "8950 Siswa\"]");
    }
    private By buttonTakeCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ambil Kursus\"]");
    }
    private By buttonCheckout() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Checkout\"]");
    }
    private By modul() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lihat Modul\"]");
    }
    private By historyTransaction() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Riwayat Transaksi\"]");
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
    public void seeAll() {
        onClick(viewAll());
    }
    @Step
    public void chooseClassAndMajor() {
        onClick(classAndMajor());
    }
    @Step
    public void chooseClass() {
        onClick(selectClass());
    }
    @Step
    public void chooseMajor() {
        onClick(selectMajor());
    }
    @Step
    public void saveButton() {
        onClick(buttonSave());
    }
    @Step
    public void eitherOfCourses() {
        onClick(courses());
    }
    @Step
    public void takeCoursesButton() {
        onClick(buttonTakeCourses());
    }
    @Step
    public void checkoutButton() {
        onClick(buttonCheckout());
    }
    @Step
    public void viewModul() {
        onClick(modul());
    }
    @Step
    public void viewHistoryTransaction() {
        onClick(historyTransaction());
    }


}
