package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver t=new ChromeDriver();
		t.manage().window().maximize();
		t.get("https://facebook.com");
		Thread.sleep(1000);
		t.findElement(By.name("login")).submit();

	}

}
