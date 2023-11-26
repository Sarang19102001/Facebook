package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver g=new ChromeDriver();
		g.manage().window().maximize();
		g.get("https://www.google.com/");
		Thread.sleep(2000);
		g.findElement(By.xpath("//a[contains(@class,'gb_d')]")).click();
		Thread.sleep(2000);	
		g.findElement(By.xpath("//span[text()='YouTube']")).click();
		
		

	}

}
