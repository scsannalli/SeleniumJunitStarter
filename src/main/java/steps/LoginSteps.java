package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import util.DriverManager;

public class LoginSteps {

    LoginPage loginPage;
    HomePage homePage;
    WebDriver webdriver;

    public LoginSteps()
    {
        DriverManager driverManager = new DriverManager();
        loginPage = PageFactory.initElements(DriverManager.driver, LoginPage.class);
        homePage = PageFactory.initElements(DriverManager.driver, HomePage.class);
    }

    public String loginWithCreds(String user, String pass) {
        homePage.clickOnLogin();
        loginPage.login(user, pass);
        return homePage.logoutLinkText();
    }
}
