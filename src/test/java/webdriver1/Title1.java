package webdriver1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		
				ChromeDriver t=new ChromeDriver();
				t.manage().window().maximize();
				t.get("https://facebook.com");
				Thread.sleep(1000);
				System.out.println(t.getTitle());
				

	}

}
