package testNgScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.pageobjectclasses.HomePage;

import basicOperations.DataDriven;
import basicOperations.Login_logout;

public class SearchMobile extends Login_logout
{
   @Test
   public static void searchMobile() throws EncryptedDocumentException, IOException, InterruptedException
   {
	  String data = DataDriven.getData("Home", 1, 0);
	  HomePage hp = new HomePage(driver);
	  hp.seabox(data);
	  hp.seaicon();
	  Thread.sleep(5000);
   }
}
