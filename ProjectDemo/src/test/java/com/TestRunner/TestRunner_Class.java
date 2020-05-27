package com.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions
(
	
features = "C:\\Users\\Hp\\eclipse-workspace\\ProjectDemo\\src\\test\\resources\\Features File\\testcase.feature",
glue = {"com.StepDefinition"},	        
//plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
//"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extentreport.html"},
  
		       
		     monochrome = true
)
public class TestRunner_Class extends AbstractTestNGCucumberTests {

}
