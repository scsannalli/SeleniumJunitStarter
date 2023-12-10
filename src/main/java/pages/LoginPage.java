package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "spree_user_email")
    WebElement emailInput;

    @FindBy(id = "spree_user_password")
    WebElement pwdInput;

    @FindBy(name = "commit")
    WebElement loginButton;

    public void login(String user, String pass) {
        emailInput.sendKeys(user);
        pwdInput.sendKeys(pass);
        loginButton.submit();
    }


}
