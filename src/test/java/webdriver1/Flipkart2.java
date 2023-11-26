package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.flipkart.com/");
		f.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		WebElement search=f.findElement(By.name("q"));
		Thread.sleep(2000);
		search.sendKeys("realme 11 pro");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		f.findElement(By.xpath("(//div[text()='₹29,999'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allwin=f.getWindowHandles();
		System.out.println(allwin);
		Thread.sleep(2000);
		for(String id:allwin) {
			String a=f.switchTo().window(id).getTitle();
			System.out.println(a);
//			String a=f.getTitle();
//			System.out.println(a);
		}
        f.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}

}

