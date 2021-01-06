package testNgScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsx 
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("file:///C:/Selenium/Locators/ind_dep.html");
	   String collection=driver.findElement(By.xpath("(//td[text()='hebbuli']/../td)[3]")).getText();
	   System.out.println(collection);
	   
   }
}
