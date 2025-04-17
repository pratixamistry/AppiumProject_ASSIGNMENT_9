package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class baseTest_Virtual {
	AndroidDriver driver;
	
	@BeforeTest

	public void before() throws MalformedURLException, InterruptedException {
		
		// to work with android device
	UiAutomator2Options options =new UiAutomator2Options();

	//set device name
	options.setDeviceName("PRATIXA");

	//to opem a apk file
	options.setApp("D:\\APK\\apk file\\General-Store.apk");
	//options.setApp("D:\\APK\\apk file\\ApiDemos-debug.apk");
	


	//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options); 
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);


	//implicit wait
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(3000);
}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.15
			));		
	}


	
	@AfterTest
	public void after() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		
	}
}
