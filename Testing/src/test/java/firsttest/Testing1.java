package firsttest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver Initialization 
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();  //creating object of Webdriver & ChromeDriver is a child class of WebDriver
		
		String ExpectedTitle="Swag Labs";
		String ExpectedURL="https://www.saucedemo.com/";
		
		driver.get("https://www.saucedemo.com/");
		//driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//3 types of wait: sleep, implicit wait, explicit wait
		Thread.sleep(3000);
		driver.navigate().refresh();
		//driver.navigate.forward();
		//driver.navigate.back();
		
		
		
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		//URL Check
		//Code:1
	//	if(ActualURL.equals(ExpectedURL)) {
	//		System.out.println("URL Matched");
	//	}
	//	else
	//	{
	//		System.out.println("URL Doesn't Match");
    //	}
		
		
		//Code:2
		Assert.assertEquals(ActualURL,ExpectedURL,"Condition True");
		
		
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		//Title Check
		//Code:1
    	if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title Doesn't Match");
		}
		
		
		//Code:2   Assertion
		
		//Assert.assertEquals(ActualTitle,ExpectedTitle,"Condition True");
		
		
		
		
		//Login with userName & Password
		
		//userName
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Login Button Click
		driver.findElement(By.id("login-button")).click();
		
		
	    
		//driver.close();  //close only current tab
		//driver.quit();    //close entire browser session with all tabs
	}

}
