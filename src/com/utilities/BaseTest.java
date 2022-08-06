package com.utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest  {
		public static WebDriver driver;
		
public void initialization(String url){
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src_resource\\Drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
	driver.get(url);
	

	
	
	
	// calling all Setter methods from the GetterSetterInstance
	

	
	//this.getWebDriverWait();
}





	


}
