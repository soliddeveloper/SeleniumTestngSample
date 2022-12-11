package com.wpadmin.pom;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Silosha
 *
 */
public class FlowLib {

	private WebDriver driver;

	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void navigateTo(String url) {
		getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		getDriver().manage().window().maximize();
	}
	
	public String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}

}
