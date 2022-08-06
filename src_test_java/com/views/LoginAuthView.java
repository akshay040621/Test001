package com.views;

import com.pages.CreateEnquiryPage;
import com.pages.LoginAuthPage;


public class LoginAuthView {
	
	LoginAuthPage logAuth = new LoginAuthPage(); 
	CreateEnquiryPage EnqPage = new CreateEnquiryPage();

	public void searchUID(String uID,String sBroker){
		logAuth.searchBox(uID);
		logAuth.clickOnUidLink();
		logAuth.clickOnButtonEdit();
		logAuth.selectBroker(sBroker);
		EnqPage.clickOnSaveAndContinue();
	}
	public void personalAndDemographicDetails(String mAddress,String language,String noOfVehicle){
		logAuth.setMailingAddress(mAddress);
		logAuth.setLanguage(language);
		logAuth.setVehicleOwned(noOfVehicle);
		logAuth.clickOnDemographicDetails();
		logAuth.clickOnAddressYesRadioBtn();
		EnqPage.clickOnSaveAndContinue();
	}
	public void loginAuthEmploymentDetails(String natureOfBusiness,
			String empAddress1,String empAddress2,String empLandmark,
			String empPincode,/*String empCity,String empState,*/
			String contactNo,String busProof){
		logAuth.setNatureOfBusiness(natureOfBusiness);
		logAuth.setEmpAddress1(empAddress1);
		logAuth.setEmpAddress2(empAddress2);
		logAuth.setEmpLandmark(empLandmark);
		logAuth.setEmpPincode(empPincode);
		//logAuth.setEmpCity(empCity);
		//logAuth.setEmpState(empState);
		logAuth.setEmpContactNumber(contactNo);
		logAuth.setBusProofAvail(busProof);
		EnqPage.clickOnSaveAndContinue();

	}
	public void referenceDetails(String refName1,String refmobile1,String RefAddress1,String RefPinCode1,
			String refRelApp1,String refTVRStatus1,String refName2,String refmobile2,String RefAddress2,String RefPinCode2,
			String refRelApp2,String refTVRStatus2){
		logAuth.SetRefName1(refName1);
		logAuth.setRefMobile1(refmobile1);
		logAuth.setRefAddress1(RefAddress1);
		logAuth.setRefPinCode1(RefPinCode1);
		logAuth.setRefRelationWithApplicant1(refRelApp1);
		logAuth.setTVRStatus1(refTVRStatus1);
		logAuth.SetRefName2(refName2);
		logAuth.setRefMobile2(refmobile2);
		logAuth.setRefAddress2(RefAddress2);
		logAuth.setRefPinCode2(RefPinCode2);
		logAuth.setRefRelationWithApplicant2(refRelApp2);
		logAuth.setTVRStatus2(refTVRStatus2);
		EnqPage.clickOnSaveAndContinue();
	}
	public void incomeDetails(String FirstMonthBankfirst,String FirstMonthBankfifteen,String FirstMonthBanktwentyfifth,
			String SecondMonthBankfirst,String SecondMonthBankfifteen,String SecondMonthBanktwentyfifth,
			String ThirdMonthBankFirst,String ThirdMonthBankfifteen,String ThirdMonthBankTwentyFifth,
			String FourthMonthBankFirst,String FourthMonthBankFifteen,String FourthMonthBankTwentyfifth,
			String FifthMonthBankFirst,String FifthMonthBankFifteen,String FifthMonthBankTwentyfifth,
			String SixthMonthBankFirst,String SixthMonthBankFifteen,String SixthMonthBankTwentyfifth,
			String validatedincome){
		logAuth.SetFirstMonthBankBalFirst(FirstMonthBankfirst);
		logAuth.SetFirstMonthBankBalFifteen(FirstMonthBankfifteen);
		logAuth.SetFirstMonthBankBalTwentyfifth(FirstMonthBanktwentyfifth);
		logAuth.SetSecondMonthBankBalFirst(SecondMonthBankfirst);
		logAuth.SetSecondMonthBankBalFifteen(SecondMonthBankfifteen);
		logAuth.SetSecondMonthBankBalTwentyfifth(SecondMonthBanktwentyfifth);
		logAuth.SetThirdMonthBankBalFirst(ThirdMonthBankFirst);
		logAuth.SetThirdMonthBankBalFifteen(ThirdMonthBankfifteen);
		logAuth.SetThirdMonthBankBalTwentyFifth(ThirdMonthBankTwentyFifth);
		logAuth.SetFourthMonthBankBalFirst(FourthMonthBankFirst);
		logAuth.SetFourthMonthBankBalFifteen(FourthMonthBankFifteen);
		logAuth.SetFourthMonthBankBalTwentyFifth(FourthMonthBankTwentyfifth);
		logAuth.SetFifthMonthBankBalFirst(FifthMonthBankFirst);
		logAuth.SetFifthMonthBankBalFifteen(FifthMonthBankFifteen);
		logAuth.SetFifthMonthBankBalTwentyFifth(FifthMonthBankTwentyfifth);
		logAuth.SetSixthMonthBankBalFirst(SixthMonthBankFirst);
		logAuth.SetSixthMonthBankBalFifteen(SixthMonthBankFifteen);
		logAuth.SetSixthMonthBankBalTwentyFifth(SixthMonthBankTwentyfifth);
		logAuth.SetValidatedIncome(validatedincome);
		EnqPage.clickOnSaveAndContinue();
	}
	
	public void loanDetails(String lpoRequired){
		logAuth.selectLPORequired(lpoRequired);
		EnqPage.clickOnSaveAndContinue();
		}
	public void financeDetails(String additionalCharge){
		logAuth.SetAdditinalCharge(additionalCharge);
		logAuth.clickOnBtnDone();
		//logAuth.clickOnBtnMarkAsComplete();
		
	}
	
	
	
	
}
