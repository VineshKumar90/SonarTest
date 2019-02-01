package com.epam.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src\\test\\java\\com\\epam\\FeatureFiles"},
       // format = { "pretty","json:target/cucumber.json","html:target/site/cucumber-pretty" },
        plugin = {"pretty","html:target/cucmber-html-report","json:target/cucumber.json","junit:target/cucumber.xml"},
        glue =     {"com.epam.stepDef"},
        monochrome = true,
        dryRun = false
)
public class RunCukesTest extends AbstractTestNGCucumberTests {

}
