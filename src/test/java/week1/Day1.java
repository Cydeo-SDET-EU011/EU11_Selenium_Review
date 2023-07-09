package week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Day1 {

    public static void main(String[] args) throws InterruptedException {

        // setting up browser
        WebDriverManager.chromedriver().setup();



        // create an object
        WebDriver chrome = new ChromeDriver();

        // maximizing my window
        chrome.manage().window().maximize();


        // go to webpage
        chrome.get("https://www.google.com/");
        Thread.sleep(1500);
        chrome.get("https://www.amazon.com/");
        Thread.sleep(1500);



        // navigate methods
        // back
        chrome.navigate().back();
        Thread.sleep(1500);

        //forward
        chrome.navigate().forward();
        Thread.sleep(1500);

        // refresh
        chrome.navigate().refresh();
        Thread.sleep(1500);


        //to
        chrome.navigate().to("https://www.heroku.com/");

        //get title method
        String title = chrome.getTitle();
        System.out.println("the title is:" + title);

        // get current url
        String url = chrome.getCurrentUrl();
        System.out.println("url = " + url);

        Thread.sleep(3000);

        chrome.close();




    }
}
