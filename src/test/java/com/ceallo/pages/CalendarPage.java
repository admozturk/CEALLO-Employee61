package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@aria-haspopup='true'])[1]")
    public WebElement toggleButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']/..")
    public WebElement dayOption;

    @FindBy(css = "a[class='fc-col-header-cell-cushion ']")
    public WebElement dailyView;

    @FindBy(css = "span[class='action-button__icon icon-view-week']")
    public WebElement weeklyView;

    @FindBy(css = "span[class='action-button__icon icon-view-module']")
    public WebElement monthlyView;

    @FindBy(css = "a[data-navlink='{\"date\":\"2023-03-24\",\"type\":\"day\"}']")
    public WebElement getMonthlyView;


    // New Event Scenario
    @FindBy(css = "button[class='button primary new-event']")

    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(css = "label[for='allDay']")
    public WebElement allDay;

    @FindBy(css = "button[class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "(//div[@class='fc-event-title-container'])[1]/..")
    public WebElement eventSchoolMeeting;

    // the event deletion

    @FindBy(xpath = "//button[normalize-space()='More']")
    public WebElement moreButton;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[3]")
    public WebElement threeDotButton;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//a[@class='fc-daygrid-day-number'][normalize-space()='31'])[1]")
    public WebElement afterDeletion;

}
