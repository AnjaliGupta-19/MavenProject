package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {


	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver=new ChromeDriver();
	
	 driver.get("https://www.howtocodeschool.com/2021/10/demo-of-simple-click-and-hold-effect.html");
	
	 driver.manage().window().maximize();

	 Actions act = new Actions(driver);
	 
	 act.moveByOffset(141, 290).clickAndHold().perform();
     
	Thread.sleep(4000);
	
	act.release().perform();
	}    
}
