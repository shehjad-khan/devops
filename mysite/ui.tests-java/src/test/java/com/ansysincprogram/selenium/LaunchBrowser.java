package com.ansysincprogram.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

	@Test
	public void myTest() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://selenium-chrome:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.ansys.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
