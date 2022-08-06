package com.views;


import com.pages.PreApprovalPage;
import com.utilities.CommonFunctions;


public class PreApprovalView {
	PreApprovalPage PAppro = new PreApprovalPage();
	CommonFunctions cm = new CommonFunctions();
	public void PreApprovalDocs(String uID,String incomeProof, String IncomeDoc ){
		PAppro.searchBox(uID);
		PAppro.clickOnUidLink();
		PAppro.clickOnBtnEdit();
		PAppro.selectIncomeProof(incomeProof);
		PAppro.uploadDSocument();
		cm.uploadFile(IncomeDoc);
		PAppro.clickOnBtnDone();

	}
	
}
