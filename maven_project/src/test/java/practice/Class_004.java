package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_004 extends Base_test {

	public static void main(String[] args) {

		launch_browser("chrome");
		Navigate_url("https://www.amazon.in/");

		// search box
		WebElement search_box = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

		// Action class
		Actions act = new Actions(driver);
		act.click(search_box).build().perform();
		try {
			takescreenshot("after_click");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// mouse hower
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		act.moveToElement(prime).build().perform();
		try {
			takescreenshot("after_mousehower");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement language = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		act.moveToElement(language).build().perform();

		WebElement account = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		act.moveToElement(account).build().perform();

		// double click
		search_box.sendKeys("mobile");
		act.doubleClick(search_box).build().perform();
		try {
			takescreenshot("after_boubleclick");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// right click
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.moveToElement(fashion).contextClick(fashion).build().perform();
		try {
			takescreenshot("after_rightclick");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
