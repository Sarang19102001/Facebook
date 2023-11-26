package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		l.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
//		
		Set<String> ids=l.getWindowHandles();
		System.out.println(ids);
		for(String s :ids) {
//			System.out.println(alltit);
			String alltit=l.switchTo().window(s).getTitle();
			System.out.println(alltit);
			}
		l.findElement(By.id("firstName")).sendKeys("Sarang");
		l.findElement(By.id("lastName")).sendKeys("Ramedwar");

	}

}
