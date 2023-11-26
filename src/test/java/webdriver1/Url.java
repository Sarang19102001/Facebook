package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub'
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
//		f.get("https://www.flipkart.com/");
		f.get("https://www.facebook.com/");
		Thread.sleep(1000);
		f.findElement(By.partialLinkText("Forgotten password?")).click();
		System.out.println(f.getCurrentUrl());
		

	}

}
