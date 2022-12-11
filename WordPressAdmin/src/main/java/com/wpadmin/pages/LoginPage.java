package com.wpadmin.pages;

import com.wpadmin.elements.LoginPageElements;

/**
 * 
 * @author Silosha
 *
 */
public class LoginPage {

	private LoginPageElements loginPageElements;

	public LoginPage(LoginPageElements elements) {
		this.loginPageElements = elements;
	}

	private LoginPageElements getLoginPageElements() {
		return loginPageElements;
	}

	public void sendUsername(String name) {
		getLoginPageElements().getUserName().sendKeys(name);
	}

	public void sendPassword(String pwd) {
		getLoginPageElements().getPassword().sendKeys(pwd);
	}

	public void login() {
		getLoginPageElements().getLoginButton().click();
	}

}
