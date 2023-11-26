package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		j.get("https://www.ajio.com/");
		  WebElement ajo = j.findElement(By.name("searchVal"));
	ajo.sendKeys("wallet");
	ajo.sendKeys(Keys.ENTER);
	j.findElement(By.xpath("//option[text()='Price (highest first)']")).click();

	}

}
