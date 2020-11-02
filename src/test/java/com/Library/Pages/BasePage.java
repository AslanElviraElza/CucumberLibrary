package com.Library.Pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement pageTitle;

    public String getPageTitleText(){
        return pageTitle.getText();
    }
}
