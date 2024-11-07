package StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
	WebDriver driver;
	
	@Given("User is at signup page")
	public void user_is_at_signup_page() {
	   
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
	}

	
	@When("User enter the name and email")
	public void user_enter_the_name_and_email() {
	   
		driver.findElement(By.name("name")).sendKeys("anjali");
		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("anjali@1gmail.com");		
	}

	@When("click on signup Button")
	public void click_on_signup_button() {
	    driver.findElement(By.xpath("//button[.='Signup']")).click();
		
		
	}

	@Then("User navigate to the information page")
	public void user_navigate_to_the_information_page() {
	    
		String act= driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
		String exp= "ENTER ACCOUNT INFORMATION";
		assertEquals(act, exp);
		
	}

	
	
}

