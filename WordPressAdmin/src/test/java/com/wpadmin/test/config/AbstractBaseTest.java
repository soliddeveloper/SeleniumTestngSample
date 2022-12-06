package com.wpadmin.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.wpadmin.pom.AppLib;
import com.wpadmin.pom.FlowLib;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractBaseTest {

	protected WebDriver driver;
	protected AppLib appLib;
	protected FlowLib flowLib;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("chrome") String browser) {
		if ("chrome".equalsIgnoreCase(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if ("Firefox".equalsIgnoreCase(browser)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		//driver.close();
	}

	public AppLib App() {
		if (appLib == null) {
			appLib = new AppLib(this.driver);
		}
		return appLib;
	}
	
	public FlowLib Flow() {
		if(flowLib == null) {
			flowLib = new FlowLib(this.driver);
		}
		return flowLib;
	}
}
