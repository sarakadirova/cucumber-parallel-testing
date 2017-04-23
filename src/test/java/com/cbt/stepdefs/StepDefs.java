package com.cbt.stepdefs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class StepDefs {

	private WebDriver driver;
	
	public StepDefs(SharedDriver shareDriver){
		driver=shareDriver;
	}
	
	@Given("^I am on home page$")
	public void I_am_on_home_page() throws Throwable {
	    //go to google
		driver.get("http://google.com");
	}

	@Then("I should be able to(.*)$")
	public void I_should_be_able_to_register_one(String option) throws Throwable {
	    //search 
		driver.findElement(By.name("q")).sendKeys(option);
		Thread.sleep(2000);
		
	}


}
