package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.myntra.com/");
		Thread.sleep(1000);
		m.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("Watch");
		Thread.sleep(1000);
		m.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		Thread.sleep(1000);
		m.findElement(By.xpath("//img[@alt='Fire-Boltt Ninja Call Ultra  Smartwatch with Bluetooth Calling']")).click();
//        m.findElement(By.xpath("//span[text()='WISHLIST']")).click();
       Thread.sleep(2000);
		Set<String> allwin=m.getWindowHandles();
		System.out.println(allwin);
		Thread.sleep(2000);
		for(String id:allwin) {
			String a=m.switchTo().window(id).getTitle();
			System.out.println(a);
	}
		Thread.sleep(1000);
//	      m.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		m.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
//		m.findElement(By.cssSelector("div[class='itemComponents-base-invisibleBackDrop']")).click();
		
		for(String id:allwin) {
			String alt=m.switchTo().window(id).getTitle();
			System.out.println(alt);
			if(alt.contains("Online Shopping for Women, Men, Kids Fashion &amp; Lifestyle - Myntra"));
			m.navigate().back();
		
}
}
}
