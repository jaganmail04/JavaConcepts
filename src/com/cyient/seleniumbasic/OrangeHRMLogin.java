package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		//driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		//driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("personal_txtMilitarySer")).sendKeys("abc");
		driver.findElement(By.id("btnSave")).click();
		
		
		
	}

}
