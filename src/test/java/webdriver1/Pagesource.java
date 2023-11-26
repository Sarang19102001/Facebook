package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.Flipkart.com/");
		Thread.sleep(1000);
		
		m.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		System.out.println(m.getPageSource());

	}

}
