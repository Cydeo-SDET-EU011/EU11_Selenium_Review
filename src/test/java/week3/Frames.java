package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.concurrent.*;

public class Frames {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/nested_frames");
    }

    @Test
    public void frameTest(){
        // 1. go to frame by name
        driver.switchTo().frame("frame-top");

        // 2. go to frame by webelement
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@src='/frame_left']"));
        driver.switchTo().frame(leftFrame);
        String actualMsg = driver.findElement(By.tagName("body")).getText().trim();
        String expectedMsg = "LEFT";
        Assert.assertEquals(expectedMsg,actualMsg);

        // switching to parent frame
        driver.switchTo().parentFrame();

        // 2. go to frame by index
        driver.switchTo().frame(2);
        String actualMsg2 = driver.findElement(By.tagName("body")).getText().trim();
        String expectedMsg2 = "RIGHT";
        Assert.assertEquals(expectedMsg2,actualMsg2);



    }
}
