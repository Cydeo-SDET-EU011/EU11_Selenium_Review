package officeHour.week3.step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import utilities.*;

import java.util.*;

public class task2Steps {

    WebDriver driver = Driver.get();
    List<WebElement> datesElement = new ArrayList<>();

    @Given("go to the webtale link")
    public void go_to_the_webtale_link() {
        driver.get(ConfigurationReader.get("tableUrl"));
    }

    @When("click calendar")
    public void click_calendar() {
        WebElement calendar = driver.findElement(By.id("datepicker"));
        calendar.click();
    }

    @When("get all dates in table")
    public void get_all_dates_in_table() {
        datesElement = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

    }

    @When("print all dates")
    public void print_all_dates() {
        for (WebElement date : datesElement) {
            System.out.println(date.getText());
        }
    }

    @When("provide date as {int} and click")
    public void provide_date_as_and_click(Integer date) {
//        WebElement dateToClick = driver.findElement(By.xpath("//a[.='" + date + "']"));
//        dateToClick.click();

        datesElement.get(date-1).click();
    }
}
