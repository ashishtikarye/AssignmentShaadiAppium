package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashboardActivity extends AbstractPage {

    @AndroidFindBy(id = "com.shaadi.android:id/imageView_single_photo")
    private AndroidElement photo;

    @AndroidFindBy(id = "com.shaadi.android:id/rlMyShaadi")
    private AndroidElement shadiHome;

    public DashboardActivity(AndroidDriver<AndroidElement> driver) throws IOException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void navigateShadiHome() throws IOException {
        waitUntilVsibilityOfDOMelelemt(By.id("com.shaadi.android:id/imageView_single_photo"));
        clickOnElement(shadiHome);
    }
}
