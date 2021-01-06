package basicOperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement 
{
   public static void move(WebElement ele)
   {
	   Actions act = new Actions(Login_logout.driver);
	   act.moveToElement(ele).perform();
   }
}
