package com.pages;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;
import com.utilities.ReadConfig;


public class LoginPage {
	CommonFunctions cm = new CommonFunctions();
	//*-*-*-*--*-*-*-Locators*-*-*-*--*-*-*-
	By pageLogo=By.id("logo");
	By username=By.id("username");
	By password=By.id("password");
	By btnLogInToSandbox=By.id("Login");
	
	
	//*-*-*-*--*-*-*-Methods*-*-*-*--*-*-*-
	
	public void setUserName(String value){
		cm.generateLog("Set Usrname in textfield",
		cm.setText(username, value));
	}
	public void setpassword(String value){
		cm.generateLog("Set password in textfield",
		cm.setText(password, value));
	}
	public void clickOnbtnLogin(){
		cm.generateLog("Click On Login button",
		cm.click(btnLogInToSandbox));
	}
	
	}

