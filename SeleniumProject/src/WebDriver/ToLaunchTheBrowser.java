package WebDriver;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchTheBrowser {

	public static void main(String[] args) {

		//to launch the empty browser
		 WebDriver driver=new EdgeDriver();
		
		 //to navigate to the URL and it will take it in a string form
		 driver.get("https://www.flipkart.com/");
		 
		 // to fetch the the title of the browser, we have two ways for this method
		 driver.getTitle();
		 System.out.println("the title of the flipkart : " +driver.getTitle());
		 
//		 String title = driver.getTitle();
//		 System.out.println("The title of the flipkart is : " + title);
		 
		 
		 //to fetch the URL of the website
		 driver.getCurrentUrl();
		 System.out.println("The url of the flipkart is: " + driver.getCurrentUrl());
		 
		 //to fetch the source code
		 driver.getPageSource();
		// System.out.println("The pagesource of flipkart is : " + driver.getPageSource());
		 
		 //to fetch the id of the tab or window
		 driver.getWindowHandle();
		 System.out.println("The window id is : " + driver.getWindowHandle());
		 
		 //to close window close method will close one window at a time. 
		 //driver.close();
		 
		 //to close all the window at a time
		 driver.quit();
	}

}
 