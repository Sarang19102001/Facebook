package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		Thread.sleep(1000);
		j.get("https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html");
		Thread.sleep(1000);
		j.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		Thread.sleep(1000);
		System.out.println(j.findElement(By.xpath("(//div[@class='obttns'])[3]")).isEnabled());
//		 boolean ajo = j.findElement(By.name("searchVal")).isEnabled();

	}

}
