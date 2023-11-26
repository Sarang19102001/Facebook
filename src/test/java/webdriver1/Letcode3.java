package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/test");
		Thread.sleep(2000);
		String Fp=l.getCurrentUrl();
		System.out.println(Fp);
		l.findElement(By.linkText("Tabs")).click();
		Thread.sleep(2000);
		String Sp=l.getCurrentUrl();
		System.out.println(Sp);
		l.findElement(By.id("multi")).click();
		String Tp=l.getCurrentUrl();
		System.out.println(Tp);

	}

}
