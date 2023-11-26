package sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
//        Dimension a=new Dimension(500,500);
//        driver.manage().window().setSize(a);
//       Point p= driver.manage().window().getPosition();;
//       System.out.println(p);
        Point p=new Point(400,39);
        driver.manage().window().setPosition(p);
        
        
        
	}

}
