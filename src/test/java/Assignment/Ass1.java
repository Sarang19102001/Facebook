package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/test");
		l.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		l.navigate().back();
		l.findElement(By.linkText("Click")).click();
		Thread.sleep(2000);
		l.navigate().back();
	    l.findElement(By.linkText("Drop-Down")).click();
		Thread.sleep(2000);
		l.navigate().back();
		l.findElement(By.linkText("Dialog")).click();
		Thread.sleep(2000);
		l.navigate().back();
		
	

	}

}
