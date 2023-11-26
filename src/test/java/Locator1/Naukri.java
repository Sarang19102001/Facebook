 package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver n=new ChromeDriver();
		n.manage().window().maximize();
		n.get("https://www.Naukri.com/");
		n.findElement(By.id("login_Layer")).click()	;
		Thread.sleep(2000);
		n.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]")).sendKeys("SArnga");
		Thread.sleep(2000);
		n.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]")).sendKeys("sar123");
		Thread.sleep(2000);
		n.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

	}

}
