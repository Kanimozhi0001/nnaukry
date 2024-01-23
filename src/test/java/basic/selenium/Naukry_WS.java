package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukry_WS {

	public static WebDriver driver;
	public static WebElement fndElmt;
	//public static WebElement usr;
	

	
	public static void fff() throws Exception
	{
	// enter email id
		Thread.sleep(2000);
		
    WebElement usrnm =driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	usrnm.sendKeys("kanimoli.m11@gmail.com");
	
	}
		public static void pswd() throws Exception {

		Thread.sleep(2000);
		
		WebElement pswrd =driver.findElement(By.xpath("//input[@type='password']"));
		pswrd.sendKeys("Kani994237*");
		
	}
	
	
	public static void update() {
			
		Actions a = new Actions(driver);
		//WebElement updt=driver.findElement(By.className("view-profile-wrapper"));
		
		//WebElement updt = driver.findElement(By.partialLinkText("profile"));

		 WebElement fndElmt1 = driver.findElement(By.xpath("//a[text()=' profile']"));
			
			
			fndElmt1.click();
			
		//fndElmt = driver.findElement(By.xpath("//a[text()='View']"));

		//WebElement viewProfileLink = driver.findElement(By.xpath("//a[normalize-space(text())='View profile']"));

		//fndElmt.click();
	
		//a.doubleClick().perform();
		
	}

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	   
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		
		//lgin();
		
		fff();
		pswd();
		update();
		
		//Thread.sleep(5000);
		
		//driver.close();

	
	
	
	
	}
	
	
}
