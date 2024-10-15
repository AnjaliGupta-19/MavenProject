	package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
         WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("https://www.myntra.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		
		driver.findElement(By.linkText("KIDS")) .click();
		
		Thread.sleep(4000);
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent. VK_ENTER);
		
		
		}
	
	

}
