package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByContainsTextandAttribute {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver= new ChromeDriver();
		 

		driver.get("https://github.com/signup/");
		
		Thread.sleep(4000);
		
		WebElement field = driver.findElement(By. xpath("(//input[contains(@class,'js-continue-input js-continue')])[1]"));
		
		field.sendKeys("anjaligupta1914@gmail.com");
		Thread.sleep(4000);
		
		field.clear();
		Thread.sleep(4000);

		field.sendKeys("janjaligupta191405@gmail.com");
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
		
	    driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("a123456789");
	}

}
