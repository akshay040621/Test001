package com.pages;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;


public class CoApplicantAndGuarantorPage extends CommonFunctions {

	CommonFunctions cm = new CommonFunctions();
	//Locators
	//co-Applicant And  Guarantor radiobutton
	By radCoApplicantYes=By.xpath("//input[@name='CoApplicant' and @value='Yes']");
	By radCoApplicantNo=By.xpath("//input[@name='CoApplicant' and @value='No']");
	
	By radGuarantorYes=By.xpath("//input[@name='Guarantor' and @value='Yes']");
	By radGuarantorNo=By.xpath("//input[@name='Guarantor' and @value='No']");
	By btnDone=By.xpath("//div//button[text()='Done']");


	//CoApplicant-personal Details
		By selConstitution=By.xpath("//select[@class='slds-select']");
		By inpMobileNumber=By.xpath("//input[@name='MobileNumber']");
		By btnCoApplicantOTP=By.xpath("//button[@name='GetOTP']");
		By chkCoApplicantConsentForm=By.xpath("//label//span[text()='Consent Form']");
		By selIDProof=By.xpath("//div//div//select[@name='idProofPicklist']");
		By inpIDProofReference=By.xpath("//div//input[@name='idProofReferenceNumber']");
		By inpIDProofExpiry=By.xpath("//input[@name='IDProofExpiryDate__c']");
		By inpCoApplicantGender=By.xpath("//button[@aria-label='Gender, --None--']");
		By inpSalutation=By.xpath("//button[@aria-label='Salutation, Mr']");
		By inpCoApplicantFirstName=By.xpath("//div//input[@name='FirstName__c']");
		By inpCoApplicantLastName=By.xpath("//div//input[@name='LastName__c']");
		By inpCoApplicantDOB=By.xpath("//div//input[@name='DOBIncorporation__c']");
		By inpCoApplicantFatherName=By.xpath("//div//input[@name='FatherName__c']");
		

		//CoApplicant -Demographic details
		By lnkCoApplicantDemographicDetails=By.xpath("//li//a[text()='Demographics Details']");
		By selCoApplicantAddressProof=By.xpath("//select[@name='addressProofPicklist']");
		By inpCoApplicantReferenceNum=By.xpath("//div//input[@name='proofReferenceNumber']");
		By BtnUploadFile1= By.xpath("(//span[@class='slds-file-selector__button slds-button slds-button_neutral'][normalize-space()='Upload Files'])[3]");
		By inpCoApplicantIDExpiry=By.xpath("//div//input[@name='IDProofExpiryDate__c']");
		By inpCoApplicantResidingSince=By.xpath("//div//input[@name='ResidingSinceMth__c']");
		By inpResidenceStatus = By.xpath("//button[@aria-label='Residence Status, Rented']");
		By inpPincode = By.xpath("//input[@name='PresentPinCode__c']");
		By btnSaveAndContinue1 = By.xpath("//button[contains(text(),'Save & Continue')]");

		
		
			//Employment Details
		By inpCoApplicantWorkingSince=By.xpath("//input[@name='WorkingSinceMonths__c']");
		
		//Methods
		
		
		// Co-Applicant or Guarantor
		public void clickOnCoApplicantYesRadioButton(){
			cm.waitFor(7000);
					cm.generateLog("click YES co-Applicant radio button",
					cm.clickUsingJavaScript(radCoApplicantYes));
					//click(radCoApplicantYes));
			}
		public void clickOnCoApplicantNoRadioButton(){
			cm.waitFor(7000);
					cm.generateLog("click No co-Applicant radio button",
					cm.clickUsingJavaScript(radCoApplicantNo));
					//click(radCoApplicantNo));
			}
		
		public void clickOnGuarantorYesRadioButton(){
			cm.waitFor(7000);
					cm.generateLog("click YES co-Applicant radio button",
					cm.clickUsingJavaScript(radGuarantorYes));
					//click(radGuarantorYes));
			}
		public void clickOnGuarantorNoRadioButton(){
			cm.waitFor(7000);
					cm.generateLog("click No co-Applicant radio button",
					cm.clickUsingJavaScript(radGuarantorNo));
					//click(radGuarantorNo));
			}
		public void clickOnBtnDone(){
			cm.waitFor(5000);
			cm.generateLog("Click On Button Done",
			cm.click(btnDone));
		}
		
		// *-*-*-*-*-*-*-CoApplicant-- personal Details*--*-*-*-*-*-*-*-*--
		
		public void setConstitution(String constitution){
			cm.waitFor(5000);
			cm.generateLog("Select Constituiton from DropDown",
					cm.javascriptExecutorScrollBar(selConstitution));

					cm.selectDropDownOption(selConstitution, constitution, "text");
		}
		public void setCoApplicantMobileNumber(String mobile){
			String random=cm.getRandomNumbers(9);
			mobile=9+random;
			cm.generateLog("Set Mobile number into textfield",
			cm.setText(inpMobileNumber, mobile));
		}
		public void ClickOnCoApplicantOTPBtn(){
			cm.waitFor(5000);
			cm.generateLog("click on get OTP button",
					cm.clickUsingJavaScript(btnCoApplicantOTP));
		}
		public void clickOnCoApplicantConsentForm(){
			cm.waitFor(15000);
			cm.generateLog("click on consent form checkbox",
					cm.click(chkCoApplicantConsentForm));
		}
		
