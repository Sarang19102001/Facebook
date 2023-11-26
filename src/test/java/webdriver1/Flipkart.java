package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.flipkart.com/");
		f.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		f.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(1000);
		f.navigate().back();
		f.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		Thread.sleep(1000);
//		f.navigate().back();
//		f.navigate().forward();
//		f.navigate().refresh();
		f.navigate().back();
		f.findElement(By.cssSelector("img[alt='Appliances']")).click();
		Thread.sleep(1000);
		f.navigate().back();
		f.findElement(By.cssSelector("img[alt='Travel']")).click();
		Thread.sleep(1000);
		f.navigate().back();
	}

}
