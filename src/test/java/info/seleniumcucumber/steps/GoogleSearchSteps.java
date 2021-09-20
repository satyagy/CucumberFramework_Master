package info.seleniumcucumber.steps;

import info.seleniumcucumber.utils.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static info.seleniumcucumber.utils.BaseTest.*;

public class GoogleSearchSteps {

    //Implementation of FaceBook Login
    @Given("I am on Facebook Login Page")
    public void openRequiredURL() {
        String fbURL = ConfigurationReader.configuration().getProperty("requiredURL");
        navigationObj.navigateTo(fbURL);
    }

    @When("I enter Username into email field on Facebook Page")
    public void enterEmail() {
        String userName = ConfigurationReader.configuration().getProperty("userName");
        inputObj.enterText(googleSearchPage.getUSERNAME(), userName);
    }

    @When("I enter Password into password field on Facebook Page")
    public void enterPassword() {
        inputObj.enterText(googleSearchPage.getPASSWORD(), ConfigurationReader.configuration().getProperty("password"));
    }

    @When("I click Login Button")
    public void clickOnButton() {
        clickObj.click(googleSearchPage.getLoginButton());
    }
}
