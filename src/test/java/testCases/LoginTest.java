package testCases;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.TestBase;

public class LoginTest extends TestBase {
	public LoginTest(){
	//	super();
	System.out.println("Class LoginTest execution started");	
	}
	
		
@BeforeMethod
public void setup(ITestContext context) {
	selectBrowserpref();
	context.setAttribute("WebDriver", driver);	
	
	
}

@Test
public void getGoolesSearchTitle() {
	
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("btnK")).click();
	Assert.assertEquals(driver.getTitle(), "selenium  Google Search", "Page title is incorrect");
	
}
}
