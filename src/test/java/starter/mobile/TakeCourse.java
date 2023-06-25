package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TakeCourse extends BasePageObject {

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
    private By viewAll() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[1]");
//        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[3]");
    }
    private By classAndMajor() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pilih Kelas\"]");
    }
    private By selectClass() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kelas 10\"]");
    }
    private By selectMajor() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"RPL\"]");
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
                "Dapatkan Potongan Hingga 90%\n" +
                "Klaim Promo\"]");
    }
    private By promo2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Hemat\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "Dapatkan Potongan Hingga 50%\n" +
                "Klaim Promo\"]");
    }
    private By promo3() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Belajar\n" +
                "Masa Berlaku:  \n" +
                "2023-09-30\n" +
                "Dapatkan Potongan Hingga 25%\n" +
                "Klaim Promo\"]");
    }
    private By promo4() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Ekonomis\n" +
                "Masa Berlaku:  \n" +
                "2023-10-31\n" +
                "Dapatkan Potongan Hingga 80%\n" +
                "Klaim Promo\"]");
    }
    private By back1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By courses() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Rp. 100.000\n" +
                "0.0\n" +
                "|\n" +
                "10 Siswa\"]");
    }
    private By seeAllPurchasedCourses() {
//        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[4]");
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[5]");
    }
    private By purchasedCourse() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Rp. 100.000\n" +
                "0.0\n" +
                "|\n" +
                "11 Siswa\"]");
    }
    private By notificationPurchase() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kamu Sudah Membeli Course Ini\"]");
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
                "Dapatkan Potongan Hingga 90%\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Hemat\n" +
                "Masa Berlaku:  \n" +
                "2023-08-31\n" +
                "Dapatkan Potongan Hingga 50%\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo3() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Belajar\n" +
                "Masa Berlaku:  \n" +
                "2023-09-30\n" +
                "Dapatkan Potongan Hingga 25%\n" +
                "Gunakan Promo Ini\"]");
    }
    private By usePromo4() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Promo Ekonomis\n" +
                "Masa Berlaku:  \n" +
                "2023-10-31\n" +
                "Dapatkan Potongan Hingga 80%\n" +
                "Gunakan Promo Ini\"]");
    }
    private By buttonCheckout() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Checkout\"]");
    }
    private By back2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
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
    private By paymentBack() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By transactionHistory() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Riwayat Transaksi\"]");
    }
    private By ereceipt() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "25 June 2023\n" +
                "success\n" +
                "E-Recipt\"]");
    }
    private By ereceipt2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "25 June 2023\n" +
                "pending\n" +
                "E-Recipt\"]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@Alta123";
    String pin = "654321";

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
    public void back() {
        onClick(back1());
    }
    @Step
    public void backWithoutPayment() {
        onClick(back2());
    }
    @Step
    public void eitherOfCourses() {
        onClick(courses());
    }
    @Step
    public void coursesPurchased() {
        onClick(purchasedCourse());
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
    public void backPayment() {
        onClick(paymentBack());
    }
    @Step
    public void historyTransaction() {
        onClick(transactionHistory());
    }
    @Step
    public void viewEReceiptSuccess() {
        onClick(ereceipt());
    }
    @Step
    public void viewEReceiptPending() {
        onClick(ereceipt2());
    }
    @Step
    public void seeAllPurchase() {
        onClick(seeAllPurchasedCourses());
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
