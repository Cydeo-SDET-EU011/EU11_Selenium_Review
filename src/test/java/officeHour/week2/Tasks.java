package officeHour.week2;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

public class Tasks {

    WebDriver driver = Driver.get();

    @Test
    public void tc001(){

        driver.get("https://practice.cydeo.com/");
        driver.findElement(By.linkText("Checkboxes")).click();
        Assert.assertTrue(driver.getTitle().contains("Checkboxes"));

        WebElement box1 = driver.findElement(By.id("box1"));
        box1.click();
        Assert.assertTrue(box1.isSelected());

        WebElement box2 = driver.findElement(By.id("box2"));
        Assert.assertTrue(box2.isSelected());
    }

    @Test
    public void tc002(){

    }
}
