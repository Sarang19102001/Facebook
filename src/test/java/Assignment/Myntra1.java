package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.myntra.com/");
		Thread.sleep(1000);
		WebElement stf = m.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		stf.sendKeys("Shoes");
		Thread.sleep(1000);
		stf.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		m.findElement(By.xpath("(//h4[@class='atsa-title'])[3]")).click();
		Thread.sleep(1000);
		m.findElement(By.xpath("(//label[@class='common-customCheckbox'])[10]")).click();

	}

}
