package Popups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopupFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.className("main-3")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'uploadResume resman-btn-primary')]")).click();
		
		Thread.sleep(3000);
		
		
		//below code is used to upload .pdf file
	      File f = new File("./Autoit/Upload4.pdf");
	     
	      WebElement file = driver.findElement(By.cssSelector("input[type=file]"));
	      
	      file.sendKeys(f.getAbsolutePath());	
	     
	      //Thread.sleep(3000);
	     
	      file.sendKeys(Keys.ENTER);
	      
	      
		
		//below method is used to upload .au3 file
	    //Runtime.getRuntime().exec("./Autoit/Upload2.exe");
		
		
		
		
		
		
	}

}
