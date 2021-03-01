package com.vinus.qa.StepDefination;

import Page_Factory.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class searchSteps {

    private HomePage homePage= new HomePage();
    private String searchPlace;
    private String expected;

    @Given("^i am on home page$")
    public void i_am_on_home_page() {
        String actual = homePage.getCurrentURL();
        assertThat(actual,is(endsWith("co.uk/")));
    }

    @When("^i do search for a hotels in \"([^\"]*)\"$")
    public void i_do_search_for_a_hotels_in(String place) {
        searchPlace = place;
        homePage.doSearch(place);
    }

    @Then("^i do select the hotels available in london$")
    public void i_do_select_the_hotels_available_in_london() {
        expected = "London Covent Garden";
        String actualHotel = homePage.getHotelName();
        assertThat(actualHotel,is(expected));
    }

}
