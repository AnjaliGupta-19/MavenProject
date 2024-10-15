package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformTheActionByGetRectMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		//to find the location and size of the search bar with the help of getrect()
		
		WebElement search = driver.findElement(By.tagName("input"));
		
		Rectangle rec = search.getRect();
		
		Dimension size = rec.getDimension();
		
		System.out.println(size);
		System.out.println("Height="+size.getHeight());//to get the value separately
		System.out.println("Widht="+size.getWidth());//to get the value separately
		
		Point loc = rec.getPoint();
		System.out.println(loc);
		
		System.out.println("X value="+loc.getX());//to get the value separately
		System.out.println("Y value="+loc.getY());//to get the value separately
		
		driver.close();
		
	}

}
