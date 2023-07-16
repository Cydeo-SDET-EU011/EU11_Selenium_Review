package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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


    @Test
    public void registration_form_test(){
        // TC#2: Registration Form Page Testing
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
        String expectedTitle = "Registration Form";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Title verification failed!");

    }





}
