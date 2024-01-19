package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kani_Naukri {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("kanimoli.m11@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Kani994237*");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	
		// update profiles
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a")).click();
	
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\Users\\vpman\\Downloads\\Kanimoli - Test Engineer.pdf");
	}
	
	

}
