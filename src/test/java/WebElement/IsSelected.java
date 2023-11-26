package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver l=new ChromeDriver();
		l.manage().window().maximize();
		l.get("https://letcode.in/test");
		Thread.sleep(1000);
		l.get("https://letcode.in/radio");
		boolean cbx = l.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(cbx);
	}

}
