package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver t=new ChromeDriver();
		t.manage().window().maximize();
		t.get("https://facebook.com");
		boolean isd = t.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).isDisplayed();
//		boolean isd = t.findElement(By.name("login")).isDisplayed();
		System.out.println(isd);

	}

}
