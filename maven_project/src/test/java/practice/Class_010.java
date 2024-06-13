package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class_010 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://www.irctc.co.in/");
		
		
		WebElement from = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
		from.sendKeys("Nagpur");
		
		
		
		
 
 
	}

}
