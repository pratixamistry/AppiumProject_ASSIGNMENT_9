package com.mvn;

import java.io.File;
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
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class baseTest_Virtual {
	AndroidDriver driver;
	//AppiumDriverLocalService builder;
	
	@BeforeTest

	public void before() throws MalformedURLException, InterruptedException {
		
		//// starts appium server
//		
//		builder=new AppiumServiceBuilder()
//						.withAppiumJS(
//						new File("C:\\Users\\Kunal\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//						.withIPAddress("127.0.0.1")
//						.usingPort(4723)
//						.build();
//				builder.start();

		
		// to work with android device
	UiAutomator2Options options =new UiAutomator2Options();

	//set device name
	options.setDeviceName("PRATIXA");

	//to opem a apk file
	//options.setApp("D:\\APK\\apk file\\General-Store.apk");
	options.setApp("D:\\APK\\apk file\\ApiDemos-debug.apk");
	
	
	
	///////////// AMAZON
	//options.setApp("D:\\APK\\apk file\\com.amazon.mShop.android.shopping.apk");
//	options.setAppPackage("in.amazon.mShop.android.shopping");
//	options.setAppActivity("com.amazon.mShop.home.HomeActivity");
	
	///////////// INSTAGRAM
	//options.setApp("D:\\APK\\apk file\\instagram-254-0-0-19-109.apk"); // optional if already installed
//	options.setAppPackage("com.instagram.android");
//	options.setAppActivity("com.instagram.mainactivity.LauncherActivity");

	//com.instagram.mainactivity.LauncherActivity
	
	
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options); 
	
	
	
	///////////////// TOPS
//	options.setCapability("appium:appPackage", "com.tops.careercenter"); // use actual package
//    options.setCapability("appium:appActivity", "com.tops.careercenter.LoginActivity"); 
	
   // driver.get("https://www.tops-int.com");
	
	
//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
//	 driver.get("https://www.tops-int.com");

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
		//driver.quit();
		
	}
}
