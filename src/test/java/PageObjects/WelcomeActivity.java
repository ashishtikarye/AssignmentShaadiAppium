package PageObjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WelcomeActivity extends AbstractPage {


    @AndroidFindBy(id = "com.shaadi.android:id/btn_morph_login")
    private AndroidElement loginLink;

    public WelcomeActivity(AndroidDriver<AndroidElement> driver) throws IOException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void gotoLoginScreen() throws IOException {
        waitUntilVsibilityOfDOMelelemt(By.id("com.shaadi.android:id/btn_morph_login"));
        clickOnElement(loginLink);
    }
}
