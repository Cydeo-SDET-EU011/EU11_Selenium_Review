package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {


    public static void main(String[] args) {
        // TC#1: Practice page Login test
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        WebElement username1 = driver.findElement(By.name("username"));
        WebElement username2 = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement username3 = driver.findElement(By.cssSelector("input[name='username']"));

        // 4. Enter password: "SuperSecretPassword"


        // 5. Click to Login button

        // 6. Verify text displayed on page

        //    Expected: "You logged into a secure area!"
    }
}
