package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library_Class {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void LaunchApplication() throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\ProjectDemo\\src\\test\\resources\\properties\\config.properties");
		prop=new Properties();
		prop.load(file);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			
			  System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath")); 
			  driver=new ChromeDriver();
			 			
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.geko.driver", prop.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
	public void Teardown() {
		driver.quit();
	}


}
