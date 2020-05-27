package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin_Pages {

WebDriver driver;
	
	public OrangeHRMLogin_Pages(WebDriver ldriver) {
		
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement LoginBtn;
	
	
	public void username(String uname) {
		
		Username.sendKeys(uname);
	}
	
	public void password(String pwd) {
		
		Password.sendKeys(pwd);
	}
	
	public void loginbutton() {
		
		LoginBtn.click();
	}
	

}
