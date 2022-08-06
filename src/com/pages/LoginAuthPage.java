package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;



public class LoginAuthPage {
	CommonFunctions cm = new CommonFunctions();
	
	//locators-- DashBoard
	By inpDashBoardSearchBox=By.xpath("//input[@placeholder='Search...']");
	By lnkUIDlink=By.xpath("(//a[@rel='noreferrer'])[11]");
	By btnEdit=By.xpath("//button[@name='Opportunity.Edit']");
	
	//Locators - form
	By selBroker=By .xpath("//select[@name='selectBroker']");
	//locators- personal and demographic details 

	By inpMailingAddress=By.xpath("//input[@name='PreferredMailingAddress__c']");
	By inpLanguage=By.xpath("//input[@name='Preferred_Language__c']");
	By inpVehicleOwned=By.xpath("//input[@name='NoofVehiclesOwned__c']");
	By lnkDemographics=By.xpath("//a[contains(text(),'Demographics Details')]");
	By radioAddressYes=By.xpath("//label//span[text()='Yes']");
	
	// locators - Emplyment Details
	By inpNatureOfBusiness=By.xpath("//input[@name='DeptNatureofBus__c']");
	By inpEmpAddress1=By.xpath("//input[@name='EmpAddress1__c']");
	By inpEmpAddress2=By.xpath("//input[@name='EmpAddress2__c']");
	By inpEmpLandmark=By.xpath("//input[@name='EmpLandmark__c']");
	By inpEmpPinCode=By.xpath("//input[@name='EmployeePinCode__c']");
	By inpEmpCity=By.xpath("//input[@name='EmployeeCity__c']");
	By inpEmpState=By.xpath("//input[@name='EmployeeState__c']");
	By inpEmpContactNo=By.xpath("//input[@name='EmpContactNo__c']");
	By inpBusProof=By.xpath("//input[@name='BusProofAvail__c']");
	
	//locators-Reference Details
	By inpRefName1=By.xpath("//input[@name='Ref1Name__c']");
	By inpRefMobile1=By.xpath("//input[@name='Ref1MobileNo__c']");
	By inpRefAddress1=By.xpath("//input[@name='Ref1Address1__c']");
	By inpRefPinCode1=By.xpath("//input[@name='Ref1Pincode__c']");
	By inpRelWithApplicant1=By.xpath("//input[@name='Ref1RelwithApp__c']");
	By inpTVRStatus1=By.xpath("//input[@name='TVRStatusRef1__c']");
	By inpRefName2=By.xpath("//input[@name='Ref2Name__c']");
	By inpRefMobile2=By.xpath("//input[@name='Ref2MobileNo__c']");
	By inpRefAddress2=By.xpath("//input[@name='Ref2Address1__c']");
	By inpRefPinCode2=By.xpath("//input[@name='Ref2Pincode__c']");
	By inpRelWithApplicant2=By.xpath("//input[@name='Ref2RelwithApp__c']");
	By inpTVRStatus2=By.xpath("//input[@name='TVRStatusRef2__c']");
	
