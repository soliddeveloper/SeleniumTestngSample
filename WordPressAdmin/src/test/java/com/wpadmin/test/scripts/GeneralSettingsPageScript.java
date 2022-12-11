package com.wpadmin.test.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.wpadmin.test.config.AbstractBaseTest;
import com.wpadmin.test.config.AppTestConstants;


/**
 * 
 * @author Silosha
 *
 */
public class GeneralSettingsPageScript extends AbstractBaseTest {	
	
	
	@Test(dataProvider = "loginCredentials", dataProviderClass = com.wpadmin.test.config.LoginDataProvider.class)	
	public void testLoginPage(String userName, String password, String url) {	
		String expectedBlogName = "Sasilekha Silosha T";
		
		// Navigating to login page
		Flow().navigateTo(url);
		Flow().maximizeBrowser();
		
		// Sending login credentials and click login button
		App().ofPages().ofLoginPage().sendUsername(userName);
		App().ofPages().ofLoginPage().sendPassword(password);
		App().ofPages().ofLoginPage().login();
		
		// Getting current URL
		String newUrl = Flow().getCurrentUrl();		
		
		App().ofPages().ofLeftMenu().clickSettingsMenu();
		
		App().ofPages().ofGeneralSettingsPage().sendBlogName(expectedBlogName);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,130)", "");
		
		App().ofPages().ofGeneralSettingsPage().clickMembership();
		
		App().ofPages().ofGeneralSettingsPage().clickDateFormatRadio();
		
		
		
		String blogName = App().ofPages().ofGeneralSettingsPage().getBlogName();
		
		String expectedUrl = Prop().getProperty(AppTestConstants.ADMIN_URL);
		
		Assert.assertEquals(newUrl, expectedUrl);
		
		Assert.assertTrue(App().ofPages().ofGeneralSettingsPage().isMembershipChecked());
		Assert.assertEquals(blogName, expectedBlogName);
		Assert.assertTrue(App().ofPages().ofGeneralSettingsPage().isDateFormatMdySelected());
	}
}
