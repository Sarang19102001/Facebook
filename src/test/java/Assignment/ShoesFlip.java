package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoesFlip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.flipkart.com/");
		f.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		WebElement search=f.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("Shoes for mens");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		f.findElement(By.xpath("//a[text()='Walking Shoes For Men']")).click();
		Set<String> aw=f.getWindowHandles();
		System.out.println(aw);
		Thread.sleep(2000);
		for(String id:aw) {
			String a=f.switchTo().window(id).getTitle();
			System.out.println(a);
	}
		f.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

}
}
