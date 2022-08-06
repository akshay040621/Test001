package com.pages;

import org.openqa.selenium.By;

import com.utilities.CommonFunctions;


public class AccountsPage extends CommonFunctions {
	
	CommonFunctions cm = new CommonFunctions();
	
	//*-*-*-*--*-*-*-Locators*-*-*-*--*-*-*-
	
	By Accounts = By.xpath("//a[(@title='Accounts')]/following-sibling::one-app-nav-bar-item-dropdown/*[1]");
	By NewAccounts=By.xpath("//span[contains(text(),'New Account')]//preceding-sibling::lightning-icon/lightning-primitive-icon");
	By PersonAccount=By.xpath("//div[@class='changeRecordTypeOptionRightColumn']//span[text()='Person Account']");
	By BtnNext=By.xpath("//button[@class='slds-button slds-button--neutral slds-button slds-button_brand uiButton']//span[text()='Next']");
	By Salutation=By.xpath("//div[contains(@class,'salutation compoundTLRadius')]");
	By FirstName=By.xpath("//input[@placeholder='First Name']");
	By LastName=By.xpath("//input[@placeholder='Last Name']");
	By MobileNumber=By.xpath("//span[contains(text(),'Mobile Number')]//parent::label/following-sibling::input");
	By BtnSave=By.xpath("//button[@title='Save']");
	//a[contains(@title, 'Mr')
	
	
	
	
	public void clickOnAccounts(){
		cm.waitFor(3000);

		cm.generateLog("Click On Accounts link",
				cm.click(Accounts));
	}
	public void clickOnNewAccounts(){
		cm.waitFor(5000);
		cm.generateLog("Click On New Accounts", 
				cm.click(NewAccounts));
	  }
	public void clickOnPersonAccount(){
		cm.waitFor(3000);

		cm.generateLog("Click On Person Account",
				cm.click(PersonAccount));
	}
	public void clickOnBtnNext(){
		cm.generateLog("Click On Next button",
				cm.click(BtnNext));
	}
	
	
	public void clickOnSalutation(){
		cm.waitFor(3000);

		cm.generateLog("Click On Salutation List ",
				cm.click(Salutation));
		cm.waitFor(3000);

	}
	
	
	public void clickOnSalutaionArrow(String value) {
		cm.waitFor(3000);

		By locator = By.xpath("//div//ul//li//a[text()='"+value+"']");
		cm.generateLog("Click on Salutation's chevron-down",value,
				cm.click(locator));
	}
	public void setFirstName(String value){
		cm.generateLog("Set first name Into the textField",value,
				cm.setText(FirstName, value));
	}
	public void setLastName(String value){
		cm.generateLog("Set last name into textfield", value,
				cm.setText(LastName, value));
	}
	public void setMobileNumber(String value){
		cm.waitFor(3000);

		String random=cm.getRandomNumbers(9);
		value=value+random;
		cm.generateLog("Set Mobile number into textfield",value,
				cm.setText(MobileNumber, value));
	}
	public void clickOnSave(){
		cm.waitFor(3000);

		cm.generateLog("Click on save button",
				cm.click(BtnSave));
		cm.waitFor(5000);

		
	}
}
