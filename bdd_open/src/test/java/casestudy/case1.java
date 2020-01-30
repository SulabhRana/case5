package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class case1 
{
	WebDriver driver;
	@Given("The url for TestMe App {string}")
	public void the_url_for_TestMe_App(String string)
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\projrct\\selenium1\\jars\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	   driver.manage().window().maximize();
	}

	@When("User enters {string} as {word}")
	public void user_enters_as_user(String string, String word)
	{
	    driver.findElement(By.id("userName")).sendKeys("sulabh");
	
		driver.findElement(By.id("firstName")).sendKeys("abcd");

		driver.findElement(By.id("lastName")).sendKeys("abcd");

	    driver.findElement(By.id("password")).sendKeys("abc123");
	
	    driver.findElement(By.id("pass_confirmation")).sendKeys("abc123");

		driver.findElement(By.xpath("//input[@value='Female']")).click();

		driver.findElement(By.id("emailAddress")).sendKeys("abcemail@mail.com");

		driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
	
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		
		Select dob1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		dob1.selectByVisibleText("Oct");
		Select dob2 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		dob2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//a[text()=28]")).click();
		
		driver.findElement(By.id("address")).sendKeys("khskhskhn");
	  
		Select sq= new Select(driver.findElement(By.id("securityQuestion")));
		sq.selectByIndex(2);
	
		driver.findElement(By.id("answer")).sendKeys("Doggy");

		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("User is in valid page")
	public void user_is_in_valid_page()
	{
	    WebElement login_page=driver.findElement(By.xpath("//*[contains( text,''Successfully]"));
	    String msg= login_page.getText();
	    if(msg.equals("User Registered Succesfully!!! Please login"))
	    {
	    	System.out.println("User Registered Succesfully!!! Please login");
	    }
	    
	
	}
	
}

