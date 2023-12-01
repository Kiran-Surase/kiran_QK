package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;
	public ConfigDataProvider() throws IOException {
		
		String ConfigPath=System.getProperty("user.dir")+"\\Config\\Config.Properties";
	
	    FileInputStream file=new FileInputStream(ConfigPath);
	    pro=new Properties();
	    pro.load(file);
	}
	
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}

}
