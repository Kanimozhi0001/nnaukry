package basic_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwrk {

	public static void main(String[] args) {
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		dr.findElement(By.name("alert")).click();
		Alert al=dr.switchTo().alert();
		al.accept();
		
	}

}
