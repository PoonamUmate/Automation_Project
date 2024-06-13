package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Base_test {
	public static WebDriver driver;

	// Dynamic code for launch browser
	public static void launch_browser(String Browser) {

		if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launch Browser is-" + Browser);
	}

	// Dynamic code for navigate url
	public static void Navigate_url(String url) {
		driver.get(url);
		System.out.println("Navigate url is-" + url);
		System.out.println("Title of webpage is-" + driver.getTitle());
	}

	// Dynamic code for takescreenshot
	public static void takescreenshot(String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../maven_project/Screenshots/" + screenshotname + ".png");
		FileHandler.copy(src, target);
	}
	
	//scroll page
	public static void scroll_page(int ypoints) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+ypoints+")");
	}

}
