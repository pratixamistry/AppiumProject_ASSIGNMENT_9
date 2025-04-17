package com.mvn;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class BaseTest {
	AppiumDriver driver;
	
	@BeforeTest
	public void appiumMobile() throws InterruptedException, Exception {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("appium:deviceName", "samsung SM-A346E");
		cap.setCapability("appium:udid","RFCW40WXH6W");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "14.0");
		cap.setCapability( "appium:appPackage","io.appium.android.apis");   //
		cap.setCapability("appium:appActivity","io.appium.android.apis.ApiDemos");   //
		cap.setCapability("appium:automationName", "UIAutomator2");
		//cap.setCapability("appium:noReset", "true");
		
		URL url=new URL("http://127.0.0.1:4723/");
			
			driver=new AppiumDriver(url, cap);

			
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}

	
	@AfterTest
	public void after() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		
	}

}
