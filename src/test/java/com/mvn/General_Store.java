package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class General_Store extends baseTest_Virtual{
	
	
	@Test
	public void name() throws InterruptedException {
		
		// in base test class change the name of application
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pratixa");
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(2000);
		
		// scroll down to element
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"))")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		
		// add to cart
		// //class_value[@text='text_value']
		//driver.findElement(By.id("//android.widget.TextView[@text='text_value']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("class_value[@text='text_value']")).click();
//		Thread.sleep(2000);
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		Thread.sleep(2000);
		
		
		// scroll down to element
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
	}

}
