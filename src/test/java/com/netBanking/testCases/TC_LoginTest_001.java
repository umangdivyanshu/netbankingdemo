package com.netBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netBanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws Exception {
	
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(userName);
		logger.info("Username entered");
		
		lp.enterPassword(password);
		logger.info("Password entered");
		
		lp.clickLogin();
		
		if(driver.getTitle().equals("Guru98 Bank Manager HomePage")) {
			Assert.assertTrue(true, "Actual and expected title matched");
			logger.info("Login Test passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false, "Expected and Actual title not matched");
			logger.info("Login Test failed");
		}
	}

}
