package com.epam.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightResultsElementsMethods{

    @FindBy(how = How.XPATH, using = "//th[@class='depart']")
    List<WebElement> DepartTime;

    @FindBy(how = How.XPATH, using = "//th[@class='arrive']")
    List<WebElement> AriveTime;

    WebDriver driver;

    public FlightResultsElementsMethods(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


}
