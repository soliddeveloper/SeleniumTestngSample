package com.wpadmin.pom;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Silosha
 *
 */
public class AppLib {

	private WebDriver driver;

	private PageLib pageLib;

	public AppLib(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver getDriver() {
		return driver;
	}

	public PageLib ofPages() {
		if (pageLib == null) {
			pageLib = new PageLib(getDriver());
		}
		return pageLib;
	}
}
