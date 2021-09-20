package info.seleniumcucumber.pages;

import info.seleniumcucumber.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class GoogleSearchPage extends AbstractPage{

    @FindBy(id = "email")
    public WebElement USERNAME;

    @FindBy(id= "pass")
    public WebElement PASSWORD;

    @FindBy(id = "u_0_d_F1")
    public WebElement LOGIN;

    public WebElement getUSERNAME() {
        return getDriverWait().waitForElementToLoad(USERNAME);
    }

    public WebElement getPASSWORD() {
        return getDriverWait().waitForElementToLoad(PASSWORD);
    }

    public WebElement getLoginButton() {
        return getDriverWait().waitForElementToLoad(LOGIN);
    }
}
