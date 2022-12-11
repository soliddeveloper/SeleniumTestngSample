package com.wpadmin.pom;

import org.openqa.selenium.WebDriver;

import com.wpadmin.elements.GeneralSettingsElements;
import com.wpadmin.elements.LeftMenuElements;
import com.wpadmin.elements.LoginPageElements;

/**
 * 
 * @author Silosha
 *
 */
public class ElementsLib {

	private WebDriver driver;

	private GeneralSettingsElements generalSettingsElements;
	private LeftMenuElements leftMenuElements;
	private LoginPageElements loginPageElements;

	public ElementsLib(WebDriver driver) {
		this.driver = driver;
		initElements(this.driver);
	}

	public void initElements(WebDriver driver) {
		generalSettingsElements = new GeneralSettingsElements(driver);
		leftMenuElements = new LeftMenuElements(driver);
		loginPageElements = new LoginPageElements(driver);
	}

	public GeneralSettingsElements ofGeneralSettingsElements() {
		return generalSettingsElements;
	}

	public LeftMenuElements ofLeftMenuElements() {
		return leftMenuElements;
	}

	public LoginPageElements ofLoginPageElements() {
		return loginPageElements;
	}
}
