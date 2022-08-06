package com.script;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BaseTest;
import com.utilities.CommonFunctions;
import com.utilities.ReadConfig;
import com.views.AccountView;
import com.views.CreateEnquiryView;
import com.views.KYCVerifcationView;
import com.views.LoginAuthView;
import com.views.LoginView;
import com.views.PreApprovalView;

public class TestCase extends BaseTest {
	CommonFunctions cm = new CommonFunctions();
	LoginView LV= new LoginView();
	AccountView AV = new AccountView();
	CreateEnquiryView CEV = new CreateEnquiryView();
	ReadConfig RC = new ReadConfig();
	
	private Hashtable<String, String> testData=null;
	


	@BeforeClass(groups={"P1"})//8080856557
	public void initialization(){	
		//driver.get("http://test.salesforce.com/");
		this.initialization("http://test.salesforce.com/");
		//this.initializeViewsAndPages();
		testData = cm.readExcelData("TCID_01");
		LV.doLogin(RC.getUsername(),RC.getPass());

	}
	@Test(priority=1,enabled=true,groups={"P1"})
	public void TCID_01(){
		AV.personalAccountsCredentials(testData.get("Salutaion"),testData.get("FirstName"),testData.get("LastName"),testData.get("Mobile"));
		CEV.sourcing(testData.get("SupplierName"),testData.get("SharedWith"),testData.get("Sub-BussinessVertical"),testData.get("BM"));
		CEV.personalAndDemographicDetails(testData.get("ID-Proof"),testData.get("ID-ProofExpiryDate"),
				testData.get("ID-ProofREferenceNumber"),testData.get("IDProofFile"),testData.get("Gender"),testData.get("DOB"),
				testData.get("SDHO"),testData.get("SDHOFirstName"),testData.get("SDHOMiddleName"),testData.get("SDHOLastName"),
				testData.get("CreditCardNumber"),testData.get("CreditCardBank"),testData.get("MaritalStatus"),
				testData.get("AddressProof"),testData.get("AddressReference"),testData.get("Ooptions"),testData.get("AddressproofFile"),testData.get("Address1"),
				testData.get("Address2"),testData.get("LandMark"),testData.get("PinCode"),testData.get("SelDist"),testData.get("ResidenceStatus"),
				testData.get("ResidingSince"),testData.get("PropertyStatus"),testData.get("PRS"));
		CEV.employmentDetails(testData.get("employment"),testData.get("Type Of Emplyment"),
				testData.get("Net Income"),testData.get("company"),testData.get("WorkingSince"));	
		CEV.loanDetails(testData.get("Model"));
		CEV.schemeDetails(testData.get("SchemeCode"));
		CEV.financeDetails(testData.get("FinanceAmount"),testData.get("Tenure"),testData.get("ROI"),testData.get("RepaymentMode"),testData.get("ApplicantOrGuarantor"));
		
		
		
		CEV.coApplicant(testData.get("ApplicantRadioButton"),testData.get("Constitution"),testData.get("Mobile"),testData.get("ID-Cproof"),testData.get("ID-ProofREferenceNumber"),testData.get("ID-ProofExpiryDate"),
				testData.get("IDProofFile"),testData.get("Gender"),testData.get("Salutaion"),testData.get("SDHOFirstName"),testData.get("SDHOLastName"),
				testData.get("DOB"),testData.get("FirstName"),
				testData.get("CaddressProof"),testData.get("CaddressReference"),testData.get("Ooptions"),testData.get("AddressproofFile"),testData.get("ResidingSince"),testData.get("ResidenceStatus"),testData.get("employment"),testData.get("Type Of Emplyment"),
				testData.get("Net Income"),testData.get("company"),testData.get("WorkingSince"),"","");
		
		
		
		//CEV.guarantor(testData.get("GuarantorRadioButton"),testData.get("ID-ProofREferenceNumber"),testData.get("ID-ProofExpiryDate"),testData.get("SDHOFirstName"),testData.get("SDHOMiddleName"),testData.get("SDHOLastName"),"","","","","","","","");
		
		
		
		CEV.markStageComplete(testData.get("SelDist"));
	}
//	@Test(priority=1,enabled=true,groups={"P1"})
//	public void TCID_02(){
//		//objKYCVerificationView.KYCVerification(testData.get("UserName"),testData.get("Password"));
//	}
//	
//	@Test(priority=1,enabled=true,groups={"P1"})
//	public void TCID_02(){
//		objLoginAuthView.searchUID(testData.get("uID"),testData.get("Broker"));
//		objLoginAuthView.personalAndDemographicDetails(testData.get("mAddress"),testData.get("Language"),testData.get("noOfVehicle"));
//		objLoginAuthView.loginAuthEmploymentDetails(testData.get("natureOfBusiness"),
//				testData.get("empAddress1"),testData.get("empAddress2"),testData.get("empLandmark"),testData.get("empPincode"),
//				/*testData.get("empCity"),testData.get("empState"),*/
//				testData.get("contactNo"),testData.get("busProof"));
//		objLoginAuthView.referenceDetails(testData.get("refName1"),testData.get("refmobile1"),testData.get("RefAddress1"),
//				testData.get("RefPinCode1"),testData.get("RefRelationWithApplicant1"),testData.get("refTVRStatus1"),
//				testData.get("refName2"),testData.get("refmobile2"),testData.get("RefAddress2"),testData.get("RefPinCode2"),
//				testData.get("refRelApp2"),testData.get("refTVRStatus2"));
//		objLoginAuthView.incomeDetails(testData.get("FirstMonthBankfirst"),testData.get("FirstMonthBankfifteen"),testData.get("FirstMonthBanktwentyfifth"),
//				testData.get("SecondMonthBankfirst"),testData.get("SecondMonthBankfifteen"),testData.get("SecondMonthBanktwentyfifth"),
//				testData.get("ThirdMonthBankFirst"),testData.get("ThirdMonthBankfifteen"),testData.get("ThirdMonthBankTwentyFifth"),
//				testData.get("FourthMonthBankFirst"),testData.get("FourthMonthBankFifteen"),testData.get("FourthMonthBankTwentyfifth"),
//				testData.get("FifthMonthBankFirst"),testData.get("FifthMonthBankFifteen"),testData.get("FifthMonthBankTwentyfifth"),
//				testData.get("SixthMonthBankFirst"),testData.get("SixthMonthBankFifteen"),testData.get("SixthMonthBankTwentyfifth"),
//				testData.get("validatedincome"));
//		objLoginAuthView.loanDetails(testData.get("lpoRequired"));
//		objLoginAuthView.financeDetails(testData.get("additionalCharge"));
//	}
//	@Test(priority=1,enabled=false,groups={"P1"})
//	public void TCID_03(){
//		objPreApprovalView.PreApprovalDocs(testData.get("uID"), testData.get("incomeProof"),testData.get("IncomeDoc"));
//	}
}






