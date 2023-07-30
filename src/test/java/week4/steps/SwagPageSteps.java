package week4.steps;

import org.testng.*;
import org.testng.annotations.*;
import week4.pages.*;

public class SwagPageSteps {

    SwagPage swagPage = new SwagPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void checkPrice(){
        loginPage.login();
        Assert.assertEquals(swagPage.prices.get(0).getText(),"$29.99");
    }
}
