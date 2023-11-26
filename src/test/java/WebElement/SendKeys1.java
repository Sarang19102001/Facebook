package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver v=new ChromeDriver();
		v.manage().window().maximize();
		v.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement emtf = v.findElement(By.id("email"));
		Thread.sleep(1000);
		emtf.sendKeys("12345667");
//		emtf.sendKeys("control+"a");
//		emtf.sendKeys("control+"c");
//		emtf.sendKeys("control+"v");
//		emtf.sendkeys("keys.CONTROl+"a");

	}

}
