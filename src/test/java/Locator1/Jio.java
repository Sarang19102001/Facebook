package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.jio.com/");
		Thread.sleep(4000);
		d.findElement(By.linkText("Mobile")).click();
		d.findElement(By.partialLinkText("True 5G")).click();
		d.findElement(By.linkText("JioFiber")).click();
		d.findElement(By.partialLinkText("AirFiber")).click();
		d.findElement(By.linkText("Business")).click();
		d.findElement(By.linkText("Devices")).click();
		d.findElement(By.linkText("Apps")).click();
		Thread.sleep(2000);
		d.findElement(By.partialLinkText("Support")).click();
	}

}
