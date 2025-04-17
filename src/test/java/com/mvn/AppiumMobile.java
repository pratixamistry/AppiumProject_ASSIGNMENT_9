package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class AppiumMobile {
@Test

	
	public void name() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("appium:deviceName", "samsung SM-A346E");
		cap.setCapability("appium:udid","RFCW40WXH6W");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "14.0");
		cap.setCapability( "appium:appPackage","com.dencreak.dlcalculator"); 
		cap.setCapability("appium:appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("appium:automationName", "UIAutomator2");
		cap.setCapability("appium:noReset", "true");
		
		URL url=new URL("http://127.0.0.1:4723/");
			
			AppiumDriver driver=new AppiumDriver(url, cap);

			
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		String resultString = driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_result")).getText();
		System.out.println(resultString);
		driver.quit();
		
	}
}
