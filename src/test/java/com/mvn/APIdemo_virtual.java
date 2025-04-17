package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class APIdemo_virtual extends baseTest_Virtual {
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		
		// dynamic xpath syntex
		
		//    //class_value[@text='text_value']
		
		//  EX:   //android.widget.TextView[@text='People Names']
		
		WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(element);
		
		
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))")).click();
//		Thread.sleep(3000);
	}
}
