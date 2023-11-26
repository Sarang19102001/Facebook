package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.myntra.com/");
		String prfl = m.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")).getTagName();
//		String prfl = m.findElement(By.xpath("//span[text()='Profile']")).getTagName();
		System.out.println(prfl);

	}

}
