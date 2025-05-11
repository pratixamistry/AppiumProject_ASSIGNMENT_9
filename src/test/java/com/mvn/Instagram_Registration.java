package com.mvn;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Instagram_Registration extends baseTest_Virtual {

	@Test
	
	public void name() throws InterruptedException, IOException {
		Thread.sleep(5000);

        // Tap "Sign up with Email or Phone"
       // driver.findElement(By.id("com.instagram.android:id/sign_up_with_email_or_phone")).click();

        Thread.sleep(2000);
        // Select Email and enter test email
        driver.findElement(By.id("com.instagram.android:id/tab_text")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.instagram.android:id/email_field")).sendKeys("testuser123@example.com");
        Thread.sleep(2000);
        driver.findElement(By.id("com.instagram.android:id/next_button")).click();

        Thread.sleep(2000);
        // Enter Full Name
        driver.findElement(By.id("com.instagram.android:id/full_name_field")).sendKeys("Test User");
        // Enter Password
        driver.findElement(By.id("com.instagram.android:id/password_field")).sendKeys("Test@12345");
        Thread.sleep(2000);
        driver.findElement(By.id("com.instagram.android:id/next_button")).click();

        // Wait for registration steps to complete
        Thread.sleep(5000);

        // Take screenshot after registration
        takeScreenshot("Instagram_Success_Registration");
    }

    public void takeScreenshot(String filename) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File targetFile = new File("D:\\selenium\\screenshots\\" + filename + "_" + timestamp + ".png");
        targetFile.getParentFile().mkdirs();
        org.openqa.selenium.io.FileHandler.copy(srcFile, targetFile);
        System.out.println("📸 Screenshot saved at: " + targetFile.getAbsolutePath());
    }

		
	}

