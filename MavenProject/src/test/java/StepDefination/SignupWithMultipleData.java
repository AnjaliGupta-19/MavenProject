package StepDefination;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupWithMultipleData {
	
		   
		  WebDriver driver;
		 
	//Background steps
		
		  @Before
		    public void setup() {
		    	driver=new ChromeDriver();
		    	  driver.manage().window().maximize();
		    	  driver.get("https://automationexercise.com/login");
		    }
		   
		// @After
		 //   public void close() {
		    //	driver.close();	   
		    	
		   // }
	
    @Given("User is at signuppage")
	public void user_is_at_signuppage() {   
    		
    		driver.get("https://automationexercise.com/login");
    	}


	@When("User enter the name and email")
	public void user_enter_the_name_and_email(DataTable dataTable) {
		 List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	     
	     // Extract name and email from the first row
	     String name = data.get(0).get("name");
	     String email = data.get(0).get("email");

	     driver.findElement(By.name("name")).sendKeys(name);
		  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(email);
	}


	@And("click on signup Button")
	public void click_on_signup_button() {
	   driver.findElement(By.xpath("//button[.='Signup']")).click();
	}

	@Then("user naviagted to the information page")
	public void user_naviagted_to_the_information_page() {
		String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
		String exp="ENTER ACCOUNT INFORMATION";
	   assertEquals(act, exp);
	   
	}
}