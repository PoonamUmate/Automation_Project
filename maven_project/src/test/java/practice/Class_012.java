package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Class_012 extends Base_test {

	public static void main(String[] args) {

		launch_browser("chrome");
		Navigate_url("https://demoqa.com/alerts");

		scroll_page(150);

		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

}
