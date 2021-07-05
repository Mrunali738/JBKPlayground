package playGround;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayGround {
	WebDriver driver = null;
  @Test(priority = 0)
  public void VerifyDateandTime() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://javabykiran.com/playground/");
	  driver.findElement(By.linkText("Date Time Picker")).click();
	  driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]")).sendKeys("07/06/2021");
	  driver.findElement(By.name("submit")).click();
	  driver.close();
  }
  @Test(priority = 1)
  public void VerifyDeleteCustomerSubmitButton() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://javabykiran.com/playground/");
	  driver.findElement(By.linkText("Delete Customer")).click(); 
	  driver.findElement(By.name("cusid")).sendKeys("123456");
	  driver.findElement(By.name("submit")).click();
	  Alert alert = driver.switchTo().alert();
	  String actmsg = alert.getText();
	  String expmsg = "Do you really want to delete this Customer?";
	  Assert.assertEquals(actmsg, expmsg);
	  Thread.sleep(5000);
	 
  }		
  @Test(priority = 2)
  public void VerifyDeleteCustomerResetButton() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://javabykiran.com/playground/");
	  driver.findElement(By.linkText("Delete Customer")).click(); 
	  driver.findElement(By.name("cusid")).sendKeys("123456");
	  driver.findElement(By.name("res")).click();
	  driver.close();
	  Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void VerifyDownloadButton() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://javabykiran.com/playground/");
	  driver.findElement(By.partialLinkText("Download")).click();
	  driver.close();
	  Thread.sleep(2000);
}
  @Test(priority = 4)
  public void VerifyDragAndDrop() {
	  System.setProperty("webdriver.chrome.driver", "C:\\MySoftware\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://javabykiran.com/playground/");
	  driver.findElement(By.linkText("Drag and Drop")).click();
	  driver.findElement(By.id("addInputName")).sendKeys("23");
	  driver.findElement(By.id("addInputSlug")).sendKeys("Selenium");
	  driver.findElement(By.xpath("//*[@id=\"addButton\"]")).click();
	  driver.close();
}}