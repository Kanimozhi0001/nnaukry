package basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelNaukri {
	public static void main(String[] args) throws Exception {
		
	
	
	  // Specify your Naukri username and password
   // String naukriUsername = "yehovadenial@gmail.com";
    String naukriPassword = "Daniel2456@";

    // Set the path to the ChromeDriver executable
    System.setProperty("webdriver.edge.driver", "C:\\Users\\SURENDRAN\\eclipse-workspace\\SeleniumDay2\\Driver\\msedgedriver.exe");

    // Initialize the Chrome WebDriver
   // WebDriver driver = new EdgeDriver();
    WebDriver driver = new ChromeDriver();

    // Navigate to the Naukri login page
    driver.get("https://www.naukri.com/nlogin/login");
    //To maximize the window
    driver.manage().window().maximize();
    // Find the username and password input fields and login button
    Thread.sleep(3000);
    WebElement usernameField = driver.findElement(By.cssSelector("usernameField"));
    WebElement passwordField = driver.findElement(By.id("passwordField"));
    WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));

    Thread.sleep(3000);
    
    // Enter your username and password, then click the login button
    usernameField.sendKeys("yehovadenial@gmail.com");
    passwordField.sendKeys(naukriPassword);
    loginButton.click();

    // Navigate to the "My Naukri" page
    //driver.get("https://www.naukri.com/mnjuser/my-naukri");

    // Find and click the "Update Profile" button
    Thread.sleep(5000);
    WebElement updateProfileButton = driver.findElement(By.xpath("//a[text()='View']"));
    updateProfileButton.click();

    // Find the "Summary" field and update it with your new summary
    Thread.sleep(3000);
    WebElement profile = driver.findElement(By.xpath("(//span[text()='Profile summary'])[1]"));
    profile.click();
    Thread.sleep(3000);
    
    
    WebElement summaryField = driver.findElement(By.xpath("(//span[text()='editOneTheme'])[20]"));
    summaryField.click();
    Thread.sleep(5000);
   
    
    WebElement editdetails = driver.findElement(By.id("profileSummaryTxt"));
    editdetails.clear();
      Thread.sleep(4000);
    //String summaryText = "Your updated summary text goes here";
    editdetails.sendKeys("Your updated summary text goes here");
   
    
    WebElement saved = driver.findElement(By.xpath("//button[text()='Save']"));
    saved.click();
     System.out.println("success");
    // Save the updated summary
    //summaryField.sendKeys(Keys.RETURN);

    // Close the browser
    //driver.quit();
}


}
