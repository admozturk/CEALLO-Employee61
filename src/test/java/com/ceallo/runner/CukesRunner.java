package com.ceallo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = "com/ceallo/step_defs",
        dryRun = false,
        tags = "@CEA10-328"

)
public class CukesRunner {
}
