package com.Library.Pages;

import com.Library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@type='email']")
    public WebElement libraryUserName;

    @FindBy(xpath = "//input[@type='password']")
    public  WebElement libraryPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement librarySubmitButton;

    public void Login(){
        libraryUserName.sendKeys(ConfigurationReader.getProperty("username"));
        libraryPassword.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);

    }
}
