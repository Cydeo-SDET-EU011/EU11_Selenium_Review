package officeHour.week2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.*;

public class Tasks {

    WebDriver driver = Driver.get();

    @Test
    public void tc001() {

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
    public void tc002() {
        driver.get("https://practice.cydeo.com/");
        driver.findElement(By.linkText("Radio Buttons")).click();
        Assert.assertTrue(driver.getTitle().contains("Radio buttons"));

        WebElement red = driver.findElement(By.id("red"));
        red.click();
        Assert.assertTrue(red.isSelected());

        WebElement football = driver.findElement(By.id("football"));
        football.click();
        Assert.assertTrue(football.isSelected());

    }

    @Test
    public void tc003() {
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement state = driver.findElement(By.id("state"));

        Select yearDrop = new Select(year);
        Select monthDrop = new Select(month);
        Select dayDrop = new Select(day);
        Select stateDrop = new Select(state);

        /*
        3 ways to select an option inside dropdown

        1. by index
        2. by visible text
        3. by value
         */

        yearDrop.selectByIndex(3);
        monthDrop.selectByVisibleText("May");
        dayDrop.selectByValue("22");
        stateDrop.selectByVisibleText("Virginia");

        Assert.assertEquals(yearDrop.getFirstSelectedOption().getText(), "2020");
        // please do other assertions by yourself

    }

    @Test
    public void tc004() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        Select oldSelect = new Select(driver.findElement(By.id("oldSelectMenu")));

        List<WebElement> options = oldSelect.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        oldSelect.selectByIndex(4);
        Thread.sleep(1500);
        oldSelect.selectByVisibleText("Magenta");
        Thread.sleep(1500);
        oldSelect.selectByValue("7");

        driver.close();

    }

    @Test
    public void tc005() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        Select multiDrop = new Select(driver.findElement(By.id("cars")));

        Assert.assertTrue(multiDrop.isMultiple());

        multiDrop.selectByVisibleText("Opel");
        multiDrop.selectByVisibleText("Saab");

        Thread.sleep(2000);

        multiDrop.deselectAll();

        Thread.sleep(2000);

        driver.close();


    }
}
