package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.myntra.com/");
     
	 WebElement kid = driver.findElement(By.linkText("KIDS"));
    
	 Actions act = new Actions(driver);
    
   
    //Action class by moveToElement(webElement)
   // act.moveToElement(kid) .perform();   //.perform is mandatory for action class methods.
    
   
    //Action class by moveByOffset()
    act.moveByOffset(435, 34).click().perform();
	
  }

	}

