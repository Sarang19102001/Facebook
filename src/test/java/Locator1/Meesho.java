package Locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.meesho.com/");
		Thread.sleep(2000);
//		m.findElement(By.cssSelector("input[class='sc-ipEyDJ cNiLPt sc-jKvnYE bKssJi search-input-elm sc-jKvnYE bKssJi search-input-elm")).sendKeys("Denim");
        m.findElement(By.cssSelector("input[placeholder=Try Saree, Kurti or Search by Product Code]")).click();
        Thread.sleep(2000);
        m.findElement(By.xpath("//p[text()='smartwatch']")).click();
	}

}

