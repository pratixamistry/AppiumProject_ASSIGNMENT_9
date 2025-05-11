package com.mvn;

import java.time.Duration;
import java.util.Collection;

import javax.sound.midi.Sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class API_PROJECT extends baseTest_Virtual {
	
	@Test
	
	public void name() throws InterruptedException {
		
		//App
		driver.findElement(AppiumBy.accessibilityId("App")).click();;
		Thread.sleep(1000);
		//Alert Dialogs
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();;
		Thread.sleep(1000);
//		//option 1
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		Thread.sleep(1000);
//		//ok
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
//		// opt 2
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
		Thread.sleep(1000);
//		//cancel
		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(1000);
//		//pot 3
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		Thread.sleep(1000);
//		//cancel
		driver.findElement(By.id("android:id/button2")).click();
		Thread.sleep(1000);
//		//opt4
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();		
		Thread.sleep(1000);
//		//command 2
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(1000);
//		//msg displays
		driver.findElement(By.id("android:id/message"));
		Thread.sleep(1000);
//		//back button
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		//opt 5  Progress dialog IS A BUG
//		
//		// opt 6
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		Thread.sleep(1000);
//		// dynamic path
//		//radio button
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Street view']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
//		//opt 6
		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		Thread.sleep(1000);
//		// ckeck box
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Wednesday']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Saturday']")).click();
		Thread.sleep(1000);
//		//ok
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
//		
//		// opt 7 Send Call to VoiceMail IS A BUG
//		
//		//OPT 8
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		Thread.sleep(1000);
//		//name
		driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("pratixa");
		Thread.sleep(1000);
//		//pw
		driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
//		
//		// opt 9
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme")).click();
		Thread.sleep(1000);
//		//ok
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		
		//opt 10
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with Holo Light theme")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		
		//back button
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(1000);
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				Thread.sleep(1000);
				
		// VIEWS
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(1000);
		
		///ANIMATION
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		Thread.sleep(1000);
		
		//Interpolators
		driver.findElement(AppiumBy.accessibilityId("Interpolators")).click();
		
		// drop down menu
	
		//  total 6 elements
		for (int i = 1; i < 7; i++) {
			driver.findElement(By.id("io.appium.android.apis:id/spinner")).click();
			// dynamic x path, but there is no text found , there is number variation at last in xpath, use with number
			WebElement ele = driver.findElement(By.xpath("//android.widget.CheckedTextView["+i+"]"));
			ele.click();
			Thread.sleep(2000);
			
		}
		
		
		
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
//		driver.findElement(AppiumBy.accessibilityId("")).click();
		
		
		
		
		
		
		
	}

//	////////////////////// GRAPHICS
//	driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
//	
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"FingerPaint\"));")).click();

	
	
//	private Collection<org.openqa.selenium.interactions.Sequence> singletonList(Sequence draw) {
//		// TODO Auto-generated method stub
//		return null;
	}


