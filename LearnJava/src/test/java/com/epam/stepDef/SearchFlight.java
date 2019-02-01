package com.epam.stepDef;

import com.epam.PageClasses.HomePageElementsMethods;
import com.epam.Resources.Log;
import com.epam.Resources.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class SearchFlight extends Log {
	
    private HomePageElementsMethods homePage;
    private TestBase base;
    public SearchFlight(TestBase base) {
        this.base = base;
        homePage =  new HomePageElementsMethods(base.driver);
    }


    @Given("^User is on home page of application$")
    public void user_is_on_home_page_of_application()  {
       // homePage =  new HomePageElementsMethods(base.driver);

    }

    @When("^User Selects OneWay Trip$")
    public void user_Selects_OneWay_Trip()  {
        homePage.selectRadioOneWay();
        log.info("User Selected One Way Trip.");
        //System.out.println(base.vin);
    }

    @When("^User Enters SourceAndDestination \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_Enters_SourceAndDestination(String source, String destination) {
        homePage.enterSourceLocation(source);
        homePage.enterDestinationLocation(destination);
        log.info("User Selected Source Location as : " + source + " and Destination as  : " + destination);

    }

    @When("^User Selects DepartureDateAndAdultCount \"([^\"]*)\" ,\"([^\"]*)\"$")
    public void user_Selects_DepartureDateAndAdultCount(String DepartureDate, String adultCount)  {
        homePage.selectDepartDate(DepartureDate);
        log.info("User Entered Departure Date as : " + DepartureDate);
        homePage.selectAdult(adultCount);
        log.info("User Selected Adult count as : " + adultCount);
    }

    @When("^User Click Search Button$")
    public void user_Click_Search_Button() throws Throwable {
        homePage.clickSearchButton();
        log.info("User Clicked on Search Button");
    }


    @When("^User Selects TwoWay Trip$")
    public void user_Selects_TwoWay_Trip()  {
        homePage.selectRadioRoundTrip();
    }

    @When("^User Selects DepartureDateAndReturnDateAndAdultCount \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_Selects_DepartureDateAndReturnDateAndAdultCount(String DepartureDate, String returnDate, String adultCount)  {
        homePage.selectDepartDate(DepartureDate);
        log.info("User Entered Departure Date as : " + DepartureDate);
        homePage.selectReturnDate(returnDate);
        log.info("User Entered Departure Date as : " + returnDate);
        homePage.selectAdult(adultCount);
        log.info("User Selected Adult count as : " + adultCount);
    }




   /* @Then("^User Selects departure date \"([^\"]*)\"$")
    public void user_Selects_departure_date(String DepartureDate) {
         homePage.selectDepartDate(DepartureDate);
    }*/

//    @Then("^User Selects return date \"([^\"]*)\"$")
//    public void user_Selects_return_date(String returnDate) {
//        homePage.selectReturnDate(returnDate);
//    }


    /*@Then("^Select adults \"([^\"]*)\"$")
    public void select_adults(String adultCount) {
        homePage.selectAdult(adultCount);
    }*/


    @Then("^User Selects Children \"([^\"]*)\"$")
    public void user_Selects_Children(String children) {
        homePage.selectChildren(children);
    }

    @Then("^User Selects infant \"([^\"]*)\"$")
    public void user_Selects_infant(String infant) {
        homePage.selectInfant(infant);
    }


//
//    @When("^User Selects Round Trip$")
//    public void user_Selects_Round_Trip()  {
//        homePage.selectRadioRoundTrip();
//    }

    @Then("^user close browser$")
    public void user_close_browser() throws Throwable {
       // closeBrowser();
    }


/*    @Then("^User Enters \"([^\"]*)\"$")
    public void user_Enters(String source) throws Throwable {
        homePage.enterSourceLocation(source);

    }*/

   /* @Then("^User Enter \"([^\"]*)\"$")
    public void user_Enter(String destination) throws Throwable {
        homePage.enterDestinationLocation(destination);
    }*/


    @Then("^User provides Source Location and Destination Location$")
    public void user_provides_Source_Location_and_Destination_Location(DataTable credentials) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
        System.out.println("Vinesh");
        System.out.println(data.get(0).get("Source"));

    }



}
