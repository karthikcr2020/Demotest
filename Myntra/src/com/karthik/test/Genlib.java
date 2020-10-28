package com.karthik.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Genlib {

	public static void main(String[] args) throws InterruptedException {
		
	   //open the chrome browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
	    WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		 
		//open the myntra application
	    driver.get("https://www.myntra.com/");
	 
	    Thread.sleep(2000);
	    
	    //Login into myntra application using phone number and password
	    Actions a =new Actions(driver); 
	  //a.moveToElement(driver.findElement(By.tagName("//span[.='Profile']"))).perform();
	 // a.moveToElement(driver.findElement(By.className("desktop-userTitle"))).perform();
	   
//	    Thread.sleep(3000);
//	   //we are clicking on LOgin/signup
//	    driver.findElement(By.className("desktop-linkButton")).click();
//	    
//	    Thread.sleep(3000);
//	    //entering username
//	    driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9353372902");
//	    driver.findElement(By.xpath("//div[.='CONTINUE']")).click();
//	    
//	    Thread.sleep(3000);
//	    //entering the password
//	    driver.findElement(By.xpath("//span[.=' Password ']")).click();  
//	    driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("k@rCR2020");
//	     driver.findElement(By.xpath("//button[.='LOGIN']")).click();
//	    
	 
	     a.moveToElement(driver.findElement(By.xpath("//a[.='Men']"))).perform();
	     driver.findElement(By.xpath("//a[.='Topwear']")).click();
	     
	    
		
	}

}
