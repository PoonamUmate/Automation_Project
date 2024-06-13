package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_005 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://jqueryui.com");

		// drag and drop
		
		//locate frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		// drag
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));

		//drop
		WebElement drop = driver.findElement(By.xpath("//p[text()='Dropped!']"));

		//action class
		Actions act = new Actions (driver);
		act.dragAndDrop(drag, drop).build().perform();
	}

}
