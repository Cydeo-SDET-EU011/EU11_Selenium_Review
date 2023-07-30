package week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public class BasePage {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = Driver.get();

    }
}
