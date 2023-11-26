package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getloc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver v=new ChromeDriver();
		v.manage().window().maximize();
		v.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Point stf = v.findElement(By.id("twotabsearchtextbox")).getLocation();
         System.out.println(stf.getX());
         System.out.println(stf.getY());
	}

	
}
