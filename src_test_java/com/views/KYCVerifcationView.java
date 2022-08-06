package com.views;


import com.pages.KYCVerificationPage;


public class KYCVerifcationView {
	
		KYCVerificationPage KycPage= new KYCVerificationPage();


		
		public void KYCVerification(String UserName,String Password){
			KycPage.clickOnBtnSentTo3M();
			KycPage.clickOnBtnMarkAsCurrentStage();
			KycPage.clickOnImgUser();
			KycPage.clickOnLogOut();
			
			
			//objLoginView.doLogin(UserName, Password);
		}
		
}
