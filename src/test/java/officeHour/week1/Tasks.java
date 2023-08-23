package officeHour.week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.concurrent.*;

public class Tasks {

    /*
    ** TC001 As a user I should be able to see Login label is displayed

            1-open a chrome browser
            2-go to https://vytrack.com/
            3-verify Login is displayed
     */

    @Test
    public void tc001(){
        // 1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2-go to https://vytrack.com/
        driver.get("https://vytrack.com/");
        //driver.navigate().to("https://vytrack.com/");

        //3-verify Login is displayed
        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
        if (loginLink.isDisplayed()){
            System.out.println("Login is displayed");
        }else {
            System.out.println("Login is not displayed");
        }
    }


    /*
    ** TC002 As a user I should be able to see the login page

        1- Setup the "browser driver"
        2- Go to "https://vytrack.com"
        3- Click Login label
        3- Verify the title contains "Login"
     */
    @Test
    public void tc002(){
        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2.
        driver.get("https://vytrack.com/");

        //3.
        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
        loginLink.click();

        //4.
        Assert.assertTrue(driver.getTitle().contains("Login"));
    }

    /*
    ** TC003 As a user I should be able to login with valid credentials

        1- Setup the "browser driver"
        2- Go to "https://vytrack.com"
        3- Click Login label
        4- Login to application with username as "User1" and password as "UserUser123"
        5- Verify the title contains "Dashboard"
     */

    @Test
    public void tc003() throws InterruptedException {
        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2.
        driver.get("https://vytrack.com/");

        //3.
        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
        loginLink.click();

        //4.
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        WebElement loginButton = driver.findElement(By.id("_submit"));

        usernameInput.sendKeys("User1");
        passwordInput.sendKeys("UserUser123");
        loginButton.click();

        //5.
        Thread.sleep(20000);
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @Test
    public void tc004(){
        /*
        ** TC004 As a user I should be able to see the password hidden as default

        1- Setup the "browser driver"
        2- Go to "https://vytrack.com"
        3- Click Login label
        4- Login to application with username as "User1" and password as "UserUser123"
        5- Verify the password is hidden
         */

        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2.
        driver.get("https://vytrack.com/");

        //3.
        WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
        loginLink.click();

        //4.
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        WebElement loginButton = driver.findElement(By.id("_submit"));

        usernameInput.sendKeys("User1");
        passwordInput.sendKeys("UserUser123");

        //5
        String actual = passwordInput.getAttribute("type");
        String expected = "password";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void tc005() throws InterruptedException {
        /*
        ** TC005 As a user I should be able to see Home, About us, Our Approach, Product and Services, Contact and LOGIN labels are displayed

        1-open a chrome browser
        2-goto https://vytrack.com/
        3-verify Home, About us, Our Approach, Product and Services, Contact and LOGIN labels are displayed
         */

        //1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2.
        driver.get("https://vytrack.com/");


        //3.
        Thread.sleep(5000);
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        WebElement aboutUs = driver.findElement(By.linkText("About us"));
        WebElement approach = driver.findElement(By.linkText("Our Approach"));
        WebElement product = driver.findElement(By.linkText("Products and Services"));
        WebElement contact = driver.findElement(By.linkText("Contact"));
        WebElement login = driver.findElement(By.linkText("LOGIN"));

        Assert.assertTrue(homeLink.isDisplayed());
        Assert.assertTrue(aboutUs.isDisplayed());
        Assert.assertTrue(approach.isDisplayed());
        Assert.assertTrue(product.isDisplayed());
        Assert.assertTrue(contact.isDisplayed());
        Assert.assertTrue(login.isDisplayed());


    }






}
