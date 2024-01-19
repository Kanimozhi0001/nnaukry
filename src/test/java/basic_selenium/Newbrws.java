package basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class Newbrws {


	
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/forms");
		driver.findElement(By.id("firstname")).sendKeys("kani");
		driver.findElement(By.id("lasttname")).sendKeys("mozhi");
		driver.findElement(By.id("Phno")).sendKeys("9983457682");
		driver.findElement(By.id("Addl1")).sendKeys("PTC,Thuraipakkam");
		driver.findElement(By.id("state")).sendKeys("TamilNadu");
		driver.findElement(By.id("Addl2")).sendKeys("OMR Road,Chennai");
		driver.findElement(By.id("postalcode")).sendKeys("6000097");
		
		WebElement em = driver.findElement(By.id("email"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		em.clear();
	
		em.sendKeys("xyz@gmail.com");
		WebElement fb = driver.findElement(By.xpath("//label[text()='Address Line-1']"));
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("argument[0].ScrollIntoView();",fb);
		
	
		driver.findElement(By.id("female")).click();
		
		
		List<WebElement> op=driver.findElements(By.xpath("(//div[@class='control'])[10]"));
		Select s= new Select((WebElement) op);
		s.selectByVisibleText("India");
	
	}

	
}
