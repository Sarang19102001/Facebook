package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver l=new ChromeDriver();
				l.manage().window().maximize();
				l.get("https://letcode.in/test");
				Thread.sleep(1000);
				l.findElement(By.linkText("Edit")).click();
				Thread.sleep(1000);
				  boolean is = l.findElement(By.id("fullName")).isEnabled();
				  System.out.println(is);

	}

}