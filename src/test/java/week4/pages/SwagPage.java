package week4.pages;

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





}
