package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class_009 extends Base_test {

	public static void main(String[] args) {
		launch_browser("chrome");
		Navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQjw0_WyBhDMARIsAL1Vz8tVyMutudd_2N3-Imar_oQyZTiI78wxTla5awWPle2GDpBIy3_yp2kaAnI3EALw_wcB");

		
		WebElement drop_down = driver.findElement(By.xpath("//select[@name='reg[relationship]']"));
		
		//select class
		Select s = new Select(drop_down);
		//s.selectByVisibleText("Self");
		//s.selectByValue("3");
		s.selectByIndex(5);
		
	}

}
