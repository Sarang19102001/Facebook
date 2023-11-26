package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver v=new ChromeDriver();
		v.manage().window().maximize();
		v.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement un=v.findElement(By.id("username"));
		un.clear();
		Thread.sleep(1000);
		un.sendKeys("Sarang");
	
		WebElement ps=v.findElement(By.id("password"));
		Thread.sleep(1000);
		ps.clear();
		ps.sendKeys("Sar123");
		

	}

}
