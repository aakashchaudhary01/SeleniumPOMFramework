package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class RegisterPageTest extends BaseTest {
	
	@BeforeClass
	public void registerSetUp() {
		registerPage = loginPage.navigatingToRegisterPage();
	}
	
	@Test
	public void userRegitrationTest() {
		Assert.assertTrue(registerPage.userRegistration("Madhu", "LastName", "madhu03435@gmail.com", "4554365425", "test@2345"));
	}

}
