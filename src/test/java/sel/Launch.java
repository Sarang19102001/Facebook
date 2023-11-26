package sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
//		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		Dimension d= driver.manage().window().getSize();
		System.out.println(d);
		
		
//		driver.close();
		
	
		
		

	}

}
