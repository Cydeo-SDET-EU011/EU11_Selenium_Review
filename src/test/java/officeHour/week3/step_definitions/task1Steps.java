package officeHour.week3.step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import utilities.*;
import org.junit.*;

import java.util.*;

public class task1Steps {

    WebDriver driver = Driver.get();
    Set<String> allHandles = new HashSet<>();

    @Given("user go to the url")
    public void user_go_to_the_url() {
        driver.get(ConfigurationReader.get("w3url"));
    }

    @When("user get current window handle")
    public void user_get_current_window_handle() {
        String firstWindow = driver.getWindowHandle();
        System.out.println("firstWindow = " + firstWindow);
    }

    @Then("It must be {string} window handle")
    public void ıt_must_be_window_handle(String handleNumber) {
        String expectedtitle = "";

        switch (handleNumber) {
            case "first":
                expectedtitle = "W3Schools Tryit Editor";
                break;

            case "second":
                expectedtitle = "W3Schools Online Web Tutorials";
                break;


        }
        Assert.assertEquals(expectedtitle, driver.getTitle());


    }

    @When("user click webpage")
    public void user_click_webpage() {
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement link = driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();
    }

    @When("get all handles and put them in a list")
    public void get_all_handles_and_put_them_in_a_list() {
        allHandles = driver.getWindowHandles();
    }

    @When("print handles in console")
    public void print_handles_in_console() {
        for (String handle : allHandles) {
            System.out.println("handle = " + handle);
        }
    }

    @Then("the handles count should be {int}")
    public void the_handles_count_should_be(Integer int1) {
        Integer handlesSize = allHandles.size();
        Assert.assertEquals(int1, handlesSize);

    }


    @When("switch to {string} window")
    public void switch_to_window(String handleNumber) {
        switch (handleNumber){
            case "first":
                for (String handle : allHandles) {
                    driver.switchTo().window(handle);
                    if (driver.getTitle().equals("W3Schools Tryit Editor")) {
                        break;
                    }

                }
                break;

            case "second":
                for (String handle : allHandles) {
                    driver.switchTo().window(handle);
                    if (driver.getTitle().equals("W3schools Online Web Tutorials")) {
                        break;
                    }

                }
                break;
        }


    }

    @Then("check the upper left side logo in the second window")
    public void check_the_upper_left_side_logo_in_the_second_window() {
        WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']"));
        Assert.assertTrue(logo.isDisplayed());
    }


    @Then("validate run button text contains {string}")
    public void validate_run_button_text_contains(String string) {
        WebElement button = driver.findElement(By.id("runbtn"));
        String actualText = button.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(string));
    }
}
