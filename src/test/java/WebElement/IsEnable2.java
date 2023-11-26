package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.myntra.com/");
		WebElement stf = m.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		stf.sendKeys("Shoes");
		stf.sendKeys(Keys.ENTER);
		boolean ckbx = m.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).isEnabled();
		System.out.println(ckbx);
		
	}

}