	//locators-Income Details
	By inpFirstMonthBankfirst=By.xpath("(//input[@name='1st Mth Bank Bal 1st'])[2]");
	//(//label[contains(text(),'1st Mth Bank Bal 1st')])[2]/following-sibling::div//input
	By inpFirstMonthBankFifteen=By.xpath("(//input[@name='1st Mth Bank Bal15th'])[2]");
	By inpFirstMonthBankTwentyFifth=By.xpath("(//input[@name='1st Mth Bank Bal25th'])[2]");
	By inpSecondMonthBankFirst=By.xpath("(//input[@name='2nd Mth Bank Bal 1st'])[2]");
	By inpSecondMonthBankFifteen=By.xpath("(//input[@name='2nd Mth Bank Bal15th'])[2]");
	By inpSecondMonthBankTwentyFifth=By.xpath("(//input[@name='2nd Mth Bank Bal25th'])[2]");
	By inpThirdMonthBankFirst=By.xpath("(//input[@name='3rd Mth Bank Bal 1st'])[2]");
	By inpThirdMonthBankFifteen=By.xpath("(//input[@name='3rd Mth Bank Bal15th'])[2]");
	By inpThirdMonthBankTwentyfifth=By.xpath("(//input[@name='3rd Mth Bank Bal25th'])[2]");
	By inpFourthMonthBankFirst=By.xpath("(//input[@name='4th Mth Bank Bal 1st'])[2]");
	By inpFourthMonthBankFifteen=By.xpath("(//input[@name='4th Mth Bank Bal15th'])[2]");
	By inpFourthMonthBankTwentyfifth=By.xpath("(//input[@name='4th Mth Bank Bal25th'])[2]");
	By inpFifthMonthBankFirst=By.xpath("(//input[@name='5th Mth Bank Bal 1st'])[2]");
	By inpFifthMonthBankFifteen=By.xpath("(//input[@name='5th Mth Bank Bal15th'])[2]");
	By inpFifthMonthBankTwentyFifth=By.xpath("(//input[@name='5th Mth Bank Bal25th'])[2]");
	By inpSixthMonthBankFirst=By.xpath("(//input[@name='6th Mth Bank Bal 1st'])[2]");
	By inpSixthMonthBankFifteen=By.xpath("(//input[@name='6th Mth Bank Bal15th'])[2]");
	By inpSixthMonthBankTwentyfifth=By.xpath("(//input[@name='6th Mth Bank Bal25th'])[2]");
	By inpValidatedIncome=By.xpath("//input[@name='ValidatedIncome__c']");
	
