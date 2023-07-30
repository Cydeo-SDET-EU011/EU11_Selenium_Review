package week4;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public class Waits {

    // we have 4 ways to solve synchronization problem

    WebDriver driver = Driver.get();

    //1. thread sleep
    @Test
    public void  test1() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dynamic_loading/4");
        Thread.sleep(6000);
        WebElement title = driver.findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertTrue(title.isDisplayed());
    }

    // implicit wait
    @Test
    public void test2(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dynamic_loading/4");
        WebElement title = driver.findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertTrue(title.isDisplayed());
    }

    // 3. explicitly wait
    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/dynamic_loading/3");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());
    }

    // 4. fluent wait
    @Test
    public void test4(){
        driver.get("https://practice.cydeo.com/dynamic_loading/3");
        WebDriverWait wait = (WebDriverWait) new FluentWait<WebDriver>(driver)
                .withTimeout(10,TimeUnit.SECONDS)
                .pollingEvery(1,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);

    }

}
