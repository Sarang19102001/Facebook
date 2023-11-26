package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		j.get("https://www.jiocinema.com/");
		Thread.sleep(1000);
		j.findElement(By.linkText("For You")).click();
		Thread.sleep(1000);
		j.findElement(By.linkText("Sports")).click();
		Thread.sleep(1000);
		j.findElement(By.linkText("Movies")).click();
		Thread.sleep(1000);
		j.findElement(By.linkText("TV Shows")).click();
		Thread.sleep(1000);
		j.findElement(By.linkText("News")).click();

	}

}
