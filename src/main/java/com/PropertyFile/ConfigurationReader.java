package com.PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File(
				"C:\\Users\\heman\\eclipse-workspace\\RunnerClass_MiniProject\\AutomationCredentials.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String geturl() throws IOException {

		String url = p.getProperty("url");
		return url;

	}

	public String getUserName() throws IOException {

		String userName = p.getProperty("userName");
		return userName;
	}

	public String getPass() throws IOException {

		String pass = p.getProperty("password");
		return pass;

	}
	
}
