package testNgScripts;

import org.testng.annotations.Test;

import com.pageobjectclasses.HomePage;

import basicOperations.Login_logout;

public class Mi extends Login_logout
{
  @Test
  public  static void miMobile() throws InterruptedException
  {
	  HomePage hp = new HomePage(driver);
	  hp.electronice();
	  Thread.sleep(3000);
	  hp.miMobile();
	  Thread.sleep(5000);
  }
}
