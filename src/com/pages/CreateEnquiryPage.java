package com.pages;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;



public class CreateEnquiryPage extends CommonFunctions {
	CommonFunctions cm = new CommonFunctions();

	//*-*-*-*-*-*-*-*Locators-Souring*-*-*-*-*-*-

	By btnCreateEnquiry = By.xpath("//button[text()='Create Enquiry']");
	By InpSearchSupplier = By.xpath("//input[@placeholder='Search Supplier']");
	By LnkRkAuto = By.xpath("//div[contains(text(),'R K AUTOMOBILES # BANKURA')]");
	By InpSharedWith = By.xpath("//div[contains(@class,'cLoanEnquiryCreation')]//input[@placeholder='Search...']");
	By LnkSharedWith = By.xpath("//div[contains(text(),'7305DMA 7305DMA')]");
	By SelSubVertical = By.xpath("//select[@name='subBv']");
	By BtnOtp = By.xpath("//button[text()='Get OTP']");
	By ChkConsentForm = By.xpath("//span[text()='Consent Form']//preceding-sibling::span");
	By slctBM = By.xpath("(//select[@class='slds-select'])[2]");
	By ChkEmi = By.xpath("//span[text()='No']//preceding-sibling::span");
	By BtnSaveAndContinue = By.xpath("//button[text()='Save & Continue']");

	//*-*-*-*-*-*-*-*-*- Locators- Personal and Demographic Details*-*-*-*-*-*-*-.
	By selperm = By.xpath(
			"//input[@name='permanentAddress']/following::span[contains(text(),'Yes')]/preceding::span[@class='slds-radio_faux']");
	By SelIdProof = By.xpath("//select[@name='idProofPicklist']");
	By InpIdProofExp = By.xpath("//input[@name='IDProofExpiryDate__c']");
	By InpReferenceNum = By.xpath("//input[@name='idProofReferenceNumber']");
	By BtnUploadFiles = By.xpath("//span[contains(text(),'Upload Files')]");
	By InpGender = By.xpath("//form[@class='slds-form']//input[@name='Gender__c']");
	// By InpFatherName=By.xpath("//input[@name='FatherName__c']");
	By InpCreditCard = By.xpath("(//label[contains(text(),'Credit Card (Last 6 Digits)')]/following-sibling::div/input)[2]");
	By InpCreditCardBank = By.xpath("//button[@aria-label='Credit Card Bank, --None--']");
	// By InpCreditCardBank=By.xpath("//input[@name='CreditCardBank__c']");
	By InpMaritalStatus = By.xpath("//button[@aria-label='Marital Status, --None--']");
	By DOB = By.xpath("//input[@name='DOBIncorporation__c']");
	By SDHO = By.xpath("//input[@name='DOBIncorporation__c']");
	// By SDHO=By.xpath("//input[@name='SDHWO__c']");
	By SDHOFirstName = By.xpath("//input[@name='SDHWoFirstName__c']");
	By SDHOMiddleName = By.xpath("//input[@name='SDHWoMiddleName__c']");
	By SDHOLastName = By.xpath("//input[@name='SDHWoLastName__c']");
	By lnkDemographics = By.xpath("//a[contains(text(),'Demographics Details')]");
	By inpAddressProof = By.xpath("//select[@name='addressProofPicklist']");
	By inpAddressProofRef = By.xpath("//input[@name='proofReferenceNumber']");
	By BtnUploadFile1 = By.xpath("(//span[contains(text(),'Upload Files')])[2]");
	By inpPresentAddress1 = By.xpath("//input[@name='PresentAddress1__c']");
	By inpPresentAddress2 = By.xpath("//input[@name='PresentAddress2__c']");
	By inpLandmark = By.xpath("//input[@name='PresentLandmark__c']");
	By inpPincode = By.xpath("//input[@name='PresentPinCode__c']");
	// **
	By inpResidenceStatus = By.xpath("//button[@aria-label='Residence Status, Rented']");
	By inpResiding = By.xpath("//input[@name='ResidingSinceMth__c']");
	By inpPropertyStatus = By.xpath("//button[@aria-label='Property Status, --None--']");
	By btnSaveAndContinue1 = By.xpath("//button[contains(text(),'Save & Continue')]");

