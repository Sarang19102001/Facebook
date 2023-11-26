package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/windows");
		Thread.sleep(1000);
		l.findElement(By.id("home")).click();
		Set<String> ids=l.getWindowHandles();
		System.out.println(ids);
		Thread.sleep(1000);
		
		for( String a:ids) {
			String alt=l.switchTo().window(a).getTitle();
			System.out.println(alt);
			
		}
		l.findElement(By.linkText("Edit")).click();
		

	}

}
