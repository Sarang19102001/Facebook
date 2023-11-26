package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver f=new ChromeDriver();
		f.manage().window().maximize();
		f.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		f.findElement(By.linkText("Forgotten account?")).click();

	}

}
