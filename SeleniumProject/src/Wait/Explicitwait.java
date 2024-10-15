package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {

       WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://github.com/signup");
		 
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		  WebElement textbox = driver.findElement(By.id("email"));
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(textbox));
	
	textbox.sendKeys("zigzag@gmail.com");
	
	
	
	

}
}