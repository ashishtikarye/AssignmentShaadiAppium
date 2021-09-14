package PageObjects;

import Helper.PropertiesReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public abstract class AbstractPage {
    protected static AndroidDriver<AndroidElement> driver;
    protected WebDriverWait wait;
    PropertiesReader propertiesReader;

    public AbstractPage(AndroidDriver<AndroidElement> driver) throws IOException {
        AbstractPage.driver = driver;
        propertiesReader=new PropertiesReader();
        wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }

    public void waitUntilVsibilityOfDOMelelemt(By locator) throws IOException {
        wait = new WebDriverWait(driver, propertiesReader.getTimeout());
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickOnElement(AndroidElement element) {
        element.click();
    }

    public void sendKeysToElement(AndroidElement element, String text) {
        element.sendKeys(text);
    }

    public String getTextFromElement(AndroidElement element) {
        return element.getText().trim();
    }
    public boolean getRadioButtonStatus(MobileElement element) {
        return element.isSelected();
    }
}
