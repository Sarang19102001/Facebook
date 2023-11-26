package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.meesho.com/");
		m.findElement(By.cssSelector("input[placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("Shoes");

	}

}
