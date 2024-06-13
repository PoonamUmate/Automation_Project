package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Class_013 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://demoqa.com/alerts");

		scroll_page(200);

		driver.findElement(By.xpath("//button[@id='promtButton']")).click();

		Alert al = driver.switchTo().alert();
		al.sendKeys("abcd");
		al.accept();
	}

}
