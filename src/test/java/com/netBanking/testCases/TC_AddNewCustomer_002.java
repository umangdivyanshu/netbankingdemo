package com.netBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netBanking.pageObjects.AddCustomer;
import com.netBanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_002 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws Exception {
		
LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(userName);
		logger.info("Username entered");
		
		lp.enterPassword(password);
		logger.info("Password entered");
		
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		AddCustomer ac = new AddCustomer(driver);
		
		logger.info("Adding new customer details....");
		ac.clickAddNewCustomer();
		ac.custName("Gattu");
		ac.custgender("male");
		ac.custdob("03", "10", "2010");
		
		Thread.sleep(3000);

		ac.custaddress("Friends Colony");
		ac.custcity("Etawah");
		ac.custstate("UP");
		ac.custpinno("206001");
		ac.custtelephoneno("9876556789");
		String email = randomString()+"@gmail.com";
		ac.custemailid(email);
		ac.custpassword("abcdef123");
		ac.custsubmit();
		
		logger.info("New customer details added succesfullly");
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("Customer Registered Successfully!!!") ==true) {
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
		else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		
		
	}
	
}
