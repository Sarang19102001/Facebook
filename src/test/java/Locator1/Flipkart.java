package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.flipkart.com/");
		f.findElement(By.className("_30XB9F")).click();
//		f.findElement(By.name("q")).sendKeys("Cargos");
//		WebElement searchtf =f.findElement(By.name("q"));
//		searchtf.sendKeys("Camera");
//		To click on enter buttom
		
//		searchtf.sendKeys(Keys.ENTER);
		f.findElement(By.name("q")).sendKeys("Camera");
		Thread.sleep(2000);
		f.findElement(By.className("_2iLD__")).click();
	

	}

}
