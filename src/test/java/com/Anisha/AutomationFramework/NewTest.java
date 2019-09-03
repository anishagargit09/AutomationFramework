package com.Anisha.AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Ashish Sharma/eclipse-workspace/AutomationFramework/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
  }
}
