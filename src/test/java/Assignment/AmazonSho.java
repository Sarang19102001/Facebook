package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSho {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.amazon.com/");
		Thread.sleep(1000);
		a.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(1000);
		a.findElement(By.id("nav-search-submit-button")).click();

	}

}
