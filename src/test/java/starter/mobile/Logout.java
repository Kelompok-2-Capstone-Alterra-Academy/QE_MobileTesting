package starter.mobile;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import automation.pageobject.BasePageObject;

public class Logout extends BasePageObject {

    private By accountButton() {
        return MobileBy.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
//        return AppiumBy.id("//android.view.View[@content-desc=\"Akun Tab 5 of 5\"]");
    }
    private By logoutButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Keluar\"]");
    }
    @Step("Given I already on the home page")
    public void onTheHomepage(){

    }

    @Step("I click account button")
    public void clickAccountButton() {
        waitUntilPresence(accountButton());
        onClick(accountButton());
    }
    @Step("I click logout button")
    public void clickLogoutButton() {
        waitUntilPresence(logoutButton());
        onClick(logoutButton());
    }
}
