package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverFinder;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.AppiumBy;

public class API_PROJECT_2 extends baseTest_Virtual {

	@Test
	public void name() throws InterruptedException {
		
		// VIEWS
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(1000);
		
		////////////// seek bar
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));")).click();
//		Thread.sleep(1000);
//		WebElement slider = driver.findElement(By.id("io.appium.android.apis:id/seek"));	
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-1,yAxisStartPoint))
//		.release()
//		.perform();

		
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
		
		///////////////image switcher done
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageSwitcher\"));")).click();
//		Thread.sleep(1000);
//		// no proper locators available, use class and index
//		driver.findElements(By.className("android.widget.ImageView")).get(2).click();
//		Thread.sleep(1000);
//		driver.findElements(By.className("android.widget.ImageView")).get(4).click();
//		Thread.sleep(1000);
		

		
		
		///////////////////// date widjets done
		
//		driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("1. Dialog")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("change the date")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("22 May 2025")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("android:id/button1")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("change the time")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("android:id/hours")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("3")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("android:id/minutes")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(AppiumBy.accessibilityId("10")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("android:id/pm_label")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("android:id/button1")).click();
//		Thread.sleep(1000);
		
		//////////////// date spinner
//		driver.findElement(AppiumBy.accessibilityId("change the time (spinner)")).click();
//		
//		//driver.findElement(By.xpath("//android.widget.EditText[@text='6']")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"6\"));")).click();
//
//		Thread.sleep(1000);
//					
		
		///////////////////////////////////////
//		//AUTO COMPLETE		
		driver.findElement(AppiumBy.accessibilityId("Auto Complete")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("3. Scroll")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Country:\"));")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("ind");
		Thread.sleep(1000);
		// CONTACTS IS A BUG
		
////////////////////////////////////////		
		
		//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
		
	}
}
