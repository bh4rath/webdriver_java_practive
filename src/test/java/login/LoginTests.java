package login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import webpages.LoginPage;
import webpages.SecureAreaPage;

public class LoginTests extends BaseTests {
	
	@Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = homepage.clickFormAuthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		assertEquals(secureAreaPage.getStatusText(), "You logged into a secure area!×",
				"Alert message is incorrect"); 
	}
}