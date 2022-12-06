package com.wpadmin.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsElements {

	private WebDriver driver;

	@FindBy(id = "blogname")
	private WebElement blogname;

	@FindBy(id = "users_can_register")
	private WebElement membership;

	@FindBy(xpath = "//input[@type='radio' and  @value='m/d/Y']")
	private WebElement dateFormatMdy;

	public GeneralSettingsElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getBlogname() {
		return blogname;
	}

	public WebElement getMembership() {
		return membership;
	}

	public WebElement getDateFormatMdy() {
		return dateFormatMdy;
	}
}
