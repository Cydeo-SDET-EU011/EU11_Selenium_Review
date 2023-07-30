package week4.pages;

import io.github.bonigarcia.wdm.webdriver.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

import java.util.*;

public class SwagPage {

    public SwagPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    public WebElement item1Name;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> prices;

    @FindBy(className = "app_logo")
    public WebElement title;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement subTitle;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    public List<WebElement> addToCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartBtn;







}
