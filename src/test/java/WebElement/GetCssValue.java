package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver k=new ChromeDriver();
		k.manage().window().maximize();
		k.get("https://facebook.com");
		System.out.println(k.findElement(By.xpath("//a[@rel='async']")).getCssValue("border-image-repeat"));
		

	}

}
