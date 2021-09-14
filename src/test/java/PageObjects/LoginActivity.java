package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginActivity extends AbstractPage {


    @AndroidFindBy(id = "com.shaadi.android:id/edt_username")
    private AndroidElement email;
    @AndroidFindBy(id = "com.shaadi.android:id/edt_password")
    private AndroidElement password;
    @AndroidFindBy(id = "com.shaadi.android:id/btn_login")
    private AndroidElement login;


    public LoginActivity(AndroidDriver<AndroidElement> driver) throws IOException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void loginToApp(String strEmailId, String strPassword) throws IOException {
        waitUntilVsibilityOfDOMelelemt(By.id("com.shaadi.android:id/edt_username"));
        sendKeysToElement(email, strEmailId);
        sendKeysToElement(password, strPassword);
        clickOnElement(login);
    }
}
