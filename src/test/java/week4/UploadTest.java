package week4;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

public class UploadTest extends BasePage {


    @Test
    public void uploadTest(){
        driver.get("https://practice.cydeo.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Zulpikar\\IdeaProjects\\EU11_Selenium_Review\\src\\test\\java\\week4\\test.txt");
        driver.findElement(By.id("file-submit")).click();
        String acutalText = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(acutalText,"File Uploaded!");

    }


}
