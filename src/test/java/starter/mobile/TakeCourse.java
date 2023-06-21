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
    private By buttonPromoClaim() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Klaim Promo\"]");
    }
    private By promo1() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Hari kemerdekaan\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "ini adalah description\n" +
                "Klaim Promo\"]");
    }
    private By promo2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Hemat\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "Klaim Promo\"]");
    }
    private By promo3() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Belajar\n" +
                "Masa Berlaku:  \n" +
                "2023-09-30\n" +
                "Klaim Promo\"]");
    }
    private By promo4() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Ekonomis\n" +
                "Masa Berlaku:  \n" +
                "2023-10-31\n" +
                "Klaim Promo\"]");
    }
    private By arrow() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By courses() {
//        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Matematika\n" +
//                "Rp. 750.000\n" +
//                "4.8\n" +
//                "|\n" +
//                "8950 Siswa\"]");
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Jangan Dihapus.\n" +
                "Rp. 780000\n" +
                "0.0\n" +
                "|\n" +
                "2 Siswa\"]");
    }
    private By buttonTakeCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ambil Kursus\"]");
    }
    private By buttonVoucher() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Gunakan Vouchermu Sekarang!\"]");
    }
    private By usePromo1() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Hari kemerdekaan\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "ini adalah description\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Hemat\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo3() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Belajar\n" +
                "Masa Berlaku:  \n" +
                "2023-09-30\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo4() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Ekonomis\n" +
                "Masa Berlaku:  \n" +
                "2023-10-31\n" +
                "Gunakan Promo Ini\"]");
    }
    private By buttonCheckout() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Checkout\"]");
    }
    private By pay() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"GoPay GoPay\"]");
    }
    private By buttonPayNow() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button");
    }
    private By pin() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[6]/android.widget.EditText");
    }
    private By buttonSubmit() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[8]/android.widget.Button");
    }
    private By success() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By modul() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lihat Modul\"]");
    }
    private By historyTransaction() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Riwayat Transaksi\"]");
    }

    String email = "jono@gmail.com";
    String password = "newpassword";
    String pin = "654321";

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
    public void claimPromoButton() {
        onClick(buttonPromoClaim());
    }
    @Step
    public void claimPromo() {
        onClick(promo1());
        onClick(promo2());
        onClick(promo3());
        onClick(promo4());
    }
    @Step
    public void arrowBack() {
        onClick(arrow());
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
    public void voucherButton() {
        onClick(buttonVoucher());
    }
    @Step
    public void addUsePromo1() {
        onClick(usePromo1());
    }
    @Step
    public void addUsePromo2() {
        onClick(usePromo2());
    }
    @Step
    public void addUsePromo3() {
        onClick(usePromo3());
    }
    @Step
    public void addUsePromo4() {
        onClick(usePromo4());
    }
    @Step
    public void checkoutButton() {
        onClick(buttonCheckout());
    }
    @Step
    public void payment() {
        onClick(pay());
    }
    @Step
    public void payNowButton() {
        onClick(buttonPayNow());
    }
    @Step
    public void fillPin() {
        onClick(pin());
        waitUntilPresence(pin()).sendKeys(pin);
    }
    @Step
    public void submitButton() {
        onClick(buttonSubmit());
    }
    @Step
    public void paymentSuccess() {
        onClick(success());
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
