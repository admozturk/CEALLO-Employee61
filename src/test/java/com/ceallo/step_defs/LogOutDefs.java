package com.ceallo.step_defs;

import com.ceallo.pages.LogOutPage;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutDefs {

    LogOutPage logOut = new LogOutPage();


    @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() {
        Assert.assertEquals("Files - Ceallo - QA", Driver.getDriver().getTitle());
    }
    @When("Press the e button")
    public void press_the_e_button() {
        logOut.divExpand.click();

    }
    @When("Click on log out button")
    public void click_on_log_out_button() {
     logOut.logOutButton.click();

    }
    @Then("User is on login page")
    public void user_is_on_login_page() {
     Assert.assertEquals("Ceallo - QA",Driver.getDriver().getTitle());
    }

}
