package week4.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement cartItem;
}
