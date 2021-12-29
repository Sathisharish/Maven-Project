package com.PropertyFile;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getFrm() {

		FileReaderManager frm = new FileReaderManager();
		return frm;

	}

	public ConfigurationReader getConfigurationReader() throws IOException {

		ConfigurationReader cr = new ConfigurationReader();

		return cr;

	}

}
