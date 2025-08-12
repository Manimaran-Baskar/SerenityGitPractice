package Actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class LoginActions extends UIInteractions {

    @Step("User navigates to login page")
    public void navigateToSite(){
        openUrl("https://www.automationexercise.com/login");
    }

    @Step("User enters username ('{0}') and password")
    public void enterUserNameAndPassword(String username,String password){
       WebElementFacade userNameField = $("//input[@placeholder='Email Address']");
       WebElementFacade passwordField = $("//input[@placeholder='Password']");

       userNameField.sendKeys(username);
       passwordField.sendKeys(password, Keys.ENTER);
    }

    @Step("User confirms it logged in by seeing logout button")
    public boolean verifySuccessfulLogin(){
        try {
            return $("//a[contains(.,'Logout')]").isDisabled();
        } catch (Exception e) {
            return false;
        }

    }
}
