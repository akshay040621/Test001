package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;



public class PreApprovalPage {

	
	CommonFunctions cm = new CommonFunctions();
	//Locators - Dashboard
	//locators-- DashBoard
		By inpDashBoardSearchBox=By.xpath("//input[@placeholder='Search...']");
		By lnkUIDlink=By.xpath("(//a[@rel='noreferrer'])[11]");
	
	//Locators- Pre-Approval Docs
	By lnkPreApproval=By.xpath("//a//span[text()='Pre-Approval Docs']");
	By btnEdit=By.xpath("//button[text()='Edit']");
	By selIncomeProof=By.xpath("(//select[@class='slds-select'])[3]");
	By inpUploadFiles=By.xpath("(//span[contains(text(),'Upload Files')])[2]");
	By btnDone=By.xpath("//div//button[text()='Done']");

	
	
	public void searchBox(String uID){
		cm.generateLog("Search UID in textfield",
				cm.click(inpDashBoardSearchBox));
		cm.waitFor(5000);
		cm.setText(inpDashBoardSearchBox, uID);
		cm.waitFor(5000);
		 Robot robot;
		try {
			robot = new Robot();
			 robot.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickOnUidLink(){
		cm.waitFor(5000);

		cm.generateLog("click on Uid link",
				cm.click(lnkUIDlink));
		cm.waitFor(5000);
		}
	
	public void clickOnPreApprovalDocs(){
		cm.waitFor(5000);

		cm.generateLog("click on Pre-Approval docs",
				cm.click(lnkPreApproval));
		cm.waitFor(5000);
		}
	public void clickOnBtnEdit(){

		cm.generateLog("click on Pre-Approval docs",
				cm.click(btnEdit));
		cm.waitFor(5000);
		}
	public void selectIncomeProof(String incomeProof){
		cm.generateLog("Select SubBusiness Vertical DropDown",
		cm.selectDropDownOption(selIncomeProof, incomeProof, "text"));
		cm.waitFor(3000);
	}
	public void uploadDSocument(){
		cm.generateLog("click on Upload Document file",
				cm.click(inpUploadFiles));
		cm.waitFor(5000);
		
	}
	public void clickOnBtnDone(){
		cm.waitFor(5000);
		cm.generateLog("Click On Button Done",
		cm.click(btnDone));
	}
}
