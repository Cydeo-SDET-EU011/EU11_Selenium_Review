package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.concurrent.*;

public class Alerts {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void informationAlert() throws InterruptedException {
        WebElement infoButton = driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
        infoButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        // assertion
        String actualMsg = driver.findElement(By.id("result")).getText();
        String expectedMsg = "You successfully clicked an alert";
        Assert.assertEquals(actualMsg,expectedMsg);
    }

    @Test
    public void confirmationAlert() throws InterruptedException {
        WebElement confButton = driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]"));
        confButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.dismiss();

        String actualMsg = driver.findElement(By.id("result")).getText();
        String expectedMsg = "You clicked: Cancel";
        Assert.assertEquals(actualMsg,expectedMsg);
    }

    @Test
    public void promptAlert() throws InterruptedException {
        WebElement promptButton = driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]"));
        promptButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        String msg = "Eu11 Selenium Class";
        alert.sendKeys(msg);
        alert.accept();

        String actualMsg = driver.findElement(By.id("result")).getText();
        String expectedMsg = "You entered: " + msg;
        Assert.assertEquals(actualMsg,expectedMsg);
    }
}
