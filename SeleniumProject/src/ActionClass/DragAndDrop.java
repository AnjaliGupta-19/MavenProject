package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 driver.manage().window().maximize();
		
		 Actions act = new Actions(driver);

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
	    WebElement destination = driver.findElement(By.id("trash"));
	    
	    act.dragAndDrop(source, destination).perform();
	    
	    Thread.sleep(4000);

	    driver.switchTo().defaultContent();
	    
	     WebElement t = driver.findElement(By.linkText("CHEATSHEETS"));
	    		
	    t.getText();
	
	
	    //WebElement t=driver.findElement(By.xpath("//a[text()='CheatSheets']")).getText();
	
	   // WebElement t=driver.findElement(By.xpath("//a[text()='CheatSheets']"));
	   
	   System.out.println(t);
	   
	   Thread.sleep(4000);
	
	   act.keyDown(Keys.CONTROL).perform();
	       t.click();
	
	   act.keyUp(Keys.CONTROL).perform();
	    t.click();
	    
	    act.keyUp(Keys.CONTROL).perform();
	    t.click();
	
	}

}
