package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;

import com.QA.TestUtils.EventHandler;



public class TestBase {
	 public static FileInputStream stream;
	 public static String RepositoryFile;
	 public static Properties prop ;
	 public static WebDriver  driver ;
	 public static EventFiringWebDriver eventDriver;
	 public static  EventHandler handler;
public TestBase()  {
	RepositoryFile = "F:\\Selenium Workplace\\MavenProject\\MvnProject\\src\\main\\java\\objectRepository\\config.properties";
	 try {
		stream = new FileInputStream(RepositoryFile);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		e.getMessage();
	}
	 prop  = new Properties();
	 try {
		prop.load(stream);
		
	} catch (IOException e) {
		
		e.printStackTrace();
		e.getMessage();
	}
	
}
	//

//set Browser  pref
public static void selectBrowserpref() {
	if(prop.getProperty("browser").equalsIgnoreCase("chrome") ) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox") ){
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	else {
		
		System.out.println("Plz select a valid browser name");
	}
	
	eventDriver = new EventFiringWebDriver(driver);
	handler = new EventHandler();
    eventDriver.register(handler);
    driver = eventDriver;
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("uRL"));
}


public static void quitBrowser() {
	driver.quit();
	
}

}



