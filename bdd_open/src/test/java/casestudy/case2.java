package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class case2 {
	WebDriver driver=null;

@Given("User should be in login page using {string}")
public void user_should_be_in_login_page_using(String string) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/jars/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	Thread.sleep(5000);
   
}

@When("User enetrs {string} and {string}")
public void user_enetrs_and(String username, String password) {
    driver.findElement(By.id("userName")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    
    
}

@When("User enetrs the {string} button")
public void user_enetrs_the_button(String string) {
    driver.findElement(By.name("Login")).click();
}

@Then("User must be in SignOut page")
public void user_must_be_in_SignOut_page() throws InterruptedException {
    //driver.findElement(By.linkText("SignOut"));
	 Assert.assertEquals(driver.getTitle(),"Home");
	    Thread.sleep(5000);
	    driver.quit();
}
}

