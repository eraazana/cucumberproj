package com;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

//class IsItFriday {
//    static String isItFriday(String today) {
//    	if (today.equals("Friday")) {
//            return "TGIF";
//        }
//    	return "Nope";
//    }
//}

public class Stepdefs {
    private String today;
    private String actualAnswer;
    
    static String isItFriday(String today) {
    	if (today.equals("Friday")) {
            return "TGIF";
        }
    	return "Nope";
    }
//
//    @Given("^today is Sunday$")
//    public void today_is_Sunday() {
//        this.today = "Sunday";
//    }
    
    @Given("today is {string}")
    public void today_is_Friday(String val) {
        this.today = val;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}