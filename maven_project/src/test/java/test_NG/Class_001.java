package test_NG;

import org.testng.annotations.Test;

import practice.Base_test;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_001 extends Base_test {
  @Test
  public void email() {
	  driver.findElement(By.cssSelector("input#email")).click();
  }
  @BeforeSuite
  public void launch_browser() {
	  launch_browser("chrome");
	  Navigate_url("https://www.facebook.com/");
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}
