package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;


public class OpenEMRLogin {

	public static void main(String[] args) {
		

		
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	//driver.findElement(By.id("authUser")).sendKeys("admin");   
	driver.findElement(By.xpath("//input[@id='authUser']")).sendKeys("admin");
	driver.findElement(By.id("clearPass")).sendKeys("pass");
	Select selectlanguage=new Select(driver.findElement(By.name("languageChoice")));
	selectlanguage.selectByValue("18");     //selectlanguage.selectByVisibleText("English (Indian)");
	driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
	
	}

}
