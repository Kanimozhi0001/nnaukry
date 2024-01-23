package basic.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wdr {
	public static void main(String[] args) {
		webdrvr();
	}
	private static void webdrvr()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr =new ChromeDriver();
		dr.get("https://letcode.in/forms");
		dr.manage().window().maximize();
	}

}