	// *-*-*-*-*-*-*Permanent Demographic Details*--*-*-*-*-
	// By SltDDadrsproof=By.xpath("//span[text()='Type of Address
	// Proof']/following::select[@name='addressProofPicklist']");

	By SltDDadrsproof = By.xpath("(//select[@name='addressProofPicklist'])[2]");
	By PRbtn = By.xpath("(//span[contains(text(),'Upload Files')])[4]");
	By PRNUM = By.xpath("//label[text()='Permanent Address reference number']//following::input[1]");
	By PRA1 = By.xpath("(//input[@name='PermanentAddress1__c']");
	By PRA2 = By.xpath("(//input[@name='PermanentAddress2__c']");
	By PRL1 = By.xpath("(//input[@name='PermanentLandmark__c']");
	By PRPC1 = By.xpath("(//input[@name='PermanentPinCode__c']");

	// *-*-*-*-*-*--*-Employment*-*-*-*-*-*-*-*
	By inpPrimaryEmpoyemnt = By.xpath("//button[@aria-label='Primary Employment, Self Employed']");
	By inpTypeOfEmployment = By.xpath("//button[@aria-label='Type Of Employment, --None--']");
	By inpNetIncome = By.xpath("//input[@name='NetIncome__c']");
	By inpSearchCompany = By.xpath("(//input[@placeholder='Search Employers...'])[2]");
	By inpWorkingSince = By.xpath("//input[@name='WorkingSinceMonths__c']");
	By btnSaveAndContinue2 = By.xpath("//button[contains(text(),'Save & Continue')]");

	// *-*-*-*-*-*-*-*-Loan and Scheme Details*-*-*-*-*-*-*-
	By inpSearchProduct = By.xpath("//input[@placeholder='Search Products...']");
	By inpModel = By.xpath("//ul//li[4]//div//span[contains(text(),'DISCOVER 125 DISC BS IV')]");
	By lnkSchemeDetails = By.xpath("//a[text()='Scheme Details']");

	// *-*-*-*-*-*-*-*-*--*-Finance Details*-*-*-*-*-*-*-*
	// By selRepaymentMode=By.xpath("//select[@class='slds-select']");
	By selRepaymentMode = By.xpath("//span[contains(text(),'Repayment Mode')]/following::select/option[@value='A']");
	By inpAmountFinanced = By.xpath("//input[@name='amountFinanced']");
	By inpTenure = By.xpath("//input[@name='tenure']");
	By inpROI = By.xpath("//input[@name='roi']");

	// *-*-*-*-*-*-*-Banking Details*-*-*-*-*-*-*-*-
	By lnkBankingDetails = By.xpath("//a[contains(text(),'Banking Details')]");
	By inpRepaymentFrom = By.xpath("//button[@aria-label='Repayment From, Applicant']");
	By lnkHeaderCoApplicantGuarantor = By.xpath("//li[contains(text(),'Co-App/Guarantor')]");

	// *-*-*-*-*-DashBoard*-*-*-*-
	By btnMarkAsComplete = By.xpath("//button//span[text()='Mark Stage as Complete']");

	// *-*-*-*-Methods-Souring*-*-*-*-*-
	public void clickOnBtnCreateEnquiry() {

		cm.waitFor(5000);
		cm.generateLog("Click on Create enquiry button",
				cm.click(btnCreateEnquiry));
	}

	public void setSupplierName() {
		
		cm.waitFor(35000);
		cm.generateLog("Set supplier name into textfield",
				cm.click(InpSearchSupplier));

	}

	public void clickOnSupplierNameOptions(String SupplierName) {
		cm.waitFor(3000);

		By locator = By.xpath("//ul//*[@data-name='" + SupplierName + "' or contains(text(),'" + SupplierName + "') ]");
		cm.generateLog("Click on Supplier Name Option ", SupplierName,
				cm.click(locator));

	}

