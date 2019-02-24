package com.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_Script01 {

	public static void main(String[] args) {
		
		//Setup Firefox driver 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\slyam\\Desktop\\Jars Folder\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr177521");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("mUbEpav");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();

	}

}
