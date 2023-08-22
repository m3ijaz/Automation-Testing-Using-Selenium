package firsttest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				//WebDriver Initialization 
				WebDriverManager.chromedriver().setup();
				WebDriver driver =new ChromeDriver();
				
				
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.navigate().refresh();
				
				
				//Login with userName & Password
				
				//userName
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//Password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				//Login Button Click
				driver.findElement(By.id("login-button")).click();
				
				Thread.sleep(3000);
				
				//Sauce Labs Bolt T-Shirt (ADD TO CART)
				driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
			
				Thread.sleep(3000);
				
				//Click on cart button
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
				
				Thread.sleep(3000);
				
				//Click on Checkout button
				driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
				
				Thread.sleep(3000);
				
				//First Name
				driver.findElement(By.id("first-name")).sendKeys("Md. Mahabub Morshed");
				
				//Last Name
				driver.findElement(By.id("last-name")).sendKeys("Ijaz");
				
				//Zip/Postal Code
				driver.findElement(By.id("postal-code")).sendKeys("102045");
				
				//continue button
				driver.findElement(By.id("continue")).click();
				
				Thread.sleep(3000);
				
				//Finish button
				driver.findElement(By.id("finish")).click();
				
				Thread.sleep(3000);
				
				//Back Home
				driver.findElement(By.id("back-to-products")).click();
				
				Thread.sleep(3000);
				
				//Menu
				driver.findElement(By.id("react-burger-menu-btn")).click();
				
				Thread.sleep(3000);
				
				//Logout
				driver.findElement(By.id("logout_sidebar_link")).click();
				
				Thread.sleep(3000);
				
				driver.quit();
	}

}
