package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver m=new ChromeDriver();
		m.manage().window().maximize();
//		m.get("https://www.meesho.com/");
		m.get("https://www.flipkart.com/");
		Thread.sleep(1000);
//		m.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);	
		
//		Identification of Searchtf
		
//		Dimension tf=m.findElement(By.name("q")).getSize();
		Dimension tf=m.findElement(By.xpath("//button[text()='Request OTP']")).getSize();
//		Dimension tf=m.findElement(By.cssSelector("input[placeholder='Try Saree, Kurti or Search by Product Code']")).getSize();
		System.out.println(tf.getWidth());
		System.out.println(tf.getHeight());
	
		

	}

}
