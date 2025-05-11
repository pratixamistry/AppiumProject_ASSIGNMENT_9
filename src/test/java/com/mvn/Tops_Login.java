package com.mvn;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import java.net.URL;
import java.net.MalformedURLException;

public class Tops_Login {
	
	public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14.0"); // match your emulator/device version
        capabilities.setCapability("deviceName", "PRATIXA");
        capabilities.setCapability("browserName", "Chrome");  // Key part for web testing
        capabilities.setCapability("noReset", true); // Keeps Chrome signed-in or preloaded

        WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // Navigate to the website
        driver.get("https://www.tops-int.com");

        // Example test step: get title
        System.out.println("Page Title: " + driver.getTitle());

        // Example test step: Click a menu or link (adjust selector as needed)
        // driver.findElement(By.linkText("Courses")).click();

        driver.quit();
    }

}