	//Locators-Loan Details
	By selLPORequired=By.xpath("(//select[@class='slds-select'])[3]");
	//Locators - Finance Details
	By inpAddCharge=By.xpath("//input[@name='AdditionalUpfrontCharges__c']");
	By btnDone=By.xpath("//div//button[text()='Done']");
	//Locator - Dashboard
	By btnMarkAsComplete=By.xpath("//button//span[text()='Mark Stage as Complete']");


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
	public void clickOnButtonEdit(){
		cm.generateLog("click on Uid link",
				cm.click(btnEdit));
		cm.waitFor(5000);
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	public void selectBroker(String sBroker){
		cm.waitFor(5000);
		cm.generateLog("Select SubBusiness Vertical DropDown",
		cm.selectDropDownOption(selBroker, sBroker, "text"));
	}
	
	
	public void setMailingAddress(String mAddress){
		cm.generateLog("click on Preferred mailing address",
				cm.click(inpMailingAddress));
		cm.waitFor(5000);
		By locator2=By.xpath("//span[text()='"+mAddress+"']");
		cm.click(locator2);
		
	}
	public void setLanguage(String language){
		cm.generateLog("click on Preferred mailing address",
				cm.click(inpLanguage));
		cm.waitFor(5000);
		By locator2=By.xpath("//lightning-base-combobox-item//span[text()='"+language+"']");
		cm.click(locator2);
	}
	public void setVehicleOwned(String noOfVehicle){
		cm.generateLog("Set no of vehicle owned into textfield",
				cm.setText(inpVehicleOwned, noOfVehicle));
		cm.waitFor(3000);
	}
	public void clickOnDemographicDetails(){
		cm.generateLog("click on Demographic details link",
				cm.click(lnkDemographics));
	}
	public void clickOnAddressYesRadioBtn(){
		cm.waitFor(3000);

		cm.generateLog("click on yes radio button",
				cm.click(radioAddressYes));
		cm.waitFor(3000);
		}
	public void setNatureOfBusiness(String natureOfBusiness){
		cm.generateLog("Set nature of business into textfield",
				cm.setText(inpNatureOfBusiness, natureOfBusiness));
		cm.waitFor(3000);
	}
	public void setEmpAddress1(String empAddress1){
		cm.generateLog("Set employee address into textfield",
				cm.setText(inpEmpAddress1, empAddress1));
		cm.waitFor(3000);
	}
	public void setEmpAddress2(String empAddress2){
		cm.generateLog("Set employee address into second textfield",
				cm.setText(inpEmpAddress2, empAddress2));
		cm.waitFor(3000);
	}
	public void setEmpLandmark(String empLandmark){
		cm.generateLog("Set employee address Landmark into textfield",
				cm.setText(inpEmpLandmark, empLandmark));
		cm.waitFor(3000);
	}
	public void setEmpPincode(String empPincode){
		cm.generateLog("Set employee address Landmark into textfield",
				cm.setText(inpEmpPinCode, empPincode));
		cm.waitFor(3000);
	}
	public void setEmpCity(String empCity){
		cm.generateLog("Set employee address Landmark into textfield",
				cm.setText(inpEmpCity, empCity));
		cm.waitFor(3000);
	}
	public void setEmpState(String empState){
		cm.generateLog("Click On employee state textfield",
				cm.click(inpEmpState));
		cm.waitFor(5000);
		By locator1=By.xpath("//div//lightning-base-combobox-item//span[text()='"+empState+"']");
		cm.generateLog("choose employee state from the dropdown",
				cm.click(locator1));
	}
	public void setEmpContactNumber(String contactNo){
		String random=cm.getRandomNumbers(9);
		contactNo=contactNo+random;
		cm.generateLog("Set Mobile number into textfield",
		cm.setText(inpEmpContactNo, contactNo));
	}
	public void setBusProofAvail(String busProof){
		cm.generateLog("Click On Bus proof available",
				cm.click(inpBusProof));
		cm.waitFor(5000);
		By locator1=By.xpath("//div//lightning-base-combobox-item//span[text()='"+busProof+"']");
		cm.generateLog("choose marital status from the dropdown",
				cm.click(locator1));
	}
	////////////////////////////////////////////////////////////////////////////////
	public void SetRefName1(String ref1Name){

		cm.generateLog("Scroll up till reference name", 
		cm.javascriptExecutorScrollBar(inpRefAddress1));
		cm.waitFor(5000);
		cm.clear(inpRefName1);
		cm.generateLog("set First reference name into textfield",
				cm.setText(inpRefName1, ref1Name));
	}
	public void setRefMobile1(String refmobile1){
		cm.clear(inpRefMobile1);
		String random=cm.getRandomNumbers(9);
		refmobile1=refmobile1+random;
		cm.generateLog("Set first reference mobile into textfield",
				cm.setText(inpRefMobile1, refmobile1));
		cm.waitFor(3000);
	}
	public void setRefAddress1(String RefAddress1){
		cm.clear(inpRefAddress1);

		cm.generateLog("Set first reference address into textfield",
				cm.setText(inpRefAddress1, RefAddress1));
		cm.waitFor(3000);
	}
	public void setRefPinCode1(String RefPinCode1){
		cm.clear(inpRefPinCode1);

		cm.generateLog("Set first reference pincode into textfield",
				cm.setText(inpRefPinCode1, RefPinCode1));
		cm.waitFor(3000);
	}
	public void setRefRelationWithApplicant1(String refRelApp1){

		cm.generateLog("Set first reference relation with Applicant",
				cm.click(inpRelWithApplicant1));
		cm.waitFor(5000);
		By locator1=By.xpath("//div//lightning-base-combobox-item//span[text()='"+refRelApp1+"']");
		cm.generateLog("choose refrence relation from the dropdown",
				cm.click(locator1));
	}
	public void setTVRStatus1(String refTVRStatus1){
		cm.generateLog("Scroll down till TVR status", 
				cm.javascriptExecutorScrollBar(inpTVRStatus1));
				cm.waitFor(5000);
		cm.generateLog("click on TVR status1 textfield",
				cm.click(inpTVRStatus1));
		cm.waitFor(5000);
		By locator1=By.xpath("//div//lightning-base-combobox-item//span//span[text()='"+refTVRStatus1+"']");
		cm.generateLog("choose TVR Status from the dropdown",
				cm.click(locator1));
	}
	public void SetRefName2(String refName2){
		cm.clear(inpRefName2);

		cm.waitFor(3000);
		cm.generateLog("set Second reference name into textfield",
				cm.setText(inpRefName2, refName2));
	}
	public void setRefMobile2(String refmobile2){
		cm.clear(inpRefMobile2);

		String random=cm.getRandomNumbers(9);
		refmobile2=refmobile2+random;
		cm.generateLog("Set Second reference mobile into textfield",
				cm.setText(inpRefMobile2, refmobile2));
		cm.waitFor(3000);
	}
	public void setRefAddress2(String RefAddress2){
		cm.clear(inpRefAddress2);

		cm.generateLog("Set Second reference address into textfield",
				cm.setText(inpRefAddress2, RefAddress2));
		cm.waitFor(3000);
	}
	public void setRefPinCode2(String RefPinCode2){
		cm.clear(inpRefPinCode2);

		cm.generateLog("Set Second reference pincode into textfield",
				cm.setText(inpRefPinCode2, RefPinCode2));
		cm.waitFor(3000);
	}
	public void setRefRelationWithApplicant2(String refRelApp2){
		cm.generateLog("Set Second reference relation with Applicant",
				cm.click(inpRelWithApplicant2));
		cm.waitFor(5000);
		By locator1=By.xpath("(//div//lightning-base-combobox-item//span[text()='"+refRelApp2+"'])[2]");
		cm.generateLog("choose refrence relation from the dropdown",
				cm.click(locator1));
	}
	public void setTVRStatus2(String refTVRStatus2){
		cm.generateLog("click on TVR status textfield",
				cm.click(inpTVRStatus2));
		cm.waitFor(5000);
		By locator1=By.xpath("(//lightning-base-combobox-item//span[text()='"+refTVRStatus2+"'])[2]");
		cm.generateLog("choose TVR Status from the dropdown",
				cm.click(locator1));
	}
	////////////////////////////////////////////////////////////////////////////////////////
	public void SetFirstMonthBankBalFirst(String FirstMonthBankfirst){

		cm.generateLog("Scroll up till first month bank month bank balance", 
		cm.javascriptExecutorScrollBar(inpFirstMonthBankFifteen));
		cm.waitFor(5000);
		cm.generateLog("set First month,date first bank balance into textfield",
				cm.setText(inpFirstMonthBankfirst, FirstMonthBankfirst));
	}
	public void SetFirstMonthBankBalFifteen(String FirstMonthBankfifteen){
		cm.generateLog("set First month date fifteen bank balance into textfield",
				cm.setText(inpFirstMonthBankFifteen, FirstMonthBankfifteen));
		cm.waitFor(3000);
	}
	public void SetFirstMonthBankBalTwentyfifth(String FirstMonthBanktwentyfifth){
		cm.generateLog("set First month, date twentyfifth bank balance into textfield",
				cm.setText(inpFirstMonthBankTwentyFifth, FirstMonthBanktwentyfifth));
		cm.waitFor(3000);
	}
	public void SetSecondMonthBankBalFirst(String SecondMonthBankfirst){
		cm.generateLog("set Second month,date first bank balance into textfield",
				cm.setText(inpSecondMonthBankFirst, SecondMonthBankfirst));
		cm.waitFor(3000);
	}
	public void SetSecondMonthBankBalFifteen(String SecondMonthBankfifteen){
		cm.generateLog("set Second month date fifteen bank balance into textfield",
				cm.setText(inpSecondMonthBankFifteen, SecondMonthBankfifteen));
		cm.waitFor(3000);
	}
	public void SetSecondMonthBankBalTwentyfifth(String SecondMonthBanktwentyfifth){
		cm.generateLog("set Second month date twentyfifth bank balance into textfield",
				cm.setText(inpSecondMonthBankTwentyFifth, SecondMonthBanktwentyfifth));
		cm.waitFor(3000);
	}
	public void SetThirdMonthBankBalFirst(String ThirdMonthBankFirst){
		cm.generateLog("set third month date First bank balance into textfield",
				cm.setText(inpThirdMonthBankFirst, ThirdMonthBankFirst));
		cm.waitFor(3000);
	}
	public void SetThirdMonthBankBalFifteen(String ThirdMonthBankfifteen){
		cm.generateLog("set third month date Fifteen bank balance into textfield",
				cm.setText(inpThirdMonthBankFifteen, ThirdMonthBankfifteen));
		cm.waitFor(3000);
	}
	public void SetThirdMonthBankBalTwentyFifth(String ThirdMonthBankTwentyFifth){
		cm.generateLog("set third month date twentyfifth bank balance into textfield",
				cm.setText(inpThirdMonthBankTwentyfifth, ThirdMonthBankTwentyFifth));
		cm.waitFor(3000);
	}
	public void SetFourthMonthBankBalFirst(String FourthMonthBankFirst){
		cm.generateLog("set fourth month date twentyfifth bank balance into textfield",
				cm.setText(inpFourthMonthBankFirst, FourthMonthBankFirst));
		cm.waitFor(3000);
	}
	public void SetFourthMonthBankBalFifteen(String FourthMonthBankFifteen){
		cm.generateLog("Scroll Down till fifth month date first textfield", 
				cm.javascriptExecutorScrollBar(inpFifthMonthBankFirst));
				cm.waitFor(5000);
		cm.generateLog("set Fourth month date fifteen bank balance into textfield",
				cm.setText(inpFourthMonthBankFifteen, FourthMonthBankFifteen));
		cm.waitFor(3000);
	}
	public void SetFourthMonthBankBalTwentyFifth(String FourthMonthBankTwentyfifth){
		cm.generateLog("set Fourth month date Twentyfifth bank balance into textfield",
				cm.setText(inpFourthMonthBankTwentyfifth, FourthMonthBankTwentyfifth));
		cm.waitFor(3000);
	}
	public void SetFifthMonthBankBalFirst(String FifthMonthBankFirst){
		cm.generateLog("set Fifth month date First bank balance into textfield",
				cm.setText(inpFifthMonthBankFirst, FifthMonthBankFirst));
		cm.waitFor(3000);
	}
	public void SetFifthMonthBankBalFifteen(String FifthMonthBankFifteen){
		cm.generateLog("set Fifth month date Fifteen bank balance into textfield",
				cm.setText(inpFifthMonthBankFifteen, FifthMonthBankFifteen));
		cm.waitFor(3000);
	}
	public void SetFifthMonthBankBalTwentyFifth(String FifthMonthBankTwentyfifth){
		cm.generateLog("set Fifth month date Twentyfifth bank balance into textfield",
				cm.setText(inpFifthMonthBankTwentyFifth, FifthMonthBankTwentyfifth));
		cm.waitFor(3000);
	}
	public void SetSixthMonthBankBalFirst(String SixthMonthBankFirst){
		cm.generateLog("set Six month date First bank balance into textfield",
				cm.setText(inpSixthMonthBankFirst, SixthMonthBankFirst));
		cm.waitFor(3000);
	}
	public void SetSixthMonthBankBalFifteen(String SixthMonthBankFifteen){
		cm.generateLog("set Six month date Fifteen bank balance into textfield",
				cm.setText(inpSixthMonthBankFifteen, SixthMonthBankFifteen));
		cm.waitFor(3000);
	}
	public void SetSixthMonthBankBalTwentyFifth(String SixthMonthBankTwentyfifth){
		cm.generateLog("set Six month date Twentyfifth bank balance into textfield",
				cm.setText(inpSixthMonthBankTwentyfifth, SixthMonthBankTwentyfifth));
		cm.waitFor(3000);
	}
	public void SetValidatedIncome(String validatedincome){
		cm.generateLog("set validated income into textfield",
				cm.setText(inpValidatedIncome, validatedincome));
		cm.waitFor(3000);
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	public void selectLPORequired(String lpoRequired){
		cm.waitFor(5000);
		cm.generateLog("Select LPO Required from DropDown",
		cm.selectDropDownOption(selLPORequired, lpoRequired, "text"));
	}
	////////////////////////////////////////////////////////////////////////////////////
	public void SetAdditinalCharge(String additionalCharge){
		cm.generateLog("set additonal upfront charges into textfield",
				cm.setText(inpAddCharge, additionalCharge));
		cm.waitFor(3000);
	}
	public void clickOnBtnDone(){
		cm.waitFor(5000);
		cm.generateLog("Click On Button Done",
		cm.click(btnDone));
	}
	////////////////////////////////////////////////////////////////////
	
	public void clickOnBtnMarkAsComplete(){
		cm.waitFor(5000);
		cm.generateLog("Click On Button Mark Stage as complete",
		cm.click(btnMarkAsComplete));
	}
}











