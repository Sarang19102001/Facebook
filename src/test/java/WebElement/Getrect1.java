package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getrect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver t=new ChromeDriver();
		t.manage().window().maximize();
		t.get("https://facebook.com");
		 Rectangle rect = t.findElement(By.name("login")).getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}

}
