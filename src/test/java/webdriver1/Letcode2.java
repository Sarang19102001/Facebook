package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/test");
		Thread.sleep(2000);
		l.findElement(By.linkText("Tabs")).click();
		Thread.sleep(2000);
		l.findElement(By.id("home")).click();
		Set<String> parentwindow=l.getWindowHandles();
		System.out.println(parentwindow);
		l.quit();
		
		

	}

}
