package com.ceallo.step_defs;

import com.ceallo.pages.CalendarPage;
import com.ceallo.pages.HomePage;
import com.ceallo.pages.Login_Page;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarDefs {
    CalendarPage calendar = new CalendarPage();
    HomePage home = new HomePage();
    Login_Page login = new Login_Page();

    @Given("user is on the home page after logged in")
    public void user_is_on_the_home_page_after_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("web.username"));
        login.password.sendKeys(ConfigurationReader.getProperty("web.password"));
        login.button.click();
    }

    @When("the user clicks on the calendar module icon")
    public void the_user_clicks_on_the_calendar_module_icon() {

        home.calendarIcon.click();
    }

    @When("the user clicks on navigation toggle button next to today button")
    public void the_user_clicks_on_navigation_toggle_button_next_to_today_button() {

        calendar.toggleButton.click();
    }

    @When("the user clicks on the day option")
    public void the_user_clicks_on_the_day_option() {
        calendar.dayOption.click();


    }


    @Then("the application should display the daily calendar view")
    public void the_Application_Should_Display_The_Daily_Calendar_View() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(calendar.dailyView.isDisplayed());

    }

    @When("the user clicks on the week option")
    public void the_user_clicks_on_the_week_option() {
        calendar.weeklyView.click();
    }

    @Then("the application should display the weekly calendar view")
    public void the_application_should_display_the_weekly_calendar_view() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(calendar.weeklyView.isDisplayed());
    }

    @When("the user clicks on the month option")
    public void the_user_clicks_on_the_month_option() {
        calendar.monthlyView.click();

    }

    @Then("the application should display the monthly calendar view")
    public void the_application_should_display_the_monthly_calendar_view() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(calendar.getMonthlyView.isDisplayed());

    }

    // the user should be able to creat and event and display on the monthly calendar view.
    @When("the user clicks on the new event button")
    public void the_user_clicks_on_the_new_event_button() {
        calendar.newEventButton.click();
    }

    @When("the user fills inside event title box")
    public void the_user_fills_inside_event_title_box() {
        calendar.eventTitle.sendKeys("School Meeting");

    }

    @And("the user clicks on the all day button to set the event date")
    public void the_User_Clicks_On_The_All_Day_Button_To_Set_The_Event_Date() {
        calendar.allDay.click();
    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        calendar.saveButton.click();

    }

    @Then("the application should display the created event through the monthly calendar view")
    public void the_application_should_display_the_created_event_through_the_monthly_calendar_view() {
       Assert.assertTrue(calendar.eventSchoolMeeting.isDisplayed());


    }


    @When("the user clicks on the event already set on the calendar")
    public void the_user_clicks_on_the_event_already_set_on_the_calendar() {
       calendar.eventSchoolMeeting.click();
    }
    @When("the user clicks on more button")
    public void the_user_clicks_on_more_button() {
       calendar.moreButton.click();
    }

    @And("the user clicks on three dots next to the event title box")
    public void theUserClicksOnThreeDotsNextToTheEventTitleBox() {
        calendar.threeDotButton.click();
    }
//button[@aria-controls='menu-txhif']


    @When("the user clicks on the delete option")
    public void the_user_clicks_on_the_delete_option() {
      calendar.deleteButton.click();
    }
    @Then("the user should be able to delete the event permanently")
    public void the_user_should_be_able_to_delete_the_event_permanently() {
        Assert.assertTrue(calendar.afterDeletion.isDisplayed());
    }



}