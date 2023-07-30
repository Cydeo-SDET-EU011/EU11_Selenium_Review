package week4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

public class ActionsTest extends BasePage{

    @Test
    public void hoverTest(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement hoverButton = driver.findElement(By.id("sub-menu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverButton).perform();
        driver.findElement(By.id("link2")).click();

    }
}
