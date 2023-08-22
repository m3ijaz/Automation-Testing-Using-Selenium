package firsttest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver Initialization 
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();  //creating object of Webdriver & ChromeDriver is a child class of WebDriver
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
//First name:
		driver.findElement(By.id("fname")).sendKeys("Md. Mahabub Morshed");

		
//Last name:
		driver.findElement(By.id("lname")).sendKeys("Ijaz");
		
		
//Gender: [Radio-Button]
		//declare WebElement type variable  //store inside radiobutton
		WebElement radiobutton= driver.findElement(By.id("male"));
		radiobutton.click();	
		//Verify select or not //Boolean type method
	//1st	//isSelected()
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());	
	//2nd	//isEnabled()
		radiobutton.isEnabled();
		System.out.println(radiobutton.isEnabled());
	//3rd	//isDisplayed()
		radiobutton.isDisplayed();
		System.out.println(radiobutton.isDisplayed());
		
		
//Choose an option: [Dropdown]
	//Lets you select only one option 
	    WebElement testDropdown= driver.findElement(By.id("option"));	
	    Select dropdown = new Select(testDropdown);        
	    //we create dropdown element as Select class instance
	    //Select also a class. To initialize an object & specify location.
	    
	    
	    //Can use any of three
	//1st	    //Index
	    //dropdown.selectByIndex(2);
	    
    //2nd	    //Value        //For Assignment [option 2]
	    dropdown.selectByValue("option 2");
	    
   //3rd	    //VisibleText
		//dropdown.selectByVisibleText("Option 3");
	    
	    
	    
//Check list	
	//Lets you select multiple options 
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/input[8]")).click();
        }
}
