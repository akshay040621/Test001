package com.views;

import com.pages.CoApplicantAndGuarantorPage;
import com.pages.CreateEnquiryPage;
import com.utilities.CommonFunctions;


public class CreateEnquiryView {
	   CommonFunctions cm = new CommonFunctions();
	   CreateEnquiryPage EnqPage = new CreateEnquiryPage();
       CoApplicantAndGuarantorPage CoGaPage = new CoApplicantAndGuarantorPage();

	public void sourcing(String SupplierName, String SharedWith, String option, String option1) {

		try {
			EnqPage.clickOnBtnCreateEnquiry();
		} catch (Exception e) {

			e.printStackTrace();
		}
		EnqPage.setSupplierName();
		EnqPage.clickOnSupplierNameOptions(SupplierName);
		EnqPage.clickOnSharedWith();
		EnqPage.clickOnSharedWithOptions(SharedWith);
		EnqPage.selectSubBusinessVertical(option);
		EnqPage.clickOnGetOTP();
		EnqPage.clickOnConsentForm();
		EnqPage.selectBuisenessModel(option1);
		EnqPage.clickOnEMI();
		EnqPage.clickOnSaveAndContinue();
	}

	public void personalAndDemographicDetails(String option, String value, String Refnumber, String idProof,
			String gender, String doB, String fieldName, String fname, String mname, String lname, String crNumber,
			String bank, String mStatus, String soption, String addReference, String Ooption, String addressproof,
			String pAddress1, String pAddress2, String landmark, String pincode, String SelDist, String ResidenceStatus,
			String resSince, String pStatus, String PRStatus) {

		EnqPage.selectIdProof(option);
		EnqPage.setIDProofExpiryDate(value);
		EnqPage.setIDProofReferenceNumber(Refnumber);
		EnqPage.uploadIDProof();
		cm.uploadFile(idProof);
		EnqPage.clickGender(gender);
		EnqPage.SetDOB(doB);
		EnqPage.setSDHWO(fieldName);
		EnqPage.setSDHOFirstName(fname);
		EnqPage.setSDHOMiddleName(mname);
		EnqPage.setSDHOLastName(lname);
		EnqPage.setCreditCardNumber(crNumber);
		EnqPage.setCreditCardBank(bank);
		EnqPage.setMaritalStatus(mStatus);
		EnqPage.clickOnDemographicDetails();
		EnqPage.selectAddressProof(soption);
		EnqPage.setAddressProofReference(addReference);
		EnqPage.selectOKyC(Ooption);
		EnqPage.uploadAddressProof();
		cm.uploadFile(addressproof);
		EnqPage.setPresentAddress1(pAddress1);
		EnqPage.setPresentAddress2(pAddress2);
		EnqPage.setLandmark(landmark);
		EnqPage.setPincode(pincode);
		EnqPage.selecDistC(SelDist);
		EnqPage.setResidenceStatus(ResidenceStatus);
		EnqPage.setResidingSince(resSince);
		EnqPage.setPropertyStatus(pStatus);
		EnqPage.SelectSameAsperm();
//		*-*-*-*--*-*-*- IF permanent Address comes in Picture*-*-*-*--*-*-*- 
//		EnqPage.setPermentaddrs(PRStatus);
//		EnqPage.PRuploadAddressProof();
//		EnqPage.PRsetPresentAddress1(pAddress1);
//		EnqPage.PRsetPresentAddress2(pAddress2);
//		EnqPage.PRsetLandmark(landmark);
//		EnqPage.PRsetPincode(pincode);
		EnqPage.clickOnSaveAndContinue1();

	}

	public void employmentDetails(String employment, String tEmployment, String netIncome, String company,
			String workSince) {
		EnqPage.setPrimaryEmployment(employment);
		EnqPage.setTypeOfEmployment(tEmployment);
		EnqPage.setNetInCome(netIncome);
		EnqPage.setCompanyName(company);
		EnqPage.setWorkingSince(workSince);
		EnqPage.clickOnSaveAndContinue2();
	}

	public void loanDetails(String model) {
		EnqPage.setModel(model);
		EnqPage.clickOnSchemeDetails();
	}

	public void schemeDetails(String code) {
		EnqPage.setSchemeCode(code);
		EnqPage.clickOnSaveAndContinue();
	}

	public void financeDetails(String financeAmount, String tenure, String roi, String foption, String repayment) {

		EnqPage.setAmountFinanced(financeAmount);
		EnqPage.setTenure(tenure);
		EnqPage.SetROI(roi);
		EnqPage.setRepaymentMode(foption);
		EnqPage.clickOnBankingDatails();
		EnqPage.selectRepaymentFrom(repayment);
		EnqPage.clickOnSaveAndContinue();
		EnqPage.clickOnLnkHeaderCoApplicantGuarantor();
	}

