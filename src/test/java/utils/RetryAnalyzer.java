package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int count = 0;
    private static final int maxRetry = 1; // industry standard

    @Override
    public boolean retry(ITestResult result) {

        // 🔥 Retry ONLY if scenario has @flaky tag
        String testName = result.getName();

        if (testName.contains("flaky") && count < maxRetry) {
            count++;
            System.out.println("Retrying flaky test: " + testName);
            return true;
        }

        return false;
    }
}
