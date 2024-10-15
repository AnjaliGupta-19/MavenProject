package ActionClass;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAutomateDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		 driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.id("box"));
		 
		 
		 Actions act = new Actions(driver);
		 
		 act.doubleClick(box).perform();
		
		 Thread.sleep(4000);
		 
		 box.click();

	}

}
