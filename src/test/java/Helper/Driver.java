package Helper;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {
    public AndroidDriver<AndroidElement> driver;

    public AndroidDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        dcap.setCapability("appPackage", "com.shaadi.android");
        dcap.setCapability("appActivity", ".ui.splash.SplashScreenActivity");
        dcap.setCapability("autoGrantPermissions", "true");
        driver =
                new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
        return driver;



    }


}
