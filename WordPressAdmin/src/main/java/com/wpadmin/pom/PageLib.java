package com.wpadmin.pom;

import org.openqa.selenium.WebDriver;

import com.wpadmin.pages.GeneralSettingsPage;
import com.wpadmin.pages.LeftMenu;
import com.wpadmin.pages.LoginPage;

/**
 * 
 * @author Silosha
 *
 */
public class PageLib {

	private WebDriver driver;
	private ElementsLib elementsLib;
	private LoginPage loginPage;
	private LeftMenu leftMenu;
	private GeneralSettingsPage generalSettingsPage;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		initElementsLib(this.driver);
		initPages(this.driver);
	}

	private void initElementsLib(WebDriver driver) {
		elementsLib = new ElementsLib(driver);
	}

	private void initPages(WebDriver driver) {
		loginPage = new LoginPage(ofElementsLib().ofLoginPageElements());
		leftMenu = new LeftMenu(ofElementsLib().ofLeftMenuElements());
		generalSettingsPage = new GeneralSettingsPage(ofElementsLib().ofGeneralSettingsElements());
	}
	
	private ElementsLib ofElementsLib() {
		return elementsLib;
	}

	public LoginPage ofLoginPage() {
		return loginPage;
	}

	public LeftMenu ofLeftMenu() {
		return leftMenu;
	}

	public GeneralSettingsPage ofGeneralSettingsPage() {
		return generalSettingsPage;
	}
}
