package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class case3_1 {
WebDriver driver=null;
	@Given("User opens signin page")
	public void user_opens_signin_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/jars/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	Thread.sleep(5000);
	}
	
    @When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("sulabh");
		driver.findElement(By.id("password")).sendKeys("sul123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
	}
    
	@Then("User will be able to see homepage")
	public void user_will_be_able_to_see_homepage() throws InterruptedException {
	    System.out.println(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(),"Home"); 
	    Thread.sleep(5000);
	}
	
	@When("User searches the product")
	public void user_searches_the_product() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	WebElement search=driver.findElement(By.id("myInput"));
	Actions act1= new Actions(driver);  
	act1.keyDown(search,Keys.SHIFT).perform();
	act1.sendKeys("h").pause(1000).sendKeys("e").pause(1000).sendKeys("a").pause(1000).sendKeys("d").pause(1000).perform();
	act1.keyUp(Keys.SHIFT).perform();
	Thread.sleep(5000);
	Actions act2= new Actions(driver);
	act2.moveToElement(driver.findElement(By.xpath("//div[text()='Headphone']"))).click().perform();
	Thread.sleep(5000);
	}
	
    @When("User selects the product and add to cart")
	public void user_selects_the_product_and_add_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[text()=' Add to cart']")).click();
	    Thread.sleep(5000);
	}
    
    @Then("User will be able to purchase product")
	public void user_will_be_able_to_purchase_product() {
		System.out.println("we are not able to perform the above action ");
	}	
}
