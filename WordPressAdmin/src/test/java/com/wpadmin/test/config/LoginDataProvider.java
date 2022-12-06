package com.wpadmin.test.config;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

	@DataProvider
	public String[][] loginCredentials() {
		return new String[][] { { "user", "bitnami", "http://3.17.16.254:8080/wp-login.php" } };
	}
}
