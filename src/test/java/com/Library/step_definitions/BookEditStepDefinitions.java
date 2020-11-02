package com.Library.step_definitions;

import com.Library.Pages.EditBook;
import com.Library.Pages.LoginPage;
import com.Library.utils.BrowserUtils;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BookEditStepDefinitions {
    EditBook editBook= new EditBook();
  // LoginPage loginPage=new LoginPage();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
      //  loginPage.Login();
        BrowserUtils.wait(5);
        Assert.assertTrue("Book Module is not displayed", editBook.bookModule.isDisplayed());
    }
    @When("user clicks the Books module")
    public void user_clicks_the_books_module() {
        BrowserUtils.wait(5);
        editBook.bookModule.click();
    }
    @When("user tries to make edits")
    public void user_tries_to_make_edits() {
        BrowserUtils.wait(5);
        editBook.edit.click();
        BrowserUtils.wait(5);
        editBook.bookName.clear();
        editBook.bookName.sendKeys("Ask");

        BrowserUtils.wait(3);
        editBook.authorName.clear();
        editBook.authorName.sendKeys("Elif Safak");

        BrowserUtils.wait(5);
        editBook.description.clear();
        editBook.description.sendKeys("I have read this BOOK");
        BrowserUtils.wait(3);
        editBook.saveChanges.click();
    }

    @Then("user should be able to see info edited")
    public void user_should_be_able_to_see_info_edited() {
      String expectedResult= "Elif Safak";
      String actualResult= editBook.editedAuthorName.getText();
       Assert.assertEquals( "Actual result is not same wit Expected Result", expectedResult, actualResult);
        BrowserUtils.wait(3);
    //    Driver.closeDriver();
        BrowserUtils.wait(5);
    }
}
