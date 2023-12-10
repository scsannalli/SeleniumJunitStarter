package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "link-to-login")
    WebElement loginLink;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutLink;

    public String logoutLinkText()
    {
        return logoutLink.getText();
    }
    public void clickOnLogin() {
        loginLink.click();
    }
}
