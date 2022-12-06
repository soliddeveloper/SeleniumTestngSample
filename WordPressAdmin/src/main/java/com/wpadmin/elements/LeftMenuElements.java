package com.wpadmin.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenuElements {
	
	private WebDriver driver;

	@FindBy(linkText = "Settings")
	private WebElement genSettingsMenu;
	
	public LeftMenuElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenSettingsMenu() {
		return genSettingsMenu;
	}
}