	public void clickOnSharedWith() {
		cm.waitFor(3000);

		cm.generateLog("Click On Shared with",
				cm.click(InpSharedWith));
	}

	public void clickOnSharedWithOptions(String shareWith) {
		cm.waitFor(5000);
		By locator = By.xpath("//ul[@class='slds-lookup__list'] //li//div[contains(text(),'" + shareWith + "')]");
		cm.generateLog("Click on SahredWith options",
				cm.click(locator));
	}

	public void selectSubBusinessVertical(String option) {
		cm.javascriptExecutorScrollBar(BtnOtp);
		cm.generateLog("Select SubBusiness Vertical DropDown",
				cm.selectDropDownOption(SelSubVertical, option, "text"));
	}

	public void clickOnGetOTP() {
		cm.generateLog("Click On GetOTP",
				cm.click(BtnOtp));
		cm.waitFor(25000);
	}

	public void clickOnConsentForm() {

		cm.waitFor(25000);
		cm.generateLog("Click On ConsentForm",
				cm.click(ChkConsentForm));
	}

	// **
	public void selectBuisenessModel(String option1) {
		cm.javascriptExecutorScrollBar(BtnOtp);
		cm.generateLog("Select Buisness model DropDown",
				cm.selectDropDownOption(slctBM, option1, "text"));
	}

	public void clickOnEMI() {
		cm.generateLog("Scroll Down And Click On EMI",
				cm.javascriptExecutorScrollBar(ChkEmi));
		cm.click(ChkEmi);
	}

	public void clickOnSaveAndContinue() {
		cm.waitFor(5000);
		cm.checkElementDisplay(BtnSaveAndContinue);
		cm.generateLog("Click On save and Continue",
				cm.click(BtnSaveAndContinue));
	}

	// *-*-*-*-*-*-Methods-Personal and Demographic Details*-*-*-*-*-*-*

	public void SelectSameAsperm() {

		cm.waitFor(5000);

		cm.generateLog("select same as permenent",
				cm.click(selperm));
	}

	public void selectIdProof(String option) {
		cm.waitFor(5000);
		cm.generateLog("Scroll Up, Wait and Select IDproof dropdown",
				cm.javascriptExecutorScrollBar(SelIdProof));
		cm.waitFor(10000);
		cm.selectDropDownOption(SelIdProof, option, "text");
	}

	public void setIDProofExpiryDate(String value) {
		cm.generateLog("Set ID proof Expiry Date into textField",
				cm.waitFor(5000));
		cm.setText(InpIdProofExp, value);
	}

	public void setIDProofReferenceNumber(String number) {
		String random = cm.getRandomNumbers(9);
		number = number + random;
		cm.generateLog("Set ID proof reference number",
				cm.setText(InpReferenceNum, number));
	}

	public void uploadIDProof() {
		cm.waitFor(5000);

		cm.generateLog("click on Upload Document file",
				cm.click(BtnUploadFiles));
	}

	public void clickGender(String gender) {
		cm.waitFor(30000);

		By locator = By.xpath("//span[contains(text(),'Upload Files')]");
		cm.generateLog("Scroll on upload files",
				cm.javascriptExecutorScrollBar(locator));
		cm.waitFor(5000);

		// **
		By locator1 = By.xpath("//button[@aria-label='Gender, --None--']");
		cm.click(locator1);
		cm.waitFor(5000);
		By locator2 = By.xpath("//lightning-base-combobox-item//span[@title='" + gender + "']");
		cm.click(locator2);
	}

	public void SetDOB(String doB) {
		cm.generateLog("Scroll Down, Wait and Select DOB",
				cm.javascriptExecutorScrollBar(SDHO));
		cm.waitFor(5000);

		cm.generateLog("set DOB into textfield",
				cm.setText(DOB, doB));
	}

	public void setSDHWO(String fieldName) {
		// By locator1=By.xpath("//input[@name='Gender__c']");
		cm.click(SDHO);
		cm.waitFor(5000);
		By locator2 = By.xpath("//div//span[text()='" + fieldName + "']");
		cm.click(locator2);

	}

