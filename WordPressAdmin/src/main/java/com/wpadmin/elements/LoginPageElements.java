package com.wpadmin.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
	
	private WebDriver driver;
	
	@FindBy(name = "log")
	private WebElement userName;
	
	@FindBy(id = "user_pass")
	private WebElement password;
	
	@FindBy(id = "wp-submit")
	private WebElement loginButton;
	
	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}


}
