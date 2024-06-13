package practice;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Class_006 extends Base_test{

	public static void main(String[] args) {
	launch_browser("chrome");
	Navigate_url("https://www.jiomart.com");
	try {
		takescreenshot("homepage_jiomart");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//page up
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	try {
		takescreenshot("after_scroll down");
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
	
	//page down
	act.sendKeys(Keys.PAGE_UP).build().perform();
	try {
		takescreenshot("after_scroll up");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
