package practice;


import org.openqa.selenium.JavascriptExecutor;

public class Class_001 extends Base_test {

	public static void main(String[] args)  {
		launch_browser("chrome");
		Navigate_url("https://www.railyatri.in/");

		// scroll page for bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// back button
		js.executeScript("window.history.back()");

	}

}
