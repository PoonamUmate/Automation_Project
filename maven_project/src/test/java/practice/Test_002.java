package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test_002 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://netmeds.com");

		Actions act = new Actions(driver);

		// wellness
		WebElement wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
		act.moveToElement(wellness).build().perform();
		try {
			takescreenshot("wellness");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// beauty
		WebElement beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
		act.moveToElement(beauty).build().perform();
		try {
			takescreenshot("beauty");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// locate search box
		driver.findElement(By.cssSelector("input#search"));
		act.sendKeys("Dolo").keyDown(Keys.ENTER).build().perform();

	}

}
