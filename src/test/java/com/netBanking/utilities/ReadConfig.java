package com.netBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() {
		
		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		
		
	}
	
	
	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String uname = prop.getProperty("userName");
		return uname;
	}
	
	public String getPassword() {
		String pwd = prop.getProperty("password");
		return pwd;
	}
	
	public String getChromepath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getIEpath() {
		String iepath = prop.getProperty("iepath");
		return iepath;
	}

}
