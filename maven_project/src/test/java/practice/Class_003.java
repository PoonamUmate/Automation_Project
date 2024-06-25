package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Class_003 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		// email add
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("abc@gmail.com");

		// password
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("123435");

		// clear input
		email.clear();

		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

		// capture text
		System.out.println("capture text-" + link.getText());

		// capture attribute
		System.out.println("capture attribute-" + link.getAttribute("href"));

		// capture tagname
		System.out.println("capture tagname-" + link.getTagName());

		// capture location x and y coordinate
		System.out.println("capture locaton of email text box-" + email.getLocation().x);

		System.out.println("capture locaton of password text box-" + password.getLocation().y);

		// capture size
		System.out.println("capture size of email text box-" + email.getSize());
		System.out.println("capture size of password text box-" + password.getSize());

		// capture is enable
		System.out.println("email text box is enable-" + email.isEnabled());

		// capture is displayed
		System.out.println("password text box is displayed-" + password.isDisplayed());

		// capture is selected
		System.out.println("email text bot is selected-" + email.isSelected());

		// click on link
		link.click();
		
		//capture screenshot 
		TakesScreenshot ts = (TakesScreenshot) driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File target = new File("../maven_project/Screenshots/screenshot.png");
		  FileHandler.copy(src, target);
	}

}
