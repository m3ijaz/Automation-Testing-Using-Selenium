package firsttest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing4 {
	
	WebDriver driver;
	
	@BeforeTest
	public void init() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	 @Test(priority=1)
	   public void TestUrl() {

	    String ExpectedUrl="https://www.saucedemo.com/";
	     String ActualUrl=driver.getCurrentUrl();
	     Assert.assertEquals(ActualUrl, ExpectedUrl, "Code Run");
	}

	   @Test(priority=2)
	   public void TestTitle() {
	   
	     String ExpectedTitle="Swag Labs";
	     String ActualTitle=driver.getTitle();
	     Assert.assertEquals(ActualTitle, ExpectedTitle, "Code Run");
	     
	}

	 @Test(priority=3)
	 public void login() throws InterruptedException {
		   //userName
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			
			//Password
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			
			//Login Button Click
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
	 }
	  
	 

	 @Test(priority=4)
	 public void AddtoCart() throws InterruptedException {
		 
		    //Sauce Labs Bolt T-Shirt (ADD TO CART)
			driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
			Thread.sleep(3000);
	 }
	 
	 @Test(priority=5)
	 public void cart() throws InterruptedException {
		 
		   //Click on cart button
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
			Thread.sleep(3000);
	 }
	 
	 @Test(priority=6)
	 public void checkout() throws InterruptedException {
		 
		    //Click on Checkout button
		    driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			Thread.sleep(3000);
	 }
	 
	 
	 @Test(priority=7)
	 public void info() throws InterruptedException {
		 
		    //First Name
			driver.findElement(By.id("first-name")).sendKeys("Md. Mahabub Morshed");
			Thread.sleep(2000);
			
			//Last Name
			driver.findElement(By.id("last-name")).sendKeys("Ijaz");
			Thread.sleep(2000);
			
			//Zip/Postal Code
			driver.findElement(By.id("postal-code")).sendKeys("102045");
			Thread.sleep(2000);
			
			//continue button
			driver.findElement(By.id("continue")).click();
			Thread.sleep(3000);
	 }
	 
	 @Test(priority=8)
	 public void finish() throws InterruptedException {
		 
		    //Finish button
			driver.findElement(By.id("finish")).click();
			
			Thread.sleep(3000);
	 }
	 
	 
	 @Test(priority=9)
	 public void home() throws InterruptedException {
		 
		   //Back Home
			driver.findElement(By.id("back-to-products")).click();
			
			Thread.sleep(3000);
	 }
	 
	 
	 @Test(priority=10)
	 public void menu() throws InterruptedException {
		 
		    //Menu
			driver.findElement(By.id("react-burger-menu-btn")).click();
			//driver.navigate().refresh();
			Thread.sleep(3000);
	 }
	 
	 @AfterTest
	 public void logout() throws InterruptedException {
		 
		//Logout
			driver.findElement(By.id("logout_sidebar_link")).click();
			
			Thread.sleep(3000);
			
			driver.quit();
	 }
	 
	 
}


//Test Annotation--> Piece of code. Control flow of test method.Order wise.

//TestNG Annotation is a piece of code which is inserted a program or business logic used to control the flow of test methods.

	//3 types of test annotation--
	//1)Pre condition
	//  @BeforeSuite
    // @BeforeTest
	//  @BeforeClass
	//  @BeforeMethod
	
	
	//2)Test Cases
	//  @Test
	
	//3)Post Condition
	//  @AfterSuite
	 // @AfterTest
	//  @AfterClass
	//  @AfterMethod
