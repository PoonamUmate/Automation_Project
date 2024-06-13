package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Test_001 extends Base_test {

	public static void main(String[] args) {

		launch_browser("chrome");
		Navigate_url("https://www.irctc.co.in/");
		System.out.println("current url of web page is-" + driver.getCurrentUrl());
		try {
			takescreenshot("screenshot_1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // first element
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).click();
		try {
			takescreenshot("screenshot_2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //second element
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).click();
		try {
			takescreenshot("screenshot_3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// third element
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		try {
			takescreenshot("screenshot_4");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// click after scroll
		driver.findElement(By.xpath("//span[text()='Get Connected with us on social networks']"));
		try {
			takescreenshot("screenshot_5");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
