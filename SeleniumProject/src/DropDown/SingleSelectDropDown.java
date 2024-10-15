package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 driver.manage().window().maximize();
		
		
		Actions act = new Actions(driver);
		
		WebElement drop = driver.findElement(By.tagName("select"));		
	   
		
		
		
		Select sct = new Select(drop);
		
		System.out.println(sct.isMultiple());
		
		sct.selectByIndex(2);
		Thread.sleep(4000);
		sct.selectByValue("AZE");
		Thread.sleep(4000);
		sct.selectByVisibleText("Bhutan");
		
		List<WebElement> opt = sct.getOptions();
	
		System.out.println("THe total numnber is:" + opt.size());
		
		for(WebElement allopt:opt) {
			
			System.out.println(allopt.getText());
		}
	}
}
