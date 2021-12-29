package com.TestNG_RunnerClass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {

	public int start = 0;
	public int end = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (start < end) {
			start++;
			return true;
		}

		return false;
	}

}
