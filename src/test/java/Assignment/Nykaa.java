package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver n=new ChromeDriver();
		n.manage().window().maximize();
		n.get("https://www.nykaa.com/");
		Thread.sleep(1000);
		WebElement stf=n.findElement(By.name("search-suggestions-nykaa"));
		stf.sendKeys("sunglasses");
		Thread.sleep(1000);
		stf.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		n.findElement(By.xpath("//span[text()='Price']")).click();
		n.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		
//		n.findElement(By.xpath("//DIV[@id='headerMenu']/descendant::*[local-name()='svg' and @fill='none']")).click();
		

	}

}













