package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letwin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/windows");
		Thread.sleep(1000);
		l.findElement(By.id("multi")).click();
		Set<String> ids=l.getWindowHandles();
		System.out.println(ids);
		 
		for( String a:ids) {
			String alu=l.switchTo().window(a).getCurrentUrl();
			System.out.println(alu);
			if(alu.contains("https://letcode.in/dropdowns"));{
				l.close();       
	}
		Thread.sleep(1000);
			l.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
//	l.findElement(By.id("accept")).click();
		

}
}
}
