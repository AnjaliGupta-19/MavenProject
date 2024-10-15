package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchInGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
		
		
		WebElement	searchbox =driver.findElement(By.id("APjFqb"));
		
	searchbox.sendKeys("Rg kar medical college");

	Thread.sleep(3000);
	searchbox.sendKeys(Keys.ENTER);
	 
	Thread.sleep(3000);
	driver.findElement(By.id("dimg_1")). click();



	}

	}

