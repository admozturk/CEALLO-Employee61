package com.ceallo.step_defs;

import com.ceallo.pages.Login_Page;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    Login_Page login = new Login_Page();

    @Before
    public void setupScenarioForLogins() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("web.username"));
        login.password.sendKeys(ConfigurationReader.getProperty("web.password"));
        login.button.click();
    }

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }



}