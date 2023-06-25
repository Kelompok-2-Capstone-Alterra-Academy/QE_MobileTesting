package starter.mobile;

import automation.pageobject.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Module extends BasePageObject {

    //Login
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

    //Take Courses
    private By viewAll() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Lihat Semua\"])[1]");
    }
    private By courses() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Rp. 100.000\n" +
                "0.0\n" +
                "|\n" +
                "9 Siswa\"]");
    }
    private By buttonTakeCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ambil Kursus\"]");
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
    private By backHistory() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    //Bottom
    private By buttonCourses() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kursus\n" +
                "Tab 2 of 5\"]");
    }

    //My Course
    private By eiterCourses() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Kursus Baru !\n" +
                "0\n" +
                " %\"]");
    }
    private By buttonModul() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Modul\n" +
                "Tab 1 of 2\"]");
    }

    //Materi 1
    private By video1() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Video 1 \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By selesaiButton1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By tugas1() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"02\n" +
                "Materi Materi 1\n" +
                "Tugas\n" +
                "Essay\n" +
                "Belum Selesai\"]");
    }
    private By kumpulkanTugas1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kumpulkan Tugas\"]");
    }
    private By pilihFile1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih File\"]");
    }
    private By izinAkses1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    }
    private By fileTugas1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    }
    private By catatatTugas1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    }
    private By buttonSubmit1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    }
    private By suksesUploadTugas1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kursus Saya\"]");
    }
    private By halamanKursusSaya1() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Section \n" +
                "2\n" +
                "/\n" +
                "12\n" +
                "16\n" +
                " %\"]");
    }
    private By materi1() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"03\n" +
                "Materi Slide 1 \n" +
                "Materi\n" +
                "14 Slides\n" +
                "Belum Selesai\"]");
    }
    private By selesaiButton2() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }

    //Materi 2
    private By video2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Video 2 \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By selesaiButton3() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By tugas2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"02\n" +
                "Materi Materi 2\n" +
                "Tugas\n" +
                "Essay\n" +
                "Belum Selesai\"]");
    }
    private By kumpulkanTugas2() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kumpulkan Tugas\"]");
    }
    private By pilihFile2() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih File\"]");
    }
    private By izinAkses2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    }
    private By fileTugas2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    }
    private By catatatTugas2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    }
    private By buttonSubmit2() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    }
    private By suksesUploadTugas2() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kursus Saya\"]");
    }
    private By halamanKursusSaya2() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Section \n" +
                "5\n" +
                "/\n" +
                "12\n" +
                "41\n" +
                " %\"]");
    }
    private By tugas3() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"03\n" +
                "Materi Materi 8\n" +
                "Tugas\n" +
                "Essay\n" +
                "Belum Selesai\"]");
    }
    private By kumpulkanTugas3() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kumpulkan Tugas\"]");
    }
    private By pilihFile3() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih File\"]");
    }
    private By izinAkses3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    }
    private By fileTugas3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    }
    private By catatatTugas3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    }
    private By buttonSubmit3() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    }
    private By suksesUploadTugas3() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kursus Saya\"]");
    }
    private By halamanKursusSaya3() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Section \n" +
                "6\n" +
                "/\n" +
                "12\n" +
                "50\n" +
                " %\"]");
    }

    //Materi 3
    private By video3() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"01\n" +
                "Materi Video 3 \n" +
                "Video\n" +
                "15 menit\n" +
                "Belum Selesai\"]");
    }
    private By selesaiButton4() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By tugas4() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"02\n" +
                "Materi Materi 3\n" +
                "Tugas\n" +
                "Essay\n" +
                "Belum Selesai\"]");
    }
    private By kumpulkanTugas4() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kumpulkan Tugas\"]");
    }
    private By pilihFile4() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih File\"]");
    }
    private By izinAkses4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    }
    private By fileTugas4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    }
    private By catatatTugas4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    }
    private By buttonSubmit4() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    }
    private By suksesUploadTugas4() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kursus Saya\"]");
    }
    private By halamanKursusSaya4() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Section \n" +
                "8\n" +
                "/\n" +
                "12\n" +
                "66\n" +
                " %\"]");
    }
    private By materi2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"03\n" +
                "Materi Slide 2 \n" +
                "Materi\n" +
                "14 Slides\n" +
                "Belum Selesai\"]");
    }
    private By selesaiButton5() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }

    //Quiz 1
    private By buttonQuiz() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz\"]");
    }
    private By quiz1() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz 4 - Dasar-Dasar Golang\n" +
                "100 Point\"]");
    }

    //Quiz 2
    private By quiz2() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz 4 - Golang Intermediate\n" +
                "100 Point\"]");
    }

    //Quiz 3
    private By quiz3() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz 4 - Golang Advance\n" +
                "100 Point\"]");
    }

    //Answer Quiz
    private By answersQuiz1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View/android.widget.RadioButton");
    }
    private By answersQuiz2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.RadioButton");
    }
    private By answersQuiz3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.RadioButton");
    }
    private By submitGform() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.Button[1]");
    }
    private By scoreQuiz() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Lihat skor\"]/android.view.View");
    }
    private By buttonFinishQuiz() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selesai\"]");
    }
    private By buttonNextQuiz() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Quiz Selanjutnya\"]");
    }

    //Give Rating and Review
    private By rating1() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
    }
    private By rating2() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]");
    }
    private By rating3() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]");
    }
    private By rating4() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5]");
    }
    private By rating5() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]");
    }
    private By review() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText");
    }
    private By buttonSubmitReview() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kirim Ulasan\"]");
    }
    private By ulasanTerekam() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ulasanmu Sudah Terekam\"]");
    }

    //Detail Finish Courses
    private By sectionFinish() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selesai\n" +
                "Tab 2 of 2\"]");
    }
    private By coursesDetail() {
        return MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Golang\n" +
                "Nilai : \n" +
                "0\n" +
                "Mendapat Sertifikat\n" +
                "100%\"])[1]");
    }
    private By sectionCertificate() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Sertifikat\n" +
                "Tab 2 of 2\"]");
    }
    private By buttonDownload() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Unduh Sertifikat\"]");
    }

    String email = "wiyanalta@gmail.com";
    String password = "@Alta123";
    String noteAssignment = "Tugas Testing Automation";
    String review = "Material provided is very useful";
    String pin = "654321";

    //Login
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

    //Take Courses
    @Step
    public void seeAll() {
        onClick(viewAll());
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
    public void backToHistoryTransaction() {
        onClick(backHistory());
    }

    //Bottom
    @Step
    public void coursesButton() {
        onClick(buttonCourses());
    }

    //My Course
    @Step
    public void clickCourse() {
        onClick(eiterCourses());
    }
    @Step
    public void modulButton() {
        onClick(buttonModul());
    }

    //Materi 1
    @Step
    public void materialVideo1() {
        onClick(video1());
    }
    @Step
    public void finishButton1() {
        onClick(selesaiButton1());
    }
    @Step
    public void assignment1() {
        onClick(tugas1());
    }
    @Step
    public void collectTasks1() {
        onClick(kumpulkanTugas1());
    }
    @Step
    public void selectFile1() {
        onClick(pilihFile1());
    }
    @Step
    public void allowAccess1() {
        onClick(izinAkses1());
    }
    @Step
    public void assignmentFile1() {
        onClick(fileTugas1());
    }
    @Step
    public void noteAssignment1() {
        onClick(catatatTugas1());
        waitUntilPresence(catatatTugas1()).sendKeys(noteAssignment);
    }
    @Step
    public void submitButton1() {
        onClick(buttonSubmit1());
    }
    @Step
    public void assignmentSuccess1() {
        onClick(suksesUploadTugas1());
    }
    @Step
    public void myCoursePage1() {
        onClick(halamanKursusSaya1());
    }
    @Step
    public void material1() {
        onClick(materi1());
    }
    @Step
    public void finishButton2() {
        onClick(selesaiButton2());
    }

    //Materi 2
    @Step
    public void materialVideo2() {
        onClick(video2());
    }
    @Step
    public void finishButton3() {
        onClick(selesaiButton3());
    }
    @Step
    public void assignment2() {
        onClick(tugas2());
    }
    @Step
    public void collectTasks2() {
        onClick(kumpulkanTugas2());
    }
    @Step
    public void selectFile2() {
        onClick(pilihFile2());
    }
    @Step
    public void allowAccess2() {
        onClick(izinAkses2());
    }
    @Step
    public void assignmentFile2() {
        onClick(fileTugas2());
    }
    @Step
    public void noteAssignment2() {
        onClick(catatatTugas2());
        waitUntilPresence(catatatTugas2()).sendKeys(noteAssignment);
    }
    @Step
    public void submitButton2() {
        onClick(buttonSubmit2());
    }
    @Step
    public void assignmentSuccess2() {
        onClick(suksesUploadTugas2());
    }
    @Step
    public void myCoursePage2() {
        onClick(halamanKursusSaya2());
    }
    @Step
    public void assignment3() {
        onClick(tugas3());
    }
    @Step
    public void collectTasks3() {
        onClick(kumpulkanTugas3());
    }
    @Step
    public void selectFile3() {
        onClick(pilihFile3());
    }
    @Step
    public void allowAccess3() {
        onClick(izinAkses3());
    }
    @Step
    public void assignmentFile3() {
        onClick(fileTugas3());
    }
    @Step
    public void noteAssignment3() {
        onClick(catatatTugas3());
        waitUntilPresence(catatatTugas3()).sendKeys(noteAssignment);
    }
    @Step
    public void submitButton3() {
        onClick(buttonSubmit3());
    }
    @Step
    public void assignmentSuccess3() {
        onClick(suksesUploadTugas3());
    }
    @Step
    public void myCoursePage3() {
        onClick(halamanKursusSaya3());
    }
    @Step
    public void materialVideo3() {
        onClick(video3());
    }
    @Step
    public void finishButton4() {
        onClick(selesaiButton4());
    }
    @Step
    public void assignment4() {
        scrollDown();
        onClick(tugas4());
    }
    @Step
    public void collectTasks4() {
        onClick(kumpulkanTugas4());
    }
    @Step
    public void selectFile4() {
        onClick(pilihFile4());
    }
    @Step
    public void allowAccess4() {
        onClick(izinAkses4());
    }
    @Step
    public void assignmentFile4() {
        onClick(fileTugas4());
    }
    @Step
    public void noteAssignment4() {
        onClick(catatatTugas4());
        waitUntilPresence(catatatTugas4()).sendKeys(noteAssignment);
    }
    @Step
    public void submitButton4() {
        onClick(buttonSubmit4());
    }
    @Step
    public void assignmentSuccess4() {
        onClick(suksesUploadTugas4());
    }
    @Step
    public void myCoursePage4() {
        onClick(halamanKursusSaya4());
    }
    @Step
    public void material2() {
        scrollDown();
        onClick(materi2());
    }
    @Step
    public void finishButton5() {
        onClick(selesaiButton5());
    }

    //Quiz 1
    @Step
    public void quizButton() {
        onClick(buttonQuiz());
    }
    @Step
    public void chooseQuiz1() {
        onClick(quiz1());
    }

    //Quiz 2
    @Step
    public void chooseQuiz2() {
        onClick(quiz2());
    }

    //Quiz 3
    @Step
    public void chooseQuiz3() {
        onClick(quiz3());
    }

    //Answer Quiz
    @Step
    public void answersQuestion1() {
        onClick(answersQuiz1());
    }
    @Step
    public void answersQuestion2() {
        scrollDown();
        onClick(answersQuiz2());
    }
    @Step
    public void answersQuestion3() {
        scrollDown();
        scrollDown();
        onClick(answersQuiz3());
    }
    @Step
    public void submitQuiz() {
        scrollDown();
        onClick(submitGform());
    }
    @Step
    public void viewScore() {
        onClick(scoreQuiz());
    }
    @Step
    public void finishButton() {
        onClick(buttonFinishQuiz());
    }
    @Step
    public void nextQuizButton() {
        onClick(buttonNextQuiz());
    }

    //Give Rating and Review
    @Step
    public void giveRating1() {
        onClick(rating1());
    }
    @Step
    public void giveRating2() {
        onClick(rating2());
    }
    @Step
    public void giveRating3() {
        onClick(rating3());
    }
    @Step
    public void giveRating4() {
        onClick(rating4());
    }
    @Step
    public void giveRating5() {
        onClick(rating5());
    }
    @Step
    public void fillReview() {
        onClick(review());
        waitUntilPresence(review()).sendKeys(review);
    }
    @Step
    public void submitReviewButton() {
        onClick(buttonSubmitReview());
    }
    @Step
    public void recordedReview() {
        onClick(ulasanTerekam());
    }

    //Detail Finish Courses
    @Step
    public void finishSection() {
        onClick(sectionFinish());
    }
    @Step
    public void detailFinishedCourses() {
        onClick(coursesDetail());
    }
    @Step
    public void certificateSection() {
        onClick(sectionCertificate());
    }
    @Step
    public void clickDownloadCertificateButton() {
        waitUntilClickable(buttonDownload());
        onClick(buttonDownload());
    }

    //Scroll Down
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