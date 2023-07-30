package week4.steps;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;
import week4.*;
import week4.pages.*;

public class SwagPageSteps {

    SwagPage swagPage = new SwagPage();
    LoginPage loginPage = new LoginPage();

    CartPage cartPage = new CartPage();


    // check price
    @Test
    public void checkPrice(){
        loginPage.login();
        Assert.assertEquals(swagPage.prices.get(0).getText(),"$29.99");
    }


    // check title
    @Test
    public void checkTitle(){
        Assert.assertEquals(swagPage.title.getText(),"Swag Labs");
        Assert.assertEquals(swagPage.subTitle.getText(),"Products");

    }

    // check add to cart button
//    @Test
//    public void addToCart(){
////        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
////        js.executeScript("arguments[0].click()",swagPage.addToCart);
//        swagPage.addToCart.get(0).click();
//        Assert.assertEquals(swagPage.removeBtn.getText(),"Remove");
//        swagPage.removeBtn.click();
//        //Assert.assertEquals(swagPage.addToCart.getText(),"Add to cart");
//
//    }


    // check if the product is added to cart
    @Test
    public void cartTest() throws InterruptedException {
        Thread.sleep(3000);
        swagPage.cartBtn.click();
        Assert.assertTrue(cartPage.cartItem.isDisplayed());

    }


}
