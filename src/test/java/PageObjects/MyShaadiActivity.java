package PageObjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.time.Duration;

public class MyShaadiActivity extends AbstractPage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Premium Matches')]")
    protected AndroidElement premiumMatches;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'New Matches')]")
    protected AndroidElement newMatches;

    @AndroidFindBy(id = "com.shaadi.android:id/lblConnect")
    protected AndroidElement connectTo;

    public MyShaadiActivity(AndroidDriver<AndroidElement> driver) throws IOException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void verifyMyWidgets() throws IOException {
        waitUntilVsibilityOfDOMelelemt(By.xpath("//*[contains(@text,'Premium Matches')]"));
        System.out.println("premMatch-"+premiumMatches.getText().trim());
        Assert.assertTrue(premiumMatches.getText().trim().contains("Premium Matches"));
        /*scroll*/
        Dimension dm = driver.manage().window().getSize();
        int s_x = (int) (dm.width * 0.5);
        int s_y = (int) (dm.width * 0.8);
        int e_x = (int) (dm.width * 0.2);
        int e_y = (int) (dm.width * 0.2);
        TouchAction actionT = new TouchAction(driver);
        actionT.press(PointOption.point(s_x, s_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(e_x, e_y)).release().perform();
        waitUntilVsibilityOfDOMelelemt(By.xpath("//*[contains(@text,'New Matches')]"));
        Assert.assertTrue(newMatches.getText().trim().contains("New Matches"));
    }

    public void connectToProfile() throws IOException {
        waitUntilVsibilityOfDOMelelemt(By.xpath("com.shaadi.android:id/lblConnect"));
        clickOnElement(connectTo);
    }
}
