package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		

        WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		 driver.get("https://the-internet.herokuapp.com/basic_auth");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		    Thread.sleep(4000);
			
			Robot robo = new Robot();
		  
		 for(int i= 0;i<=1;i++) {
			 robo.keyPress(KeyEvent.VK_TAB);
				
		 }
			   Thread.sleep(4000);
				robo.keyPress(KeyEvent. VK_ENTER);
				
		 	 
		}
		 
		 }