		public void selectCoApplicantIDProof(String IDProof){
			cm.waitFor(5000);
			cm.generateLog("Scroll Up, Wait and Select IDproof dropdown",
					cm.javascriptExecutorScrollBar(selIDProof));
			cm.waitFor(5000);
			cm.click(selIDProof);
			cm.generateLog("Select ID prrof DropDown",
					cm.selectDropDownOption(selIDProof, IDProof, "text"));
		}
		public void setCoApplicantIDReferenceNumber(String refNumber){
			cm.waitFor(5000);
			if(cm.checkElementEnable(inpIDProofReference)){
				cm.generateLog("Set present ID proof reference number into textfield",
					cm.setText(inpIDProofReference, refNumber));
			}
		}
		
		public void setCoApplicantIDProofExpiry(String ExpNumber){
			cm.waitFor(5000);
			if(cm.checkElementDisplay(inpIDProofExpiry)){
				cm.generateLog("Set present ID proof Expiry number into textfield",
					cm.setText(inpIDProofExpiry, ExpNumber));
			}
		}
		
		public void uploadIDProof() {
			By BtnUploadFiles = By.xpath("//span[contains(text(),'Upload Files')]");
			cm.waitFor(5000);

			cm.generateLog("click on Upload Document file",
					cm.click(BtnUploadFiles));
			
		}
		public void clickGender(String gender){
			cm.waitFor(35000);
			By BtnUploadFiles = By.xpath("//span[contains(text(),'Upload Files')]");
			//	By locator=By.xpath("//span[contains(text(),'Upload Files')]");
			cm.generateLog("Scroll on upload files",
					cm.javascriptExecutorScrollBar(BtnUploadFiles));
			cm.waitFor(5000);
			cm.click(inpCoApplicantGender);
			cm.waitFor(5000);
			By locator1=By.xpath("//lightning-base-combobox-item//span[@title='"+gender+"']");
			cm.click(locator1);

		}
		public void clickOnSalutation(String salutation){
						cm.generateLog("Click On Salutation List ",
					cm.clickUsingJavaScript(inpSalutation));
			cm.waitFor(5000);
			By locator = By.xpath("//lightning-base-combobox-item//span[text()='"+salutation+"']");
			cm.generateLog("Click on Salutation's chevron-down",
					cm.click(locator));
		}
		public void setCoApplicantFirstName(String coFirstName){
			cm.waitFor(5000);
			cm.generateLog("Set CoApplicant first name into text field",
					cm.setText(inpCoApplicantFirstName, coFirstName));
			
		}
		public void setCoApplicantLastName(String coLastName){
			cm.generateLog("Set CoApplicant last name into text field",
					cm.setText(inpCoApplicantLastName, coLastName));
			}
		public void SetCoApplicantDOB(String doB){
			cm.waitFor(5000);
			cm.generateLog("set CoApplicant DOB into etxfield",
					cm.setText(inpCoApplicantDOB, doB));
		}
		public void setCoApplicantFatherName(String coFatherName){
			cm.waitFor(5000);
			cm.generateLog("Set CoApplicant last name into text field",
					cm.setText(inpCoApplicantFatherName, coFatherName));
			}
		//---------------***------------------------
		//CoApplicant --Demographic details
		
		
		public void clickOnCoApplicantDemographicDetails(){
			cm.generateLog("click on Demographic details link",
					cm.click(lnkCoApplicantDemographicDetails));
		}
		public void selectCoApplicantAddressProof(String addProof){
			cm.waitFor(5000);
			cm.generateLog("Select Addressproof from DropDown",
					cm.selectDropDownOption(selCoApplicantAddressProof, addProof, "text"));
			cm.waitFor(5000);
		}
//		public void (String coReferenceNum){
//			cm.generateLog("Set CoApplicant last name into text field",
//					cm.setText(inpCoApplicantFatherName, coReferenceNum));
//			}
		public void CsetCoApplicantAddresProofReference(String AddressReference) {
			cm.waitFor(5000);
			String random = cm.getRandomNumbers(3);
			AddressReference = AddressReference + random;
			cm.generateLog("Set Address proof reference number",
					cm.setText(inpCoApplicantReferenceNum, AddressReference));
			cm.waitFor(5000);
		}
		
