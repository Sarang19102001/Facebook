package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		m.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		m.findElement(By.xpath("//span[text()='Travel']")).click();
		Thread.sleep(1000);
		boolean cbx = m.findElement(By.xpath("(//div[@class='_1XFPmK'])[1]")).isSelected();
		System.out.println(cbx);
	

	}

}
