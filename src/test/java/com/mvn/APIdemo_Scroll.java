package com.mvn;

import java.sql.Driver;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class APIdemo_Scroll extends baseTest_Virtual {
	
	@Test
	public void scroll() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		// scroll down till element is found
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))")).click();
		Thread.sleep(3000);
	}

}
