package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajioasmnt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		j.get("https://www.ajio.com/");
		Thread.sleep(1000);
		WebElement stf = j.findElement(By.name("searchVal"));
		Thread.sleep(1000);
		stf.sendKeys("Shoes");
		Thread.sleep(1000);
		stf.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		j.findElement(By.xpath("//div[text()='Smashic Unisex Sneakers']")).click();
		 Set<String> aw = j.getWindowHandles();
		 for( String id:aw) {
			 String a=j.switchTo().window(id).getTitle();
			 System.out.println(a);
		 }
		j.findElement(By.xpath("//span[text()='SAVE TO WISHLIST']")).click();

	}

}