		public void selectOKyC(String Ooptions) {
			cm.waitFor(5000);
			By OKYCL = By.xpath("(//button[@aria-label='OKYC Status, --None--'])[2]");
			cm.waitFor(5000);
			cm.generateLog("Click On OKYC status",
					cm.clickUsingJavaScript(OKYCL));
			cm.waitFor(10000);
			By locator189 = By.xpath("//lightning-base-combobox-item//span[@title='" + Ooptions + "']");
			cm.generateLog("choose Residence status from the dropdown",
					cm.click(locator189));
			System.out.println(locator189);
			cm.waitFor(10000);

		}
		public void uploadAddressProof() {
			cm.waitFor(5000);
			cm.generateLog("Scroll Down for upload",
					cm.javascriptExecutorScrollBar(inpCoApplicantReferenceNum));
			cm.waitFor(5000);
			cm.generateLog("click on Upload Document file",
					cm.clickUsingJavaScript(BtnUploadFile1));
			cm.waitFor(15000);
			

		}
		
		public void clickCheckBox() {
			cm.waitFor(5000);
			By check =By.xpath("(//span[@class='slds-checkbox_faux'])[28]");
			cm.waitFor(5000);
			cm.generateLog("click on checkbox", 
					cm.clickUsingJavaScript(check));
			
		}
		
		public void setCoApplicantResidingsince(String residingSince){
			cm.generateLog("Set CoApplicant last name into text field",
					cm.setText(inpCoApplicantResidingSince, residingSince));
			}
		
		public void setResidenceStatus(String ResidenceStatus) {
//			By srcloc=By.xpath("//button[@aria-label='Distance from Dealer, --None--']");
			cm.generateLog("Scroll Down till residence status textfield",
					cm.javascriptExecutorScrollBar(inpPincode));
			cm.waitFor(5000);
			cm.generateLog("Click On Residence status",
					cm.click(inpResidenceStatus));
			cm.waitFor(5000);
			By locator1 = By.xpath("//div//span[text()='" + ResidenceStatus + "']");
			cm.generateLog("choose Residence status from the dropdown",
					cm.click(locator1));
			System.out.println(locator1);

		}
		public void ClockonSaveAndCon() {
			cm.generateLog("click on Upload Document file",
					cm.click(btnSaveAndContinue1));
			cm.waitFor(5000);
		}
		//*-*-*-*-*-Employment Details*-*-*-*-*-
		
		By inpPrimaryEmpoyemnt = By.xpath("//button[@aria-label='Primary Employment, Self Employed']");
		By inpTypeOfEmployment = By.xpath("//button[@aria-label='Type Of Employment, --None--']");
		By inpNetIncome = By.xpath("//input[@name='NetIncome__c']");
		By inpSearchCompany = By.xpath("(//input[@placeholder='Search Employers...'])[2]");
		By inpWorkingSince = By.xpath("//input[@name='WorkingSinceMonths__c']");
		By btnSaveAndContinue2 = By.xpath("//button[contains(text(),'Save & Continue')]");
		
		public void setPrimaryEmployment(String employment) {
			cm.waitFor(5000);
			cm.generateLog("Click On Primary Employment Textfield",
			cm.click(inpPrimaryEmpoyemnt));
			cm.waitFor(5000);
			By locator1 = By.xpath("//span[text()='" + employment + "']");
			cm.generateLog("choose Primary employment option from the list",
			cm.click(locator1));
		}

		public void setTypeOfEmployment(String tEmployment) {
			cm.waitFor(5000);
			cm.generateLog("Click On Type of Employment Textfield",
			cm.click(inpTypeOfEmployment));
			cm.waitFor(5000);
			By locator1 = By.xpath("//lightning-base-combobox-item//span[text()='" + tEmployment + "']");
			cm.generateLog("choose Type of employment option from the list",
					cm.click(locator1));
		}

		public void setNetInCome(String netIncome) {
			cm.waitFor(5000);
			cm.generateLog("Click On Primary Employment Textfield",
			cm.setText(inpNetIncome, netIncome));
			System.out.println(netIncome);
		}

		public void setCompanyName(String company) {
			cm.generateLog("click on company name textfield",
			cm.click(inpSearchCompany));
			cm.waitFor(5000);
			cm.setText(inpSearchCompany, company);
			cm.waitFor(5000);
			By locator = By.xpath("(//mark[text()='" + company + "'])[2]");
			cm.click(locator);
		}

		public void setWorkingSince(String workSince) {
			cm.waitFor(5000);
			cm.generateLog("Set Working Period in textfield",
			cm.setText(inpWorkingSince, workSince));
		}

		public void clickOnSaveAndContinue2() {
			cm.generateLog("click on save and continue button",
			cm.click(btnSaveAndContinue2));

		}
		
		
		
		
		public void setCoApplicantAddresProofExp(String addProofExp){
			cm.generateLog("Set CoApplicant last name into text field",
					cm.setText(inpCoApplicantIDExpiry, addProofExp));
			}
		
		
		
		//employemnt Details 
		public void setCoApplicantWorkingsince(String workingSince){
			cm.generateLog("Set CoApplicant last name into text field",
					cm.setText(inpCoApplicantWorkingSince, workingSince));
			}
		
		
		
		
}
