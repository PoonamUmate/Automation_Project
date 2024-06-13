package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class_011  extends Base_test{

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://demoqa.com/alerts");
		
		
		// alert
		//click on button
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert al = driver.switchTo().alert();
		al.accept();
	}
}
