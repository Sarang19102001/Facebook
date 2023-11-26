package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.flipkart.com/");
		f.findElement(By.className("_30XB9F")).click();
//		f.findElement(By.cssSelector("img[alt='Mobiles & Tablets']")).click();
		Thread.sleep(2000);
//		f.findElement(By.cssSelector("img[alt='Fashion']")).click();
//        f.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();
//		f.findElement(By.xpath("//span[text()='Grocery']")).click();
		WebElement search=f.findElement(By.name("q"));
		search.sendKeys("realme 11 pro");
		search.sendKeys(Keys.ENTER);
//	
//		f.findElement(By.xpath("(//div[text()='realme 11 Pro+ 5G (Oasis Green, 256 GB)'])[1]]")).click();
		f.findElement(By.xpath("(//div[text()='₹29,999'])[1]")).click();
		Thread.sleep(2000);
		f.findElement(By.xpath("//*[normalize-space(.)='Cart']")).click();
		
	}

}
