package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtrr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		j.get("https://www.ajio.com/");
		 String ajo = j.findElement(By.name("searchVal")).getAttribute("type");
		 System.out.println(ajo);
		

	}

}
