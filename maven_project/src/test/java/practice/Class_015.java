package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;

public class Class_015 extends Base_test{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		Navigate_url("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
		
		//to select desired file
		StringSelection s =new StringSelection("\"C:\\Users\\poona\\OneDrive\\Documents\\Projects.docx\"");
		
		//copy file location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		try {
			Robot r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}		
		//press control v
		r.key
		
	}

}