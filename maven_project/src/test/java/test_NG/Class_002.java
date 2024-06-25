package test_NG;

import org.testng.annotations.Test;

import practice.Base_test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Class_002 extends Base_test{
  @Test
  public void f() {
	  driver.findElement(By.cssSelector("input#from_stn_input")).sendKeys("Nagpur");;
  }
  @BeforeTest
  public void launch_browser() {
	  launch_browser("chrome");
	  Navigate_url("https://www.railyatri.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.cssSelector("input#to_stn_input")).sendKeys("pune");
	  
  }

}
