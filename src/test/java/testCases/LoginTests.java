package testCases;

import Actions.LoginActions;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTests extends UIInteractions {

    LoginActions loginActions;

    @Managed
    WebDriver driver;

//    @Test
//    public void doLogin(){
//        loginActions.navigateToSite();
//        loginActions.enterUserNameAndPassword("mani@123","Test@123");
//        Serenity.reportThat("User logged in successfully",() -> assertThat(loginActions.verifySuccessfulLogin()));
//    }

//    @Test
//    public void checkElementisVisible(){
//        openUrl("https://practice.expandtesting.com/slow");
//        $("//p//strong[contains(.,'Thanks')]").withTimeoutOf(20,ChronoUnit.SECONDS).waitUntilVisible();
//        System.out.println("----->" );
//    }
//
//    @Test
//    public void waitForAlert(){
//        openUrl("https://practice.expandtesting.com/slow");
//        withTimeoutOf(5,ChronoUnit.SECONDS).waitFor(ExpectedConditions.visibilityOf($("//p//strong[contains(.,'Thanks')]")));
//
//    }

    @Test
    public void inputFields(){
        openUrl("https://practice.expandtesting.com/upload");
        upload("C:\\Users\\manim\\OneDrive\\Pictures\\Screenshots\\Present perfect continious 2.png").to($("//input[@type='file']"));
        System.out.println("___+++");
    }

}
