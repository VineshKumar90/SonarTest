package com.epam.stepDef;

import com.epam.Resources.ConfigReader;
import com.epam.Resources.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


@Component
public class Hooks {

    @Autowired
    private TestBase base;


    @Before
    public void setup() throws IOException {
        ConfigReader config = new ConfigReader();
        config.readPropertiesFile();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        base.driver = new ChromeDriver(options);
        base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        base.driver.manage().window().maximize();
        base.driver.get(config.getApplicationURL());

    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            // Take a screenshot...
            System.out.println("ScreenShot Captured");
            File screenshot = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("error.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
//        Thread.sleep(6);
          base.driver.quit();
    }
}
