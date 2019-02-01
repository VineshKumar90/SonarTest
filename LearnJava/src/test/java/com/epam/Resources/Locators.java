package com.epam.Resources;

public interface Locators {
    //Home Page Locators
    String SourceLocation = "//input[@id='FromTag']";
    String SelectSource = "(//ul[@class=\"autoComplete\"]/li/a)[1]";
    String DestinationLocation = "//input[@id='ToTag']";
    String SelectDestination = "(//ul[@class=\"autoComplete\"]/li/a)[2]";
    String DepartDateInput = "//input[@id='DepartDate']";
    String ReturnDateInput = "//input[@id='ReturnDate']";
    String DepartDates = "//div[@class='monthBlock first']//td";
    String ReturnDates = "//div[@class='monthBlock first']//td";
    String SearchButton = "//input[@id='SearchBtn']";
    String SelectAdults = "//select[@id='Adults']";
    String SelectChildren = "//select[@id='Childrens']";
    String SelectInfant = "//select[@id='Infants']";
    String RadioOneWay = "//input[@id='OneWay']";
    String RadioRoundTrip = "//input[@id='RoundTrip']";

}
