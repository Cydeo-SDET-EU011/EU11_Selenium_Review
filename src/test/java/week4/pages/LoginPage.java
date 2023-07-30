package week4.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class LoginPage {


    public LoginPage() { PageFactory.initElements(Driver.get(),this);}


    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    public void login(){
        Driver.get().get(ConfigurationReader.get("url"));
        usernameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }






}
