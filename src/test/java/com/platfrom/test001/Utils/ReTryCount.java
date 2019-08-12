package com.platfrom.test001.Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Administrator on 2019/8/9.
 */
/*
定义失败重跑次数
 */

public class ReTryCount implements IRetryAnalyzer {
    int index = 0;
    //失败重跑次数
    int reTryCount = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (index < reTryCount) {
            index++;
            return true;
        }
        return false;
    }
}
