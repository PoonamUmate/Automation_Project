package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_007 extends Base_test{

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://www.facebook.com/");
		
		//eamil field
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("poonam@gamil.com");
		
		//password feild
		 WebElement password = driver.findElement(By.xpath("//div[@id='passContainer']//input"));
		 
		 Actions act = new Actions(driver);
		 
		 //select text
		 act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 
		 //copy text
		 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 
		 //tab press
		 act.keyDown(Keys.TAB).build().perform();
		 
		 //paste text
		 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		 try {
			takescreenshot("after_copy paste");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 
		 }

}
