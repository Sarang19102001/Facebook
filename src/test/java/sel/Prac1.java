package sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
		Dimension d=new Dimension(400,500);
		cd.manage().window().setSize(d);
		Point p=new Point(400,400);
		cd.manage().window().setPosition(p);
		cd.get("https://www.flipkart.com/");
		cd.close();
		
		EdgeDriver ed= new EdgeDriver();
		ed.manage().window().setSize(d);
		Point p1=new Point(500,300);
		ed.manage().window().setPosition(p1);
		ed.get("https://www.flipkart.com/");
		ed.close();
		
		
		
	}

}
