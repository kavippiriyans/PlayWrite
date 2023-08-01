package Facebook_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {

	public static void main(String[] args)  
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");

        // Fill in the login credentials (replace with your own Facebook email/username and password)
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("pass"));

        emailInput.sendKeys("9025564644");
        passwordInput.sendKeys("7598364644");

        // Click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginButton.click();

        // After clicking the login button, a popup may appear. Switch to the popup window.
        // Get the handles of all open windows
      
	}

}
