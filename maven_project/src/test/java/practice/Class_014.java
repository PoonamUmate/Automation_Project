package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Class_014 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://www.naukri.com/");
		scroll_page(200);

		
		//switch to child window
		
		// click on MNC
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> it = window_id.iterator();
		String parent_window = it.next();
		String child_window = it.next();
		driver.switchTo().window(child_window);
		System.out.println("parent window id is-"+parent_window);
		System.out.println("parent window id is-"+child_window);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		
	}
	
	

}
