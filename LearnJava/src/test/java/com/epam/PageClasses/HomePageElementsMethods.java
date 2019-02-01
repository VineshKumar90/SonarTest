package com.epam.PageClasses;

import com.epam.Resources.Locators;
import com.epam.Resources.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePageElementsMethods {
    @FindBy(xpath = "//input[@id='FromTag']")
    private WebElement SourceLocation;

    @FindBy(xpath = "(//ul[@class=\"autoComplete\"]/li/a)[1]")
    private WebElement SelectSource;

    @FindBy(xpath = "//input[@id='ToTag']")
    private WebElement DestinationLocation;

    @FindBy(xpath="(//ul[@class=\"autoComplete\"]/li/a)[2]")
    private WebElement SelectDestination;

    @FindBy(xpath = "//input[@id='DepartDate']")
    private WebElement DepartDateInput;

    @FindBy(xpath="//input[@id='SearchBtn']")
    private WebElement SearchButton;

   /* @FindBy(how = How.XPATH, using = Locators.DepartDates)
    private List<WebElement> DepartDates;

    @FindBy(how = How.XPATH, using = Locators.ReturnDates)
    private List<WebElement> ReturnDates;*/

    @FindBy(xpath="//select[@id='Adults']")
    private WebElement SelectAdults;

    @FindBy(xpath="//select[@id='Childrens']")
    private WebElement SelectChildren;

    @FindBy(xpath="//select[@id='Infants']")
    private WebElement SelectInfant;

    @FindBy(xpath = "//input[@id='OneWay']")
    private WebElement RadioOneWay;

    @FindBy(xpath = "//input[@id='RoundTrip']")
    private WebElement RadioRoundTrip;

    @FindBy(xpath=Locators.ReturnDateInput)
    private WebElement ReturnDateInput;

    @FindBy(how = How.XPATH, using = "//th[@class='depart']")
    private List<WebElement> DepartTime;

    @FindBy(how = How.XPATH, using = "//th[@class='arrive']")
    private List<WebElement> ArriveTime;

    @FindBy(how = How.XPATH, using= "//th[@class='price']/span")
    private List<WebElement> Price;


    private WebDriver driver;
    public TestBase base;
    public HomePageElementsMethods(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    //method to enter values in source and destination locations
    public void enterSourceLocation(String sourceLoaction){
        SourceLocation.sendKeys(sourceLoaction);
       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       WebDriverWait wait =  new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.elementToBeClickable(SelectSource));
       SelectSource.click();

    }

    public void selectRadioOneWay(){
        RadioOneWay.click();
    }

    public void selectRadioRoundTrip(){
        RadioRoundTrip.click();
    }

    public void enterDestinationLocation(String destination){
        DestinationLocation.sendKeys(destination);
       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        SelectDestination.click();
    }

    //Method to select Depart date
    public void selectDepartDate(String DepartureDate){
        DepartDateInput.sendKeys(DepartureDate);
        DepartDateInput.sendKeys(Keys.TAB);
       /* for(WebElement date : DepartDates){
           if(DepartureDate.equals(date.getText())){
                date.click();
                break;
            }
        }*/

    }

    //Method to select Return date
    public void selectReturnDate(String ReturnDate){
        ReturnDateInput.sendKeys(ReturnDate);
        ReturnDateInput.sendKeys(Keys.TAB);
        /*for(WebElement date : ReturnDates){
            if(ReturnDate.equals(date.getText())){
                date.click();
            }
        }*/

    }

    public void selectAdult(String adultValue){
        Select adult = new Select(SelectAdults);
        adult.selectByValue(adultValue);
    }

    public void selectChildren(String ChildrenValue){
        Select children = new Select(SelectChildren);
        children.selectByValue(ChildrenValue);
    }

    public void selectInfant(String infantValue){
        Select infant = new Select(SelectInfant);
        infant.selectByValue(infantValue);
    }

    public void clickSearchButton(){
        SearchButton.click();
    }
}
