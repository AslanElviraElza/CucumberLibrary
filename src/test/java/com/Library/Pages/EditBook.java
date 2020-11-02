package com.Library.Pages;

import com.Library.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditBook extends LoginPage {

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement bookModule;

  //  @FindBy(xpath = "//tr[1]//td[1]")
    @FindBy(xpath = " //tr[1]//td[1]/a")
    public WebElement edit;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement bookName;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement authorName;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;

    @FindBy(xpath = "//tr/td[4]")
    public WebElement editedAuthorName;
}
