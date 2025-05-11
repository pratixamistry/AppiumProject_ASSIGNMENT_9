package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Amazon_login_ch {
		static AppiumDriver driver;
		
	    public static void main(String[] args) throws MalformedURLException, InterruptedException {
	        // Initialize DesiredCapabilities
	        DesiredCapabilities cap = new DesiredCapabilities();

	        // Set Appium 2.0 desired capabilities
	        cap.setCapability("appium:deviceName", "Samsung SM-A346E"); // Device name
	        cap.setCapability("appium:udid", "RFCW40WXH6W"); // UDID for real device
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("appium:platformVersion", "14.0"); // Version of the Android device/emulator
	        cap.setCapability("appium:appPackage", "in.amazon.mShop.android.shopping"); // Amazon India app package
	        cap.setCapability("appium:appActivity", "com.amazon.mShop.home.HomeActivity"); // Amazon India app activity
	        cap.setCapability("appium:automationName", "UiAutomator2");
	        cap.setCapability("noReset", true);  // Keeps the app state between test runs

	        // Initialize AndroidDriver with the capabilities
URL url=new URL("http://127.0.0.1:4723/");
			
			driver  =new AppiumDriver(url, cap);

			
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Already a customer')]")).click();

//	       

	        // Optional: Add further steps like entering email/password
	        /*
	        driver.findElementById("ap_email").sendKeys("your-email@example.com");
	        driver.findElementById("continue").click();
	        driver.findElementById("ap_password").sendKeys("your-password");
	        driver.findElementById("signInSubmit").click();
	        */

	        // Close the driver
	        // driver.quit();
	    }
	}



