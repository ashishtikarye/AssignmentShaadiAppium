package stepDefinitions;

import Helper.Driver;
import Helper.PropertiesReader;
import PageObjects.DashboardActivity;
import PageObjects.LoginActivity;
import PageObjects.MyShaadiActivity;
import PageObjects.WelcomeActivity;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

public class MyStepdefs extends Driver {

    PropertiesReader propReader;


    @Before
    public void setUp() throws MalformedURLException {
        driver = getAndroidDriver();
        propReader = new PropertiesReader();
    }


    @Given("Navigate login button to redirect login screen")
    public void redirectOnLoginScreen() throws IOException {
        WelcomeActivity welcomeActivity = new WelcomeActivity(driver);
        welcomeActivity.gotoLoginScreen();
    }


    @When("Login with {string} and {string}")
    public void loginApp(String email, String password) throws IOException {
        LoginActivity loginActivity = new LoginActivity(driver);
        loginActivity.loginToApp(email,password);
    }

    @Then("Navigate My Shaadi screen")
    public void navigateMyShaadiScreen() throws IOException {
        DashboardActivity dashboardActivity = new DashboardActivity(driver);
        dashboardActivity.navigateShadiHome();
    }

    @Then("Verify My Shaadi Widgets")
    public void verifyMyWidgets() throws IOException{
        MyShaadiActivity myShaadiActivity = new MyShaadiActivity(driver);
        myShaadiActivity.verifyMyWidgets();
    }

    @Then("Connect with candidate profile")
    public void connectWithCandidateProfile() throws IOException{
        MyShaadiActivity myShaadiActivity = new MyShaadiActivity(driver);
        myShaadiActivity.connectToProfile();
    }
}
