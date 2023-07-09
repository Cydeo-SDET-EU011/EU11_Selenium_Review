package week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Day1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://www.google.com/");
    }
}
