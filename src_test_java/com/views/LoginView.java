package com.views;

import com.pages.LoginPage;
import com.utilities.CommonFunctions;


public class LoginView {
		LoginPage LoginP = new LoginPage();
		CommonFunctions cm = new CommonFunctions();

	// *-*-*-*--*-*-*- Mehtods*-*-*-*--*-*-*-
	public void doLogin(String value1, String value2) {
		cm.waitFor(10000);

		LoginP.setUserName(value1);
		LoginP.setpassword(value2);
		LoginP.clickOnbtnLogin();
	}
}
