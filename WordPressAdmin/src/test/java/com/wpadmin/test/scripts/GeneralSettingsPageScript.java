package com.wpadmin.test.scripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wpadmin.test.config.AbstractBaseTest;

public class GeneralSettingsPageScript extends AbstractBaseTest {
	
	String url = "http://3.17.16.254:8080/wp-login.php";
	
	@Test
	public void testLoginPage() {	
		String expectedBlogName = "master";
		
		Flow().navigateTo(url);
		Flow().maximizeBrowser();
		
		App().ofPages().ofLoginPage().sendUsername("user");
		App().ofPages().ofLoginPage().sendPassword("bitnami");
		App().ofPages().ofLoginPage().login();
		
		String expectedUrl = "http://3.17.16.254:8080/wp-admin/";
		
		String newUrl = Flow().getCurrentUrl();
		
		AssertJUnit.assertEquals(newUrl, expectedUrl);
		
		App().ofPages().ofLeftMenu().clickSettingsMenu();
		
		App().ofPages().ofGeneralSettingsPage().sendBlogName(expectedBlogName);
		
		App().ofPages().ofGeneralSettingsPage().clickMembership();
		
		App().ofPages().ofGeneralSettingsPage().clickDateFormatRadio();
		
		AssertJUnit.assertTrue(App().ofPages().ofGeneralSettingsPage().isMembershipChecked());
		
		String blogName = App().ofPages().ofGeneralSettingsPage().getBlogName();
		AssertJUnit.assertEquals(blogName, expectedBlogName);
		AssertJUnit.assertTrue(App().ofPages().ofGeneralSettingsPage().isDateFormatMdySelected());
	}
}
