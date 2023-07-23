package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;
import java.util.concurrent.*;

public class WindowsHandle {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowsHandle() {
        WebElement link = driver.findElement(By.xpath("//a[.='Click Here']"));
        link.click();
        Set<String> windows = driver.getWindowHandles();
        for (String handle : windows) {
            driver.switchTo().window(handle);
            if(driver.getTitle().equals("New Window")){
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }

        String expected = "New Window";
        String actual = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(expected,actual);


    }
}
