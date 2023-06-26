package automation.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverPool {
    public static AndroidDriver create() {
        String appiumUrl = "http://0.0.0.0:4723/wd/hub/";
        AndroidDriver driver = null;

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        caps.setCapability(MobileCapabilityType.NO_RESET, false);
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/app-release.apk");
//        caps.setCapability(String.valueOf(Setting.WAIT_FOR_IDLE_TIMEOUT), 100);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//        for CICD dont delete
//        caps.setCapability(MobileCapabilityType.UDID, "9c03b982-544d-40bb-887d-57a2144d27fb");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel XL");


//

        try {
            driver = new AndroidDriver(new URL(appiumUrl), caps);
            driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
