package com.platfrom.test001.Utils;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/8/9.
 */
/*
失败重跑监听器
 */
public class ReRunListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer iRetryAnalyzer= iTestAnnotation.getRetryAnalyzer();
        if (iRetryAnalyzer == null){
            iTestAnnotation.setRetryAnalyzer(ReTryCount.class);
        }

    }

}
