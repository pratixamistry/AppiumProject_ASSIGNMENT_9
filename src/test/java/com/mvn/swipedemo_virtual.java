package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class swipedemo_virtual extends baseTest_Virtual {

	@Test
public void test() throws InterruptedException {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("android:id/text1")).click();
	Thread.sleep(5000);
	
	
//	WebElement ele = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
//	Thread.sleep(5000);
//	swipeAction(ele, "left");
//	Thread.sleep(5000);
	
	for (int i = 1; i < 3; i++) {
		// dynamic x path, but there is no text found , there is number variation at last in xpath, use with number
		WebElement ele = driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
		Thread.sleep(5000);
		swipeAction(ele, "left");
		Thread.sleep(5000);
	}
	
	
	
	
	
}
	
}