	public void setSDHOFirstName(String fname) {
		cm.waitFor(2000);

		cm.generateLog("set SDHO First Name into textfield",
				cm.setText(SDHOFirstName, fname));
		System.out.println(fname);
	}

	public void setSDHOMiddleName(String mname) {
		cm.waitFor(2000);

		cm.generateLog("set SDHO First Name into textfield",
				cm.setText(SDHOMiddleName, mname));
		System.out.println(mname);

	}

	public void setSDHOLastName(String lname) {
		cm.waitFor(2000);

		cm.generateLog("set SDHO First Name into textfield",
				cm.setText(SDHOLastName, lname));
		System.out.println(lname);

	}

	public void setCreditCardNumber(String crNumber) {

		cm.generateLog("Set credit card number into textfield",
				cm.javascriptExecutorScrollBar(InpCreditCard));
		cm.waitFor(5000);
		cm.setText(InpCreditCard, crNumber);
	}

	public void setCreditCardBank(String bank) {
		// By locator=By.xpath("InpCreditCardBank");
		cm.generateLog("Click On Credit Card bank Textfield",
				cm.click(InpCreditCardBank));
		cm.waitFor(5000);
		By locator1 = By.xpath("//lightning-base-combobox-item//span[@title='" + bank + "']");
		cm.generateLog("choose credit card bank from the dropdown",
				cm.click(locator1));
	}

	public void setMaritalStatus(String mStatus) {
		cm.generateLog("Click On Marital status",
				cm.click(InpMaritalStatus));
		cm.waitFor(5000);
		By locator1 = By.xpath("//div//span[text()='" + mStatus + "']");
		cm.generateLog("choose marital status from the dropdown",
				cm.click(locator1));
	}

//-*-*-*-*-*-*-*-*-Demographic Details-*-*-*-*-*-*-*-*-	

	public void clickOnDemographicDetails() {
		cm.generateLog("click on Demographic details link",
				cm.click(lnkDemographics));
	}

	public void selectAddressProof(String soption) {
		cm.waitFor(5000);
		cm.generateLog("Select SubBusiness Vertical DropDown",
				cm.selectDropDownOption(inpAddressProof, soption, "text"));
	}

	public void setAddressProofReference(String addReference) {
		String random = cm.getRandomNumbers(3);
		addReference = addReference + random;
		cm.generateLog("Set Address proof reference number",
				cm.setText(inpAddressProofRef, addReference));
	}

	public void selectOKyC(String Ooptions) {
		By OKYCL = By.xpath("(//button[@aria-label='OKYC Status, --None--'])[2]");
		cm.waitFor(5000);
		cm.generateLog("Click On OKYC status",
				cm.clickUsingJavaScript(OKYCL));
		cm.waitFor(10000);
		By locator189 = By.xpath("//lightning-base-combobox-item//span[@title='" + Ooptions + "']");
		cm.generateLog("choose Residence status from the dropdown",
				cm.click(locator189));
		System.out.println(locator189);

	}

	public void uploadAddressProof() {
		cm.generateLog("click on Upload Document file",
				cm.click(BtnUploadFile1));
		cm.waitFor(5000);

	}

	public void setPresentAddress1(String pAddress1) {
		cm.waitFor(2000);
		cm.generateLog("set presentAddress  into textfield",
				cm.setText(inpPresentAddress1, pAddress1));
		System.out.println(pAddress1);
	}

	public void setPresentAddress2(String pAddress2) {
		cm.waitFor(2000);
		cm.generateLog("set presentAddress2  into textfield",
				cm.setText(inpPresentAddress2, pAddress2));
		System.out.println(pAddress2);

	}

	public void setLandmark(String landmark) {
		cm.waitFor(2000);
		cm.generateLog("set LandMark into textfield",
				cm.setText(inpLandmark, landmark));
		System.out.println(landmark);

	}

	public void setPincode(String pincode) {
		cm.waitFor(2000);
		cm.generateLog("set Pincode into textfield",
				cm.setText(inpPincode, pincode));
		System.out.println(pincode);

	}