	public void coApplicant(String radioValue,String constitution, String mobile, String IDproof, String refNumber, String ExpNumber, String IDProofFile,
			String gender, String salutation, String coFirstName, String coLastName, String doB, String coFatherName,
			String addProof, String AddressReference, String Ooptions,String AddressproofFile, String residingSince, 
			String ResidenceStatus,String employment,String tEmployment,String netIncome,String company, String workSince,String addProofExp,String coReferenceNum ) {
		if (radioValue.equalsIgnoreCase("Yes")) {
			CoGaPage.clickOnCoApplicantYesRadioButton();
			EnqPage.clickOnSaveAndContinue();

			this.coApplicantForm(constitution, mobile, IDproof, refNumber, ExpNumber, IDProofFile, gender, salutation, coFirstName, coLastName, doB, coFatherName, 
					addProof,AddressReference, Ooptions, AddressproofFile, residingSince, ResidenceStatus, employment, tEmployment, netIncome, company, workSince);
			EnqPage.clickOnSaveAndContinue();

		} else if (radioValue.equalsIgnoreCase("No")) {
			CoGaPage.clickOnCoApplicantNoRadioButton();
			// EnqPage.clickOnSaveAndContinue();

		}
	}

	public void guarantor(String radioValue, String constitution, String mobile, String idProof, String refNumber,
			String ExpNumber, String gender, String salutation, String coFirstName, String coLastName, String doB,
			String coFatherName, String addProof, String coReferenceNum, String addProofExp, String residingSince,
			String workingSince) {
		if (radioValue.equalsIgnoreCase("Yes")) {
			CoGaPage.clickOnGuarantorYesRadioButton();
			EnqPage.clickOnSaveAndContinue();

			this.coApplicantForm(constitution, mobile, idProof, refNumber, ExpNumber, 
					idProof, gender, salutation, coFirstName, coLastName, doB, coFatherName, 
					addProofExp, coReferenceNum, addProofExp, coReferenceNum, doB, idProof, residingSince, coFatherName, 
					addProof, residingSince, workingSince);
			EnqPage.clickOnSaveAndContinue();

		} else if (radioValue.equalsIgnoreCase("No")) {
			CoGaPage.clickOnGuarantorNoRadioButton();
			CoGaPage.clickOnBtnDone();

		}
	}

	public void coApplicantForm(String constitution, String mobile, String IDproof, String refNumber, String ExpNumber, String IDProofFile,
			String gender, String salutation, String coFirstName, String coLastName, String doB, String coFatherName,
			String addProof, String AddressReference,String Ooptions,String AddressproofFile, String residingSince, 
			String ResidenceStatus,String employment,String tEmployment,String netIncome,String company, String workSince ){
		CoGaPage.setConstitution(constitution);
		CoGaPage.setCoApplicantMobileNumber(mobile);
		CoGaPage.ClickOnCoApplicantOTPBtn();
		CoGaPage.clickOnCoApplicantConsentForm();
		CoGaPage.selectCoApplicantIDProof(IDproof);
		CoGaPage.setCoApplicantIDReferenceNumber(refNumber);
		CoGaPage.setCoApplicantIDProofExpiry(ExpNumber);
		CoGaPage.uploadIDProof();
		cm.uploadFile(IDProofFile);
		CoGaPage.clickGender(gender);
		CoGaPage.clickOnSalutation(salutation);
		CoGaPage.setCoApplicantFirstName(coFirstName);
		CoGaPage.setCoApplicantLastName(coLastName);
		CoGaPage.SetCoApplicantDOB(doB);
		CoGaPage.setCoApplicantFatherName(coFatherName);
		CoGaPage.clickOnCoApplicantDemographicDetails();
		CoGaPage.selectCoApplicantAddressProof(addProof);
		CoGaPage.CsetCoApplicantAddresProofReference(AddressReference);
		CoGaPage.selectOKyC(Ooptions);
		CoGaPage.uploadAddressProof();
		cm.uploadFile(AddressproofFile);
		CoGaPage.clickCheckBox();
		CoGaPage.setCoApplicantResidingsince(residingSince);
		CoGaPage.setResidenceStatus(ResidenceStatus);
		CoGaPage.ClockonSaveAndCon();
		CoGaPage.setPrimaryEmployment(employment);
		CoGaPage.setTypeOfEmployment(tEmployment);
		CoGaPage.setNetInCome(netIncome);
		CoGaPage.setCompanyName(company);
		CoGaPage.setWorkingSince(workSince);
		CoGaPage.clickOnSaveAndContinue2();
		//CoGaPage.selectCoApplicantAddressProof(addProof);
		//CoGaPage.setCoApplicantAddresProofReference(coReferenceNum);
		//CoGaPage.setCoApplicantAddresProofExp(addProofExp);
//		CoGaPage.setCoApplicantResidingsince(residingSince);
//		EnqPage.clickOnSaveAndContinue();
//		CoGaPage.setCoApplicantWorkingsince(workingSince);

	}

	public void markStageComplete(String SelDist) {
		EnqPage.clickonbtnMarkAsComplete();
		EnqPage.selecDistC(SelDist);
		EnqPage.clickonSaveOK();
	}

}
