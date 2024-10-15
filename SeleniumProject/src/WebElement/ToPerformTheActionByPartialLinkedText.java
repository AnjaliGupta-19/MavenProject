package WebElement;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformTheActionByPartialLinkedText {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		//driver.findElement(By.partialLinkText("Home")).click();
		
		
		//to get the linktext
		 WebElement home = driver.findElement(By.partialLinkText("Home"));	
		  
		 System.out.println("The text of link is:" + home.getText());
		 
		 System.out.println(home.isEnabled());//true
		 
		 System.out.println(home.isDisplayed());//true
		 
		 System.out.println(home.isSelected());//false
		 
		 //home.getAttribute("attribute name");//to find the attribute value
			System.out.println("Attribute value :"+home.getAttribute("style"));
			
			System.out.println("Css value :"+home.getCssValue("color"));
		 
		 home.click();
		 driver.close();
		 

}  
}