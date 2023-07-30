package week4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
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

    @Test
    public void dragDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.dragAndDrop(source,target).perform();
        String actualText = target.getText();
        Assert.assertEquals(actualText,"You did great!");
    }

    @Test
    public void keyboardActions() throws InterruptedException {
        driver.get("https://practice.cydeo.com/key_presses");
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.F1).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
    }





}



