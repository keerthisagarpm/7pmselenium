package basicOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageobjectclasses.LoginPage;

public class Login_logout implements Common_vari
{
   public static WebDriver driver;	
   @BeforeMethod
   public static void login() throws EncryptedDocumentException, IOException, InterruptedException
   {
	  System.setProperty(key, value);
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.flipkart.com");
	  String un=DataDriven.getData("Login", 1, 0);
	  String pwd=DataDriven.getData("Login", 1, 1);
	  LoginPage lp = new LoginPage(driver);
	  lp.userName(un);
	  lp.passWord(pwd);
	  lp.loginButton();
	  Thread.sleep(5000);
   }
   @AfterMethod
   public static void logout()
   {
	   driver.quit();
   }
   
   
}
