package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.*;

public class LocatorsReview {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // locators
        // we have 8 locators
        /*
        1. id
        2. name
        3. class
        4. tagname
        5. linktext
        6. partial link text
        7. css selector
        8. xpath

         */

        //id
        driver.findElement(By.id("content"));

        // name
        driver.findElement(By.name("viewport"));

        //class
        driver.findElement(By.className("list-group-item"));

        //tagname
        driver.findElement(By.tagName("a"));

        //linktext
        driver.findElement(By.linkText("A/B Testing"));

        //partial link text
        driver.findElement(By.partialLinkText("Testing"));
        driver.findElement(By.partialLinkText("A/B Testing"));

        // css selector
        //    tagname[attribute='value']
        /*
        div[class='container']

        we have shortcuts for css selector, we can use
        # for id
        . for classname

        div#content

        div.row

        in class value, if we have space, we have to replace space with '.'

        parent child relationship
        div.col-sm-8 h2    or     div.col-sm-8>h1
        we can't go from chile --> parent in css


        if you have more than 1 child element, you can use nth-of-type(index) method
        ul.list-group>li:nth-of-type(1)
        note: index number is starting with 1, not 0.


         */


        //xpath
        /*
        we have 2 types of xpath locators
        1. absolute
        /html/body/div/div/div

        2. relative
        //div[@class='container']

        // text() method
        //a[text()='Autocomplete']    //a[.='Autocomplete']

        // contains() method
        //li[contains(@class,'list')]

        parent --> child
        //div[@class='col-sm-8']/h2


        child --> parent
        //h1[@class='h1']/..

        siblings
        (//li[@class='list-group-item']/following-sibling::li)
        //li[@class='list-group-item']/preceding-sibling::li

        using index number
        (//li[@class='list-group-item']/following-sibling::li)[1]


        css and xpath differences
        1. css can't locate using text, but xpath can
        2. css can't use index directly, but xpath can
        3. css can't go from child to parent, but xpath can

         */



    }
}
