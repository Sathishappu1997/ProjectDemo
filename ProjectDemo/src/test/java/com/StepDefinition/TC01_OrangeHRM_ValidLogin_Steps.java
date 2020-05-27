package com.StepDefinition;

import java.io.IOException;

import com.BaseClass.Library_Class;
import com.Pages.OrangeHRMLogin_Pages;
import com.SeleniumResuableFunctions.Selenium_Resuable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_OrangeHRM_ValidLogin_Steps extends Library_Class {
	
	OrangeHRMLogin_Pages login;
	Selenium_Resuable selut;
	
	@Given("^launch the browser and the enter the url$")
	public void launch_the_browser_and_the_enter_the_url() throws IOException{
		
		LaunchApplication();
	}

	@When("^login page is opened$")
	public void login_page_is_opened(){
		
		selut=new Selenium_Resuable(driver);
		selut.gettitle();
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username1, String password1){
		
		login = new OrangeHRMLogin_Pages(driver);
		login.username(username1);
		login.password(password1);
	}

	@Then("^click the login button$")
	public void click_the_login_button(){
		
		login.loginbutton();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws IOException{
		
		selut.Take_Screenshot(prop.getProperty("loginscreenshot"));
		Teardown();
	}


}
