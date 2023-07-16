package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPractice {


    public static void main(String[] args) throws InterruptedException {
        // TC#1: Practice page Login test
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        WebElement username1 = driver.findElement(By.name("username"));
        WebElement username2 = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement username3 = driver.findElement(By.cssSelector("input[name='username']"));

        username1.sendKeys("tomsmith");

        // 4. Enter password: "SuperSecretPassword"
        WebElement password1 = driver.findElement(By.name("password"));
        WebElement password2 = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement password3 = driver.findElement(By.cssSelector("input[type='password']"));

        password1.sendKeys("SuperSecretPassword");

        // 5. Click to Login button
        WebElement loginBtn1 = driver.findElement(By.id("wooden_spoon"));
        // If there is space, there are 2 class name and we can not locate with className locator
       // WebElement loginBtn3 = driver.findElement(By.className("btn btn-primary"));
        WebElement loginBtn2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        WebElement loginBtn3 = driver.findElement(By.xpath("//button[text()='Login']"));
        WebElement loginBtn4 = driver.findElement(By.xpath("//button[.='Login']"));
        WebElement loginBtn5 = driver.findElement(By.cssSelector("#wooden_spoon"));
        WebElement loginBtn6 = driver.findElement(By.cssSelector(".btn.btn-primary"));

        Thread.sleep(3);

        loginBtn3.click();

        // 6. Verify text displayed on page

        WebElement result = driver.findElement(By.id("flash"));
        WebElement result1 = driver.findElement(By.xpath("//div[normalize-space(text())='You logged into a secure area!']"));

        //    Expected: "You logged into a secure area!"

        String expectedResult = "You logged into a secure area!";
        String actualResult = result.getText();

        System.out.println("actualResult = " + actualResult);

        if(actualResult.startsWith(expectedResult)){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!");
        }

          driver.quit();
    }
}
