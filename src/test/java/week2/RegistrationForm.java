package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationForm {

//    public static void main(String[] args) {
//        // TC#2: Registration Form Page Testing
//        // 1. Open Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");
//
//        // 3. Verify title is as expected:
//        // Expected: "Registration Form"
//        String expectedTitle = "Registration Form";
//        String actualTitle = driver.getTitle();
//
//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("Title verification passed!");
//        }else{
//            System.out.println("Title verification failed!");
//        }
//
//    }

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
    }



    @Test
    public void registration_form_test(){
        // TC#2: Registration Form Page Testing
        // 1. Open Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
        String expectedTitle = "Registration Form";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Title verification failed!");

    }


    @Test
    public void registration_form_filling_test(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 3. Enter First name: "John"
       driver.findElement(By.name("firstname")).sendKeys("John");

       // 4. Enter Last name: "Smith"
       driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        driver.findElement(By.name("email")).sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"


        // 8. Enter Phone number: "123-456-7890"


        // 9. Click to "Male" from Gender


        // 10. Enter Date of birth "01/28/1990"
        // 11. Select "Department of Engineering" from Department/Office dropdown
        // 12. Select "SDET" from Job title dropdown
        // 13. Click to "Java" from languages
        // 14. Click to "Sign up" button
        // 15. Verify text displayed on page
        //     Expected: "Well done!"



    }


    @AfterMethod
    public void teardown(){

        driver.quit();
    }



}
