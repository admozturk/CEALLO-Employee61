package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

    public LogOutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

   
    @FindBy(xpath = "//*[@id='expand']")
    public WebElement divExpand;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOutButton;

 





}
