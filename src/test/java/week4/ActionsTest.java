package week4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

public class ActionsTest extends BasePage {




    @BeforeMethod
    public void setUp() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

    }

    @Test
    public void hoverTest() {
        WebElement hoverButton = driver.findElement(By.id("sub-menu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverButton).perform();
        driver.findElement(By.id("link2")).click();

    }

    @Test
    public void doubleClickTest() {
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }

}



