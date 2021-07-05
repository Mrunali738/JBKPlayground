package playGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookieEx {

	public static void main(String[] args) throws Exception {
			  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("http://javabykiran.com/playground/");
			  driver.findElement(By.partialLinkText("Cookie")).click();
			  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kjashjbs");
			  driver.findElement(By.xpath("//[@name='password']")).sendKeys("65376");
			  driver.findElement(By.linkText("Sign In")).click();
	 
		  }

	}


