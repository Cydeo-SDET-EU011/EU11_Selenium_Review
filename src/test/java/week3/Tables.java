package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;
import java.util.concurrent.*;

public class Tables {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void getName() {
        String name = driver.findElement(By.xpath("//td[.='Alexandra Gray']")).getText();
        Assert.assertEquals(name, "Alexandra Gray");
    }

    @Test
    public void getNames() {
        List<WebElement> namesElement = driver.findElements(By.xpath("//tbody//tbody//tr/td[2]"));
        List<String> names = new ArrayList<>();
        for (WebElement nameElement : namesElement) {
            names.add(nameElement.getText());
        }

        System.out.println(names);
    }


    // create a method, receive two parameters, one name, one pizza count
    // this method should check if the person ordered correct pizza number
    //   //td[.='Alexandra Gray']/following-sibling::td[2]


}
