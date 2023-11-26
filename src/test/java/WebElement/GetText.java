package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver t=new ChromeDriver();
		t.manage().window().maximize();
		t.get("https://www.ajio.com/");
//		t.get("https://facebook.com");
		System.out.println(t.findElement(By.xpath("//a[text()='HOME AND KITCHEN']")).getText());
//		System.out.println(t.findElement(By.className("_8eso")).getText());
			
	}

}