	public void selecDistC(String SelDist) {
		By SelDist1 = By.xpath("//button[@aria-label='Distance from Dealer, --None--']");
		cm.generateLog("Scroll Down till residence status textfield",
				cm.javascriptExecutorScrollBar(inpPincode));
		cm.waitFor(5000);
		cm.generateLog("Click on the distance",
				cm.clickUsingJavaScript(SelDist1));
		cm.waitFor(10000);
		By locator189 = By.xpath("//lightning-base-combobox-item//span[@title='" + SelDist + "']");
		cm.generateLog("choose Residence status from the dropdown",
				cm.click(locator189));
		System.out.println(locator189);

	}

	// -*-*-*-*-*-*-*-*-Permanent Address if required -*-*-*-*-*-*-*-*-
	public void setResidenceStatus(String ResidenceStatus) {
//		By srcloc=By.xpath("//button[@aria-label='Distance from Dealer, --None--']");
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

	public void setResidingSince(String resSince) {
		cm.generateLog("Set residing into textfield",
				cm.setText(inpResiding, resSince));
	}

	public void setPropertyStatus(String pStatus) {
		cm.waitFor(5000);
		cm.javascriptExecutorScrollBar(inpPincode);
		cm.waitFor(5000);
		cm.generateLog("Click On Property status",
				cm.click(inpPropertyStatus));
		cm.waitFor(5000);
		By locator122 = By.xpath("(//div//span[text()='Owned'])[2]");
		cm.generateLog("choose Residence status from the dropdown",
				cm.click(locator122));
		System.out.println(locator122);
	}

	public void setPermentaddrs(String PRStatus) {
		By locator444 = By.xpath("//textarea[@name='AdditionalPresentAddressDetails__c']");
		cm.waitFor(5000);
		cm.javascriptExecutorScrollBar(locator444);
		cm.waitFor(5000);
		cm.generateLog("Click On Permenent adress proof",
				cm.click(SltDDadrsproof));
		cm.waitFor(5000);
		// **[2] (//button[@id='combobox-button-7111'])[1]
		// By locator122=By.xpath("(//button[@id='combobox-button-7111'])[1]");
		By locator141 = By.xpath(
				"//select[@name='addressProofPicklist']/option[@value='209' and text()='Letter Issued by National Population Register']");
		cm.generateLog("choose Residence status from the dropdown",
				cm.clickUsingJavaScript(locator141));
		// click(locator141));
		System.out.println(locator141);
	}

	void PRsetAddressProofReference(String addReference) {
		String random = cm.getRandomNumbers(9);
		addReference = addReference + random;
		cm.generateLog("Set Address proof reference number",
				cm.setText(PRNUM, addReference));

	}

	public void PRuploadAddressProof() {
		cm.generateLog("click on Upload Document file",
				cm.click(PRbtn));
		cm.waitFor(5000);

	}

	public void PRsetPresentAddress1(String pAddress1) {
		cm.waitFor(2000);
		cm.generateLog("set presentAddress  into textfield",
				cm.setText(PRA1, pAddress1));
		System.out.println(pAddress1);
	}

	public void PRsetPresentAddress2(String pAddress2) {
		cm.waitFor(2000);
		cm.generateLog("set presentAddress2  into textfield",
				cm.setText(PRA2, pAddress2));
		System.out.println(pAddress2);

	}

	public void PRsetLandmark(String landmark) {
		cm.waitFor(2000);
		cm.generateLog("set LandMark into textfield",
				cm.setText(PRL1, landmark));
		System.out.println(landmark);

	}

	public void PRsetPincode(String pincode) {
		cm.waitFor(2000);
		cm.generateLog("set Pincode into textfield",
		cm.setText(PRPC1, pincode));
		System.out.println(pincode);

	}

	public void clickOnSaveAndContinue1() {
		cm.generateLog("Click on button save and continue",
		cm.click(btnSaveAndContinue1));
	}

	// *-*-*-*-*-*-*-Employment Details*-*-*--*-*-
	
	
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
	//-*-*-*-*-*-*-*-*-Loan And Scheme Details -*-*-*-*-*-*-*-*-	
	public void setModel(String model) {
		cm.waitFor(3000);

		cm.generateLog("Set model in textfield",cm.click(inpSearchProduct));
		cm.waitFor(5000);
		cm.setText(inpSearchProduct, model);
		cm.waitFor(5000);
		By locator = By.xpath("//mark[text()='" + model + "']");
		cm.click(locator);

		// **-*-*-*-*-*-SET Customer Sub Category-*-*-*-*-*	
		By CSC = By.xpath("//button[@aria-label='Customer Sub Category, --None--']");
		By CSCOP = By.xpath("//span[@title='FTB - OPEN SOURCE']");
		cm.generateLog("Set Customer Sub Category",
		cm.click(CSC));
		cm.waitFor(5000);
		cm.click(CSCOP);
	}

	public void clickOnSchemeDetails() {
		cm.generateLog("Click on Scheme Details link",
		cm.click(lnkSchemeDetails));
	}

	public void setSchemeCode(String code) {
		cm.generateLog("Set model in textfield",
				cm.click(inpSearchProduct));
		cm.waitFor(5000);
		cm.setText(inpSearchProduct, code);
		cm.waitFor(7000);
		By locator = By.xpath("//mark[text()='" + code + "']/parent::span");
		cm.click(locator);
	}

	// *-*-*-*-*-*-Finance Details*-*-*-*-*-*
	public void setRepaymentMode(String foption) {
		By locator133 = By.xpath("//select[@class='slds-select']");
		cm.waitFor(5000);
		cm.generateLog("Select SubBusiness Vertical DropDown",
		cm.javascriptExecutorScrollBar(locator133));
		cm.waitFor(5000);
		cm.click(selRepaymentMode);
		// selectDropDownOption(selRepaymentMode, foption, "text");
	}

	public void setAmountFinanced(String financeValue) {

		By locator112233 = By.xpath("//input[@name='amountFinanced']");
		cm.generateLog("scroll to up for finanace details",
		cm.javascriptExecutorScrollBar(locator112233));
		cm.generateLog("scroll to up for finanace details02",
		cm.clickUsingJavaScript(locator112233));
		cm.waitFor(5000);
		cm.generateLog("Set Finance amount into Textfield",
		cm.setText(inpAmountFinanced, financeValue));
	}

	public void setTenure(String tenure) {
		cm.generateLog("Set tenure period in TextField",
		cm.setText(inpTenure, tenure));
	}

	public void SetROI(String roi) {
		cm.generateLog("Set Rate Of Interest in TextField",
		cm.setText(inpROI, roi));
		// cm.waitFor(10000);

	}

	public void clickOnBankingDatails() {
		cm.waitFor(7000);
		cm.generateLog("click on Banking details links",
		cm.waitFor(5000));
		cm.click(lnkBankingDetails);

	}

	public void selectRepaymentFrom(String repayment) {
		cm.generateLog("click on Repaymentfrom textfield",
		cm.click(inpRepaymentFrom));
		cm.waitFor(5000);
		By locator = By.xpath("//lightning-base-combobox-item//span[text()='" + repayment + "']");
		cm.generateLog("select repayment option from list",
			cm.click(locator));
	}

	public void clickOnLnkHeaderCoApplicantGuarantor() {

		cm.waitFor(5000);
		cm.generateLog("Click on header link of CoApplicant/Guarantor",
		cm.clickUsingJavaScript(lnkHeaderCoApplicantGuarantor));
		// click(lnkHeaderCoApplicantGuarantor));
	}

	public void clickonbtnMarkAsComplete() {
		cm.waitFor(5000);

		cm.generateLog("Click on Mark Stage as complete",
		cm.clickUsingJavaScript(btnMarkAsComplete));
	}

	public void clickonSaveOK() {

		By locator555 = By.xpath("//button[@title='Save']");
		cm.waitFor(5000);

		cm.generateLog("Click on save OK",
				cm.clickUsingJavaScript(locator555));
	}

}
