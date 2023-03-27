package com.ceallo.pages;
import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id ="submit-form" )
    public WebElement button;

}
   // Login_Page login = new Login_Page();

  /*  @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("web.username"));
        login.password.sendKeys(ConfigurationReader.getProperty("web.password"));
        login.button.click();
        Assert.assertEquals("Files - Ceallo - QA", Driver.getDriver().getTitle());
    }*/