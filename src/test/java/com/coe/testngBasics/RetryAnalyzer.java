package com.coe.testngBasics;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0, maxLimit = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter<maxLimit){
            counter++;
            return true;
        }
        return false;
    }
}
