package com.wpadmin.pages;

import com.wpadmin.elements.LeftMenuElements;

public class LeftMenu {
	private LeftMenuElements menuElements;

	public LeftMenu(LeftMenuElements elements) {		
		menuElements = elements;
	}

	private LeftMenuElements getMenuElements() {
		return menuElements;
	}

	public void clickSettingsMenu() {
		this.getMenuElements().getGenSettingsMenu().click();
	}
}
