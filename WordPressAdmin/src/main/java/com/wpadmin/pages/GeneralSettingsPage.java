package com.wpadmin.pages;

import com.wpadmin.elements.GeneralSettingsElements;

public class GeneralSettingsPage {
	private GeneralSettingsElements generalSettingsElements;

	public GeneralSettingsPage(GeneralSettingsElements elements) {
		generalSettingsElements = elements;
	}

	private GeneralSettingsElements getGeneralSettingsElements() {
		return generalSettingsElements;
	}

	public void sendBlogName(String name) {
		getGeneralSettingsElements().getBlogname().sendKeys(name);
	}

	public void clickMembership() {
		getGeneralSettingsElements().getMembership().click();
	}

	public void clickDateFormatRadio() {
		getGeneralSettingsElements().getDateFormatMdy().click();
	}
	
	public boolean isMembershipChecked() {		
		return getGeneralSettingsElements().getMembership().isSelected();
	}
	
	public String getBlogName() {
		return getGeneralSettingsElements().getBlogname().getAttribute("value");
	}
	
	public boolean isDateFormatMdySelected() {
		return getGeneralSettingsElements().getDateFormatMdy().isSelected();
	}

}
