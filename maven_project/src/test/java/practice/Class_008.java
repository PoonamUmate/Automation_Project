package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_008 extends Base_test {

	public static void main(String[] args) {

		launch_browser("chrome");
		Navigate_url("https://jqueryui.com/slider/");

		// locate frame
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		//locate slider
		WebElement slider = driver.findElement(By.cssSelector("div#slider"));
		
		//action class
		 Actions act = new Actions(driver);
		 act.dragAndDropBy(slider, 200, 0).build().perform();
		 try {
			takescreenshot("slider_forword");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 act.dragAndDropBy(slider, -100, 0).build().perform();
		 try {
			takescreenshot("slider_backword");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
