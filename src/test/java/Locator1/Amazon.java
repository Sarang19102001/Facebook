package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.amazon.com/");
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("Clothes");
//		a.findElement(By.id("nav-search-submit-button")).click();
//		a.findElement(By.cssSelector("div[aria-label='camera']")).click();
//		a.findElement(By.cssSelector("div[aria-label='clock mechanism']")).click();
		Thread.sleep(2000);
		a.findElement(By.cssSelector("div[aria-label='clothes rack']")).click();
	}

}
