package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver g=new ChromeDriver();
		g.manage().window().maximize();
		g.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		g.findElement(By.id("newWindowBtn")).click();
//		g.findElement(By.id("newTabBtn")).click(); 
		Thread.sleep(2000);  
		String parentwindow=g.getWindowHandle();
		System.out.println(parentwindow); 
//		Set<String> parentchildwindow=g.getWindowHandles();
//		System.out.println(parentchildwindow);
		g.quit();
		

		

	}

}
