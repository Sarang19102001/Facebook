package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd=new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("https://letcode.in/test");
	
//	To search and click the element
	cd.findElement(By.linkText("Edit")).click();
//	Thread.sleep(7000);	
//	cd.findElement(By.id("fullName")).sendKeys("Sarang Ramedwar");
	cd.findElement(By.linkText("Sign up")).click();
	cd.findElement(By.id("name")).sendKeys("Sarang Ramedwar");
	cd.findElement(By.id("email")).sendKeys("Sarang1@gmail.com");
	cd.findElement(By.id("pass")).sendKeys("Sar123");
	cd.findElement(By.id("agree")).click();
	cd.findElement(By.tagName("button")).click();
	
	
	
	}
	}

