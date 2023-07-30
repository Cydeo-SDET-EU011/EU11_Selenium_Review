package week4.steps;

import org.testng.annotations.*;
import utilities.*;
import week4.pages.*;

public class LoginPageSteps {

    LoginPage login = new LoginPage();


    @Test
    public void loginTest(){
        Driver.get().get(ConfigurationReader.get("url"));
        login.usernameInput.sendKeys(ConfigurationReader.get("username"));
        login.passwordInput.sendKeys(ConfigurationReader.get("password"));
        login.loginBtn.click();

    }




}
