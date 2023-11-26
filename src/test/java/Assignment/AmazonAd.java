package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		ChromeDriver v=new ChromeDriver();
		v.manage().window().maximize();
		v.get("https://www.amazon.in/");
		Thread.sleep(1000);
		v.findElement(By.id("twotabsearchtextbox")).sendKeys("boat");
		Thread.sleep(1000);
		v.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		v.findElement(By.xpath("//span[text()='boAt Newly Launched Airdopes 141 ANC TWS Earbuds with 32 dB ANC, 42 HRS Playback, 50ms Low Latency Beast™ Mode, IWP™ Tech,Quad Mics with ENx™,ASAP™ Charge,USB Type-C Port & IPX5(Gunmetal Black)']")).click();
		Set<String> aw=v.getWindowHandles();
		System.out.println(aw);
		Thread.sleep(2000);
		for(String id:aw) {
			String a=v.switchTo().window(id).getTitle();
			System.out.println(a);
		}
		Thread.sleep(1000);
				v.findElement(By.xpath("//input[@aria-labelledby='color_name_7-announce']")).click();
	}

}
