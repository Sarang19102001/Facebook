package webdriver1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver j=new ChromeDriver();
		j.manage().window().maximize();
		j.navigate().to("https://licindia.in/web/guest/whole-life-plans");

	}

}
