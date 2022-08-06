package com.views;

import com.pages.AccountsPage;


public class AccountView {
	AccountsPage AccPage = new AccountsPage();
	
	public void personalAccountsCredentials(String sal,String firstname,String lastname,String mobile){
		AccPage.clickOnAccounts();
		AccPage.clickOnNewAccounts();
		AccPage.clickOnPersonAccount();
		AccPage.clickOnBtnNext();
		AccPage.clickOnSalutation();
		AccPage.clickOnSalutaionArrow(sal);
		AccPage.setFirstName(firstname);
		AccPage.setLastName(lastname);
		AccPage.setMobileNumber(mobile);
		AccPage.clickOnSave();
	}
	
	


}
