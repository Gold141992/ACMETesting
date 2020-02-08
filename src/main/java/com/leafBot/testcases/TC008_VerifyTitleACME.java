package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import acme.pages.AccountPage;


public class TC008_VerifyTitleACME extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "verifytitleofacme";
		testDescription = "test";
		nodes = "Leads";
		authors = "pandi";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void verifytitleofacme(String email, String pwd) {
		new AccountPage(driver, node, node)
		.enterUName(email)
		.enterPw(pwd)
		.clicklogin()
		.verifyTitle("ACME");
		
		}

}
