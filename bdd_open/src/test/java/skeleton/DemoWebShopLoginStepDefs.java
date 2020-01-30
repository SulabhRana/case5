package skeleton;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class DemoWebShopLoginStepDefs
	{
		WebDriver driver;
		
		public DemoWebShopLoginStepDefs () 
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/jars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			PageFactory.initElements(driver, DemoWebShopLoginPage.class);
		}
			@Given("The URL of the Demo Web Shop {string}")
			public void the_URL_of_the_Demo_Web_Shop(String url) throws InterruptedException
			{
				//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/jars/chromedriver.exe");
		
				driver.get(url);
		
				Thread.sleep(10000);
			}

			@When("User enters {string} as username")
			public void user_enters_as_username(String username) 
			{
				DemoWebShopLoginPage.email.sendKeys(username);
			}

			@When("User enters {string} as password")
			public void user_enters_as_password(String password)
			{
				DemoWebShopLoginPage.password.sendKeys(password);
			}

			@When("User clicks on Login button")
			public void user_clicks_on_Login_button()
			{
				DemoWebShopLoginPage.login.click();
			}

			@Then("User is in a valid page")
			public void user_is_in_a_valid_page()
			{
			Assert.assertTrue(DemoWebShopLoginPage.Logout.isDisplayed());
			DemoWebShopLoginPage.Logout.click();
	}



	}

	
/***********package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoWebShopLoginSteps {
	WebDriver driver;

@Given("The URL of the Demo Web Shop {string}")
public void the_URL_of_the_Demo_Web_Shop(String url) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"src/test/resources/Drivers/jars/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(10000);
}

@When("User enters {string} as username")
public void user_enters_as_username(String username) {
	driver.findElement(By.id("Email")).sendKeys(username);
}

@When("User enters {string} as password")
public void user_enters_as_password(String password) {
	driver.findElement(By.id("Password")).sendKeys(password);
}

@When("User clicks on Login button")
public void user_clicks_on_Login_button() {
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
}

@Then("User is in a valid page")
public void user_is_in_a_valid_page() {
  Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
  driver.findElement(By.linkText("Log out")).click();
}



}
*********/////////////


