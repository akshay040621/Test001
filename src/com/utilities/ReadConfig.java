package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src = new File("C:\\Users\\LENOVO\\Desktop\\SFDC\\SFDC_AKD\\Configuration\\Config.properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("exception is"+ e.getMessage());
		}
	}

	public String getUsername() {
		String Url = pro.getProperty("username");
		return Url;
	}
	public String getPass() {
		String Url = pro.getProperty("password");
		return Url;
	}
	
}
