package week4;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class JSExecuterTest extends BasePage{


    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/dynamic_controls");
        WebElement inputBar = driver.findElement(By.xpath("//input[@type='text']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = "Eu11 is the best";
        js.executeScript("arguments[0].setAttribute('value', '" + text +"')",inputBar);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,250)");
        }
    }


    // click button    jse.executeScript("arguments[0].click();", dropdownLink);
    // scroll to some element  jse.executeScript("arguments[0].scrollIntoView(true);",eng);
}
