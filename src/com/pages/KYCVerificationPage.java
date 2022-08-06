package com.pages;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;


public class KYCVerificationPage {

	CommonFunctions cm = new CommonFunctions();
	By lnkSentTo3M=By.xpath("//a[@title='Sent to 3M']");
	By lnkMarkAsCurrentStage=By.xpath("//button//span[text()='Mark as Current Stage']");
	By imgUser=By.xpath("//img[@title='User']");
	By lnkLogOut=By.xpath("	//a[contains(text(),'Log Out')]");
	
	
	
	//methods
	public void clickOnBtnSentTo3M(){

		cm.waitFor(5000);
		cm.generateLog("Click on Sent to 3M button",
		cm.click(lnkSentTo3M));
	}
	public void clickOnBtnMarkAsCurrentStage(){

		cm.waitFor(5000);
		cm.generateLog("Click on Mark As Current Stage button",
		cm.click(lnkMarkAsCurrentStage));
	}
	public void clickOnImgUser(){

		cm.waitFor(5000);
		cm.generateLog("Click on User button",
		cm.click(imgUser));
	}
	public void clickOnLogOut(){

		cm.waitFor(5000);
		cm.generateLog("Click on Logout button",
		cm.click(lnkLogOut));
	}


}
