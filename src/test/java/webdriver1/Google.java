package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver g=new ChromeDriver();
		g.manage().window().maximize();
		g.get("https://www.google.com/");
		WebElement searchtf=g.findElement(By.name("q"));
		searchtf.sendKeys("Youtube");
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		g.findElement(By.xpath("//h3[text()='YouTube: Home']")).click();
		Thread.sleep(2000);
//		g.findElement(By.id("search")).sendKeys("Movies");
		g.findElement(By.name("search_query")).sendKeys("GodHand");
		Thread.sleep(2000);
		g.findElement(By.id("search-icon-legacy")).click();		
		
		
	}

}
