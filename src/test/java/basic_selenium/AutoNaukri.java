package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoNaukri {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		 WebDriver dr = new ChromeDriver();
		 dr.get("https://www.naukri.com/nlogin/login");
		 dr.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 dr.findElement(By.xpath("//input[@placeholder='Enter Email ID / Username']")).sendKeys("kanimoli.m11@gmail.com");
		 Thread.sleep(2000);
		 dr.findElement(By.id("passwordField")).sendKeys("Kani994237*");
		 dr.findElement(By.xpath("//button[text()='Login']")).click();
		 
				 Thread.sleep(4000);
		 dr.findElement(By.xpath("//div[@class='view-profile-wrapper']")).click();
		
		//Select slct = new Select(drpdwn);
		//drpdwn.click();
		 JavascriptExecutor jse = (JavascriptExecutor)dr;
		
		 Thread.sleep(5000);
			WebElement drpdwn = dr.findElement(By.xpath("//span[text()='IT skills']"));
			 jse.executeScript("arguments[0]. scrollIntoView(true)",drpdwn );
			 drpdwn.click();

		//String windowHandle = dr.getWindowHandle();
		 //System.out.println(windowHandle);
	}

}
